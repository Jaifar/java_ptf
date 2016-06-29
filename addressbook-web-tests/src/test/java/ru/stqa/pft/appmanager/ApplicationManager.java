package ru.stqa.pft.appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

/**
 * Created by Owner on 6/23/2016.
 */
public class ApplicationManager {
  FirefoxDriver wd;
  public final ApplicationManager app;

  {
    app = new ApplicationManager(wd);
  }

  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private FirefoxDriver browser;
  public ContactHelper contactHelper;

  public ApplicationManager(FirefoxDriver browser) {

    ApplicationManager.this.browser = browser;
    contactHelper = new MyContactHelper();
  }

  public ApplicationManager() {

    contactHelper = new MyContactHelper();
  }

  public void testSetUp1() throws Exception {

  }

  public void returnToHomePage() {
    wd.findElement(By.linkText("home page")).click();
  }

  public GroupHelper getGroupHelper() {
    return ApplicationManager.this.groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return ApplicationManager.this.navigationHelper;
  }

  public void init() {

  }

  public void stop() {

  }

  private class MyContactHelper extends ContactHelper {
    public void init() {
      if (browser.equals(BrowserType.FIREFOX)) {
        wd = new FirefoxDriver();
      } else if (browser.equals(BrowserType.CHROME)) {
        wd = new ChromeDriver();
      } else if (browser.equals(BrowserType.IE)) {
        wd = new InternetExplorerDriver();
      }
      wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      wd.get("http://localhost/addressbook/group.php");

      ApplicationManager.this.groupHelper = new GroupHelper(wd);
      ApplicationManager.this.navigationHelper = new NavigationHelper(wd);
      ApplicationManager.this.sessionHelper = new SessionHelper(wd);
      ApplicationManager.this.sessionHelper.login("admin", "secret");

    }

    public void login(String username, String password) {
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

    public void logout() {
      wd.findElement(By.linkText("Logout")).click();
      wd.findElement(By.name("pass")).click();
      wd.findElement(By.name("pass")).sendKeys("\\undefined");
      wd.findElement(By.name("user")).click();
      wd.findElement(By.name("user")).sendKeys("\\undefined");
    }

    public void submit() {
      wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    public void stop() {
      wd.quit();
    }
  }
}

