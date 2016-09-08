package ru.stqa.pft.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.model.ContactData;

/**
 * Created by Owner on 9/8/2016.
 */
public class ContactPhoneTests extends TestBase2 {

  @Test
  public void testContactPhones(){
    app.goTo().homePage();
    ContactData contact = app.contact().all().iterator().next();
    ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);
  }
}
