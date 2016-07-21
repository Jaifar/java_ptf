package ru.stqa.pft.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.model.ContactData;

public class NewContactCreation extends TestBase2 {

  @Test
  public void newContactCreationtests() {
    app.getNavigationHelperContact().returnsToHomePage();

    app.getContactHelper().fillOutContactForm(new ContactData("Tetiana","V","Kravchuk", "Jaifar", "test1"),true);
    app.getContactHelper().submitContactForm();
    app.getContactHelper().goToHomePage();







  }

}
