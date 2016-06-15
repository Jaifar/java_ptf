package ru.stqa.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Owner on 6/14/2016.
 */
public class SessionHelper extends HelperBase   {
  private FirefoxDriver wd;

  public SessionHelper(FirefoxDriver wd) {
    super(wd);
  }


  public void Login(String username, String password) {
    type(By.name("user"), username);
    type(By.name("pass"), password);

   click(By.xpath("//form[@id='LoginForm']/input[3]"));
  }


  public void login(String admin, String secret) {
  }
}



