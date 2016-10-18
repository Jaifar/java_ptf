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
 // assertThat(contact.getAllemails(), equalTo(mergeEmails(contactInfoFromEditForm)));
 // assertThat(contact.getAllPhones(), equalTo(mergePhones(contactInfoFromEditForm)));

 }

 private String mergeDetails(ContactData contact) {
  return Arrays.asList(contact.getFirstname(), contact.getLastname(),

          contact.getAddress(), contact.getHomephone(), contact.getMobilephone(),

          contact.getWorkphone(), contact.getEmailOne(), contact.getEmailTwo(), contact.getEmailThree())

          .stream().filter((s) -> ! s.equals("") )


           .collect(Collectors.joining(""));

 }
 //private String mergeEmails( ContactData contact) {
  //return Arrays.asList(contact.getEmailOne(), contact.getEmailTwo(), contact.getEmailThree())


          //  .stream().filter((s) -> !s.equals(""))
         // .collect(Collectors.joining("\n"));

// }
// private String mergePhones ( ContactData contact){
 // return Arrays.asList(contact.getMobilephone(), contact.getHomephone(), contact.getWorkphone())


          //    .stream().filter((s) -> !s.equals(""))
          //    .collect(Collectors.joining("\n"));

 }
//}

