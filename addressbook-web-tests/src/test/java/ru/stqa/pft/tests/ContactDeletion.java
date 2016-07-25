package ru.stqa.pft.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.model.ContactData;

public class ContactDeletion  extends TestBase2{

    




    
    @Test
    public void testContactDeletion() {

        app.getNavigationHelperContact().returnsToHomePage();
        int before = app.getContactHelper().getContactCount();

        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("Tetiana", "V", "Kravchuk", "Jaifar", "test1"));
        }

        app.getContactHelper().selectContact(before -1);
        app.getContactHelper().deleteContact();

        app.getNavigationHelperContact().returnsToHomePage();

        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before - 1);



}

}
