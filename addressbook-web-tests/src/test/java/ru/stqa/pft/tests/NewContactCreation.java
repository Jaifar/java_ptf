package ru.stqa.pft.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.model.ContactData;

public class NewContactCreation extends TestBase2 {

  @Test
  public void newContactCreationtests() {
    int before = app.getContactHelper().getContactCount();

    app.getNavigationHelperContact().returnsToHomePage();

    app.getContactHelper().createContact(new ContactData("Tetiana","V","Kravchuk", "Jaifar", "test1"));

    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before +1);








  }

}
