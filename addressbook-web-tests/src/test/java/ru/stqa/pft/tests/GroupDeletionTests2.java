package ru.stqa.pft.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.TestBase;

public class GroupDeletionTests2 extends TestBase{





    @Test
    public void testGroupDeletion2() {

        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }




}
