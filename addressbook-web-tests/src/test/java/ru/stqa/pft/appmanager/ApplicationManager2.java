package ru.stqa.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

/**
 * Created by Owner on 7/17/2016.
 */
public class ApplicationManager2
       {
         FirefoxDriver wd;

         private SessionContactHelper sessionContactHelper;

  private NavigationHelperContact navigationHelperContact;
  private  ContactHelper contactHelper ;




  public void init() {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    contactHelper = new ContactHelper(wd);
    navigationHelperContact = new NavigationHelperContact(wd);
    sessionContactHelper = new SessionContactHelper(wd);
    sessionContactHelper.logIn("admin", "secret");
  }



  public void logOut() {
    wd.findElement(By.linkText("Logout")).click();
    wd.findElement(By.name("pass")).click();
  }

  public void stop() {
    wd.quit();
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

  public NavigationHelperContact getNavigationHelperContact() {
    return navigationHelperContact;
  }
}
