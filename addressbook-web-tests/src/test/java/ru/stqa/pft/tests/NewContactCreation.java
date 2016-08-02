package ru.stqa.pft.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.model.ContactData;

import java.util.Set;

public class NewContactCreation extends TestBase2 {

  @Test
  public void newContactCreationtests() {
    app.goTo().homePage();
    Set<ContactData> before = app.contact().all();
    ContactData contact = new ContactData().withFirstname("Tetiana").withMiddlename("V").withLastname("Kravchuk").withNickname("Jaifar").withGroup("test1");
    app.contact().create(contact);
    Set<ContactData> after = app.contact().all();
    Assert.assertEquals(after.size(), before.size() +1);
    contact.withId(after.stream().mapToInt((c) -> c.getId()).max().getAsInt());

    before.add(contact);
    Assert.assertEquals(before, after);

  }

}
