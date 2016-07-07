package ru.stqa.pft.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.appmanager.ApplicationManager2;

/**
 * Created by Owner on 7/7/2016.
 */
public class TestBase2 {

  protected final ApplicationManager2 app = new ApplicationManager2();

  FirefoxDriver wd;

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

  protected void logOut() {
      wd.findElement(By.linkText("Logout")).click();
      wd.findElement(By.name("pass")).click();
      wd.findElement(By.name("pass")).sendKeys("\\undefined");
      wd.findElement(By.name("user")).click();
      wd.findElement(By.name("user")).sendKeys("\\undefined");
  }

  public void returnToHomePage() {
      wd.findElement(By.xpath("//div[@id='content']/form[1]/input[22]")).click();
      wd.findElement(By.linkText("home")).click();
  }

  public void editContact() {
      wd.findElement(By.name("lastname")).click();
      wd.findElement(By.name("lastname")).clear();
      wd.findElement(By.name("lastname")).sendKeys("Kravchuk-Stryjewski");
  }

  public void returnHomePage() {
      wd.findElement(By.linkText("home page")).click();
  }

  public void submitEdition() {
      wd.findElement(By.xpath("//div[@id='content']/form[1]")).click();
      wd.findElement(By.xpath("//div[@id='content']/form[1]/input[22]")).click();
  }

  public void editName() {
      wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();
      wd.findElement(By.name("lastname")).click();
      wd.findElement(By.name("lastname")).clear();
      wd.findElement(By.name("lastname")).sendKeys("Kravchuk-Stryjewski");
  }
}

