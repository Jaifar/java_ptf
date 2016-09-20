package ru.stqa.pft.tests;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;
import ru.stqa.pft.model.ContactData;

import java.util.Arrays;
import java.util.stream.Collectors;

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

    assertThat(contact.getAllPhones(), equalTo(mergePhones(contactInfoFromEditForm)))
    ;

  }

  private String mergePhones(ContactData contact) {

    return Arrays.asList(contact.getHomephone(), contact.getMobilephone(), contact.getWorkphone()).stream().filter((s) -> ! (s == null || s.equals("")))
            .map(ContactPhoneTests::cleaned)
            .collect(Collectors.joining("\n")
            );


  }

  public static String cleaned(String phone) {
    return phone.replaceAll("\\s", "").replaceAll("[-()]", "");
  }
}
