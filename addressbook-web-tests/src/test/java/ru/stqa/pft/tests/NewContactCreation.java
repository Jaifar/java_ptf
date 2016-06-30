package ru.stqa.pft.tests;

import org.testng.annotations.Test;

public class NewContactCreation extends TestBase{




  @Test
    public void testNewContactCreation() {

    fillOutContactForm(new ContactData("Tetiana", "V", "Kravchuk", "Jaifar", "Informatrix Global", "Los Altos, California", "978-678-9876", "489-983-9874", "345-987-9876", "345-654-6543", "teti@gmail.com", "Salem, New Hampshire, the USA", "Be happy "));
    submitContactForm();
    returnToHomePage();
    logOut();
    }


    }
