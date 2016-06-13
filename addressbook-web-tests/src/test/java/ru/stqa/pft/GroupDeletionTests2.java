package ru.stqa.pft;

import org.testng.annotations.Test;

public class GroupDeletionTests2 extends TestBase {

    

    @Test
    public void testGroupDeletion2() {

        goToGroupPage();
        selectGroup();
        deleteSelectedGroups();
        returnToGroupPage();
    }


}
