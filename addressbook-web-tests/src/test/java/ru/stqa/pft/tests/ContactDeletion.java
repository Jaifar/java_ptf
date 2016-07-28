package ru.stqa.pft.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.model.ContactData;

import java.util.List;

public class ContactDeletion extends TestBase2 {


  @Test(enabled = false)
  public void testContactDeletion() {

    app.getNavigationHelperContact().returnsToHomePage();


    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Tetiana", "V", "Kravchuk", "Jaifar", "test1"));
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().selectContact(before.size() - 1);
    app.getContactHelper().deleteContact();

    app.getNavigationHelperContact().returnsToHomePage();

    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() - 1);
    before.remove(before.size() - 1);

      Assert.assertEquals(before, after);
    }
  }

