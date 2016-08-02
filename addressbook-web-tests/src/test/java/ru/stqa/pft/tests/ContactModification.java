package ru.stqa.pft.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.model.ContactData;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Owner on 7/17/2016.
 */
public class ContactModification extends TestBase2 {
  @BeforeMethod
  public void ensurePreconditions(){
    app.goTo().homePage();
    if (app.contact().list().size() == 0) {
      app.contact().create(new ContactData("Tetiana", "V", "Kravchuk", "Jaifar", "test1"));
    }
  }

  @Test
  public void testContactModification(){


    List<ContactData> before = app.contact().list();
    int index = before.size() -1;
    ContactData contact = new ContactData(before.get(index).getId(),"Tetiana", "Kravchuk", null,null, null);
    app.contact().modify(index, contact);
    List<ContactData> after = app.contact().list();
    Assert.assertEquals(after.size(),before.size());

    before.remove(index);
    before.add(contact);
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }



}
