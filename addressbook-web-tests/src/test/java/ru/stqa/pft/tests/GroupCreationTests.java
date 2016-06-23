package ru.stqa.pft.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.appmanager.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreationTests() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("Test1", "Test2", "Test3"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returntoGroupPage();
        app.getNavigationHelper().gotoGroupPage();

    }

}
