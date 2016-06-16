package ru.stqa.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Owner on 6/15/2016.
 */
public class ApplicationManager {
  FirefoxDriver wd;
  private SessionHelper sessionHelper;

  private  NavigationHelper navigationHelper;
  private  GroupHelper groupHelper;



  public void init() {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/group.php");
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.Login("admin", "secret");
  }


  public void stop()
  {
    wd.quit();
  }

  public void logOutFromPage() {
   wd.findElement(By.linkText("Logout")).click();
   wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).sendKeys("\\undefined");
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).sendKeys("\\undefined");
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
