package ru.stqa.pft.tests;

import org.testng.annotations.Test;

public class ContactDeletion  extends TestBase2{

    




    
    @Test
    public void testContactDeletion() {

        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getNavigationHelperContact().returnsToHomePage();
        app.logOut();

}

}
