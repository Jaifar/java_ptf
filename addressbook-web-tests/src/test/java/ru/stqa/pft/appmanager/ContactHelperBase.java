package ru.stqa.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Owner on 7/7/2016.
 */
public class ContactHelperBase {
  protected FirefoxDriver wd;


  public ContactHelperBase(FirefoxDriver wd) {
    this.wd = wd;
  }

  protected void type(By locator, String text) {
    wd.findElement(locator).click();
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

  protected void returnHomePage() {

  }

  protected void submitEdition() {

  }

  protected void editName() {

  }

  protected void logOut() {

  }

  protected void returnToHomePage() {

  }

  protected void editContact() {

  }
}
