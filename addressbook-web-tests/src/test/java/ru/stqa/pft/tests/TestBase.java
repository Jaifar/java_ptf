package ru.stqa.pft.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.appmanager.ApplicationManager;

/**
 * Created by Owner on 6/22/2016.
 */


public class TestBase {
  protected final ApplicationManager app;


  FirefoxDriver wd;

  public TestBase() {
    app = new ApplicationManager(wd);
  }


  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }


  @AfterMethod
  public void tearDown() {
    app.stop();
  }


}