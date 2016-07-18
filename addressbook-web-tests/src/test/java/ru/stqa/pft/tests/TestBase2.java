package ru.stqa.pft.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.appmanager.ApplicationManager2;

/**
 * Created by Owner on 7/14/2016.
 */
public class TestBase2 {


  protected final ApplicationManager2 app = new ApplicationManager2();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }


  @AfterMethod
  public void tearDown() {
    app.stop();
  }



}
