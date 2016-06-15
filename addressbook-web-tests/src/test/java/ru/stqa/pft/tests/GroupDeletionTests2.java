package ru.stqa.pft.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests2 extends TestBase {

    

    @Test
    public void testGroupDeletion2() {

        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }


}
