package ru.stqa.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Owner on 7/7/2016.
 */
public class SessionContactHelper extends ContactHelperBase{


  public SessionContactHelper(FirefoxDriver wd) {

    super(wd);
  }

  public void logIn(String username, String password)
  {
    type(By.name("user"), username);
    type(By.name("pass"), password);
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }
}