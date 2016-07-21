package ru.stqa.pft.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.model.ContactData;

import java.util.List;

public class NewContactCreation extends TestBase2 {

  @Test
  public void newContactCreationtests() {


int before = app.getContactHelper().getContactCount();
    app.getContactHelper().createContact(new ContactData("Tetiana", "V", "Kravchuk", "Jaifar", "Me", "Informatrix Global", "Los Altos, California", "345-987-9876", "978-678-9876", "489-983-9874", "teti@gmail.com"));

    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before +1);





  }

}
