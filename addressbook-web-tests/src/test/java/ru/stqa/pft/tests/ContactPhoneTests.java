package ru.stqa.pft.tests;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;
import ru.stqa.pft.model.ContactData;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Owner on 9/8/2016.
 */
public class ContactPhoneTests extends TestBase2 {

  @Test
  public void testContactPhones(){
    app.goTo().homePage();
    ContactData contact = app.contact().all().iterator().next();
    ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);
    assertThat(contact.getHomephone(), equalTo(contactInfoFromEditForm.getHomephone()));
    assertThat(contact.getMobilephone(), equalTo(contactInfoFromEditForm.getMobilephone()));
    assertThat(contact.getWorkphone(), equalTo(contactInfoFromEditForm.getWorkphone()));
  }
}
