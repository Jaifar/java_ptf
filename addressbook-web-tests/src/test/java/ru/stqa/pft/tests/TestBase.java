package ru.stqa.pft.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.appmanager.ApplicationManager;
import ru.stqa.pft.appmanager.ContactHelper;

/**
 * Created by Owner on 6/22/2016.
 */


public class TestBase {
  protected final ApplicationManager app;
  protected final ContactHelper contactHelper = new ContactHelper();
  FirefoxDriver wd;
  private String username;
  private String password;


  public TestBase() {

    FirefoxDriver wd = null;
    app = new ApplicationManager(wd);

  }


  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  public void login(String username, String password) {
    this.username = username;
    this.password = password;
    wd.get("http://localhost/addressbook/edit.php");
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).sendKeys("\\undefined");
    wd.findElement(By.id("nav")).click();
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.cssSelector("label")).click();
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }

  public void logOut() {
    wd.findElement(By.linkText("Logout")).click();
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).sendKeys("\\undefined");
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).sendKeys("\\undefined");
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }


  public ContactHelper getContactHelper() {
    return contactHelper;
  }

  protected void fillOutContactForm() {
      wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[4]/td[8]/a/img")).click();
      wd.findElement(By.name("nickname")).click();
      wd.findElement(By.name("nickname")).clear();
      wd.findElement(By.name("nickname")).sendKeys("Jaifar Jaifar");
      wd.findElement(By.xpath("//div[@id='content']/form[1]")).click();
      wd.findElement(By.name("homepage")).click();
      wd.findElement(By.name("homepage")).clear();
      wd.findElement(By.name("homepage")).sendKeys("www.facebook.com");
      wd.findElement(By.xpath("//div[@id='content']/form[1]/input[22]")).click();
      wd.findElement(By.linkText("home page")).click();
  }
}