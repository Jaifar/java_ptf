package ru.stqa.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Owner on 6/16/2016.
 */
public class SessionHelper  extends HelperBase {


  public SessionHelper(WebDriver wd) {

    super(wd);
  }
  public void Login(String username, String password) {
    type(By.name("user"), username);
    type(By.name("pass"), password);

    wd.findElement(By.name("pass")).sendKeys("\\undefined");

    wd.findElement(By.cssSelector("label")).click();


    click(By.xpath("//form[@id='LoginForm']/input[3]"));
  }

}
