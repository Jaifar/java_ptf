package ru.stqa.pft.tests;

import org.testng.annotations.Test;

public class NewContactCreation extends TestBase{




  @Test
    public void testNewContactCreation() {

    app.getContactHelper.fillOutContactForm(new ContactData("middlename", "homepage", "Tetiana"),true);
    app.getContactHelper.submitContactForm();
    app.getContactHelper.returnToHomePage();
    logOut();
    }


    }
