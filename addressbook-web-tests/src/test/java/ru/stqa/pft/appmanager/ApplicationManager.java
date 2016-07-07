package ru.stqa.pft.appmanager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

/**
 * Created by Owner on 6/23/2016.
 */
public class ApplicationManager {
 WebDriver wd;
  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;



  public ApplicationManager(FirefoxDriver wd) {

  }


  public void init() {
    
    String browser = BrowserType.FIREFOX;
    if (browser == BrowserType.FIREFOX) {
      wd = new FirefoxDriver();
      
    }else if (browser == BrowserType.CHROME) {
      wd = new ChromeDriver();
    }else if (browser == BrowserType.IE){
      wd = new InternetExplorerDriver();
      
    }
  wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/group.php");

    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");


  }




  public void stop() {
    wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
