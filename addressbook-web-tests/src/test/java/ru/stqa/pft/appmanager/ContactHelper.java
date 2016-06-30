package ru.stqa.pft.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Owner on 6/28/2016.
 */
public class ContactHelper extends HelperBase{

  protected final HelperBase helperBase;

  public ContactHelper(FirefoxDriver wd){
    super(wd);
    helperBase = new HelperBase(wd);

  }


  public HelperBase getHelperBase() {
    return helperBase;
  }
}
