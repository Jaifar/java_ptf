package ru.stqa.pft.tests;

import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;
import ru.stqa.pft.model.ContactData;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Owner on 9/29/2016.
 */
public class DetailsTests extends TestBase2 {
 @Test
 public void testDetailsTests() {
  app.goTo().homePage();
  ContactData contact = app.contact().all().iterator().next();
  ContactData contactInfoFromDetailsForm = app.contact().infoFromDetailsForm(contact);
  ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);


  assertThat((mergeDetails(contactInfoFromEditForm)),
          equalTo(contactInfoFromDetailsForm.getContactDetails()));
 }

 private String mergeDetails(ContactData contact) {
  return Arrays.asList(contact.getFirstname(), contact.getLastname(), contact.getAddress(), contact.getAllPhones(),
          contact.getAllemails())
          .stream().filter((s) -> !(s == null || s.equals("")))
          .collect(Collectors.joining("\n"));
 }

}

