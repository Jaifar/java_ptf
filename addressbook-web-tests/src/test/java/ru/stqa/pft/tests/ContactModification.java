package ru.stqa.pft.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.Collection;
import ru.stqa.pft.model.ContactData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Owner on 7/17/2016.
 */
public class ContactModification extends TestBase2 {

  @Test
  public void testContactModification(){

    app.getNavigationHelperContact().returnsToHomePage();


    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Tetiana", "V", "Kravchuk", "Jaifar", "test1"));
    }
    List<ContactData> before = app.getContactHelper().getContactList();

    app.getContactHelper().selectContactMofication(before.size() - 1);
    app.getContactHelper().updateContactForm();
     ContactData contact = new ContactData(before.get(before.size() -1).getId(),"Tetiana", "Kravchuk", null,null, null);

    app.getContactHelper().submitContactModification();
    app.getContactHelper().goToHomePage();


    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(),before.size());
    before.remove(before.size() -1);
    before.add(contact);
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }

}
