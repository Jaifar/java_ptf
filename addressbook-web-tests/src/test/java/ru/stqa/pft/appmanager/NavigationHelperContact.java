package ru.stqa.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Owner on 7/17/2016.
 */
public class NavigationHelperContact extends ContactHelperBase{



  public NavigationHelperContact(FirefoxDriver wd) {
   super(wd);
  }



  public void homePage() {
   if (isElementPresent(By.id("maintable"))){
      return;
    }
    click(By.linkText("home"));
  }


  }
