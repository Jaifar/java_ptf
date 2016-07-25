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
    List<ContactData> before = app.getContactHelper().getContactList();

    app.getContactHelper().selectContactMofication(before.size() - 1);
    app.getContactHelper().updateContactForm();


    app.getContactHelper().submitContactModification();
    app.getContactHelper().goToHomePage();


    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(),before.size());
  }

}
