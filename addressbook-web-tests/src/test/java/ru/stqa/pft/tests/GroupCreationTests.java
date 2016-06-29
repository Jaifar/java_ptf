package ru.stqa.pft.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.model.GroupData;

public class GroupCreationTests extends TestBase {

    public GroupCreationTests(String browser) {

    }

    @Test
    public void testGroupCreationTests() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("Test1", null, null));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returntoGroupPage();
       app.getNavigationHelper().gotoGroupPage();


    }

}
