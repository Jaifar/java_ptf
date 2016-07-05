package ru.stqa.pft.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.model.GroupData;

public class GroupCreationTests extends TestBase {



    @Test
    public void testGroupCreationTests() {

        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("Test1", null, null));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returntoGroupPage();
        app.getNavigationHelper().gotoGroupPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before +1);


    }

}
