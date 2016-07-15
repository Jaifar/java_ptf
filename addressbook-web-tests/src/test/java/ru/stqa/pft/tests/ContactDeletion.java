package ru.stqa.pft.tests;

import org.testng.annotations.Test;

public class ContactDeletion  extends TestBase2{

    

    
    @Test
    public void testContactDeletion() {

        selectContact();
        deleteContact();
        returnsToHomePage();
        logOut();

}


}
