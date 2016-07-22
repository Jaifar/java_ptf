package ru.stqa.pft.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.model.ContactData;

import java.util.List;

/**
 * Created by Owner on 7/17/2016.
 */
public class ContactModification extends TestBase2 {

  @Test
  public void testContactModification(){

    app.getNavigationHelperContact().returnsToHomePage();


    if (! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("Tetiana", "V", "Kravchuk", "Jaifar", null));
    }


    app.getContactHelper().selectContactMofication();
    app.getContactHelper().updateContactForm();


    app.getContactHelper().sumitContactModification();
    app.getContactHelper().goToHomePage();


    app.logOut();
  }

}
