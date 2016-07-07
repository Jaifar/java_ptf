package ru.stqa.pft.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.model.ContactData;

public class NewContactCreation extends TestBase2  {

  @Test
  public void newContactCreationtests() {

    app.getContactHelper().fillOutContactForm(new ContactData("Tetiana", "V", "Kravchuk", "Jaifar", "Me", "Informatrix Global", "Los Altos, California", "345-987-9876", "978-678-9876", "489-983-9874", "teti@gmail.com"));
    app.getContactHelper().submitContactForm();
    app.getContactHelper().returnToHomePage();
    app.logOut();
  }

}
