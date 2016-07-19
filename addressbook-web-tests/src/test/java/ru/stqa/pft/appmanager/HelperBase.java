package ru.stqa.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Owner on 6/23/2016.
 */
public class HelperBase {
  FirefoxDriver wd;

  public HelperBase(WebDriver wd) {
    this.wd = (FirefoxDriver) wd;
  }

  public HelperBase() {

  }

  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  protected void type(By locator, String text) {
    click(locator);

        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);

      }




  public  boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }

  }

  public void fillOutContactCreationForm() {
    
  }

  public void submit() {
    
  }

  public void logout() {
  }

  boolean isElementPresent(By locator) {
    try {
      wd.findElement(locator);
      return true;
    }catch (NoSuchElementException ex){
      return false;
    }
  }
}



