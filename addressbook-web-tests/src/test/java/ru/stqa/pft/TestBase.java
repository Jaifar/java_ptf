package ru.stqa.pft;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.appmanager.ApplicationManager;

/**
 * Created by Owner on 6/9/2016.
 */
public class TestBase {

  public final ApplicationManager app = new ApplicationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

}
