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
    int before = app.getContactHelper().getContactCount();


    if (! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("Tetiana", "V", "Kravchuk", "Jaifar", "Me", "Informatrix Global", "Los Altos, California", "345-987-9876", "978-678-9876", "489-983-9874", "teti@gmail.com"));
    }

    app.getContactHelper().selectContactMofication();
    app.getContactHelper().updateContactForm();

    app.getContactHelper().sumitContactModification();
    app.getContactHelper().returnToHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before);

    app.logOut();
  }

}
