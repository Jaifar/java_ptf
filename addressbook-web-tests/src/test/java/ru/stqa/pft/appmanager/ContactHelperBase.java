package ru.stqa.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Owner on 7/17/2016.
 */
public class ContactHelperBase {
  FirefoxDriver wd;

  public ContactHelperBase(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void click(By locator) {
    wd.findElement(locator).click();
  }

  public void type(By locator, String text) {
    click(locator);
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);}

  public  boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }}


  protected boolean isElementPresent(By locator){
    try{
    wd.findElement(locator);
      return true;
  }catch (NoSuchElementException ex){
      return  false;
    }

    }
}

