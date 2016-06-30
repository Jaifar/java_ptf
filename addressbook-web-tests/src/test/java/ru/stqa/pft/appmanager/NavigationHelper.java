package ru.stqa.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Owner on 6/23/2016.
 */
public class NavigationHelper extends HelperBase {


  public NavigationHelper(WebDriver wd) {
   super((FirefoxDriver) wd);
  }

  public void gotoGroupPage() {
      click(By.linkText("groups"));
  }
}
