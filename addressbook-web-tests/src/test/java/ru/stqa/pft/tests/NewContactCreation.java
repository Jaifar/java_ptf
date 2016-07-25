package ru.stqa.pft.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.model.ContactData;

import java.util.List;

public class NewContactCreation extends TestBase2 {

  @Test
  public void newContactCreationtests() {
    app.getNavigationHelperContact().returnsToHomePage();


    List<ContactData> before = app.getContactHelper().getContactList();


    app.getContactHelper().createContact(new ContactData("Tetiana", "V", "Kravchuk", "Jaifar", "test1"));

    List<ContactData> after = app.getContactHelper().getContactList();

   Assert.assertEquals(after.size(), before.size() +1);


  }

}
