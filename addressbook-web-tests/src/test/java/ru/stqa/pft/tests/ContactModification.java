package ru.stqa.pft.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.model.ContactData;

/**
 * Created by Owner on 7/17/2016.
 */
public class ContactModification extends TestBase2 {

  @Test
  public void testContactModification(){
    app.getContactHelper().selectContactMofication();
    app.getContactHelper().updateContactForm();

    app.getContactHelper().sumitContactModification();
    app.getContactHelper().returnToHomePage();
    app.logOut();
  }

}
