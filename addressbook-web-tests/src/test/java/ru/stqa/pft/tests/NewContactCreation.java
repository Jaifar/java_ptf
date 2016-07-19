package ru.stqa.pft.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.model.ContactData;

import java.util.List;

public class NewContactCreation extends TestBase2 {

  @Test
  public void newContactCreationtests() {
    List<ContactData> before = app.getContactHelper().getContactList();

    app.getContactHelper().createContact(new ContactData("Tetiana", "V", "Kravchuk", "Jaifar", "Me", "Informatrix Global", "Los Altos, California", "345-987-9876", "978-678-9876", "489-983-9874", "teti@gmail.com"));

    List<ContactData> after = app.getContactHelper().getContactList();

    Assert.assertEquals(after.size(), before.size() + 1);


  }

}
