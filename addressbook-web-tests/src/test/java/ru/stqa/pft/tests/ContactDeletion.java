package ru.stqa.pft.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.model.ContactData;

import java.util.List;

public class ContactDeletion extends TestBase2 {


  @Test
  public void testContactDeletion() {

    app.getNavigationHelperContact().returnsToHomePage();

    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Tetiana", "V", "Kravchuk", "Jaifar", null));
    }

    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContact();
    app.getNavigationHelperContact().returnsToHomePage();



    app.logOut();


  }

}
