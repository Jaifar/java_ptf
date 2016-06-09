package ru.stqa.pft;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class GroupCreationTest {
  FirefoxDriver wd;

  @BeforeMethod
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    Login();
  }

  private void Login() {
    wd.findElement(By.name("new")).click();
    wd.findElement(By.name("group_name")).click();
    wd.findElement(By.name("group_name")).clear();

  }

  @Test
  public void testGroupCreation() {


    gotoGroupPage();
    initGroupCreation();
    submitGroupCreation();
    returnToGroupPage();
  }

  private void returnToGroupPage() {
    wd.findElement(By.linkText("groups")).click();
    wd.findElement(By.linkText("Logout")).click();
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).sendKeys("\\undefined");
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).sendKeys("\\undefined");
  }

  private void submitGroupCreation() {
    wd.findElement(By.name("submit")).click();
  }

    wd.findElement(By.name("group_header")).clear();
    wd.findElement(By.name("group_footer")).click();
    wd.findElement(By.name("group_footer")).clear();
  }

  private void initGroupCreation() {
    wd.findElement(By.name("group_header")).click();
  }

  private void gotoGroupPage() {
    wd.findElement(By.xpath("//div[@id='content']/form")).click();
  }

  @AfterMethod
  public void tearDown() {
    wd.quit();
  }

  public static boolean isAlertPresent(FirefoxDriver wd) {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
