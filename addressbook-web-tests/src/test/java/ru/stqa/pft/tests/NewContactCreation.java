package ru.stqa.pft.tests;

import org.testng.annotations.Test;

public class NewContactCreation extends TestBase{


  public NewContactCreation(String browser) {
    super(browser);
  }

  @Test
    public void testNewContactCreation() {

    app.contactHelper.fillOutContactCreationForm();
     app.contactHelper.submit();
    returnToHomePage();
     app.contactHelper.logout();
    }

  public void returnToHomePage() {

  }

}
