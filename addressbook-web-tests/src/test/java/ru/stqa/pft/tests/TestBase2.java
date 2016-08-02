package ru.stqa.pft.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import ru.stqa.pft.appmanager.ApplicationManager2;

/**
 * Created by Owner on 7/14/2016.
 */
public class TestBase2 {


  protected static final ApplicationManager2 app = new ApplicationManager2();

  @BeforeSuite
  public void setUp() throws Exception {
    app.init();
  }


  @AfterSuite
  public void tearDown() {
    app.stop();
  }



}
