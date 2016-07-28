package ru.stqa.pft.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.stqa.pft.appmanager.ApplicationManager;

/**
 * Created by Owner on 6/22/2016.
 */


public class TestBase {
  protected final ApplicationManager app ;



  public TestBase() {

    FirefoxDriver wd = null;
    app = new ApplicationManager(wd);

  }


  @BeforeSuite
  public void setUp() throws Exception {
    app.init();
  }



  @AfterSuite
  public void tearDown() {
    app.stop();
  }





}