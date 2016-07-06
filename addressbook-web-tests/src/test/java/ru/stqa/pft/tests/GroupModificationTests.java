package ru.stqa.pft.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.model.GroupData;

import java.util.List;

/**
 * Created by Owner on 6/23/2016.
 */
public class GroupModificationTests extends TestBase {





  @Test

  public void testGroupModification(){

   app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();

    app.getGroupHelper().selectGroup(before.size() - 1);
    app.getGroupHelper().initGroupModification();
   app.getGroupHelper().fillGroupForm(new GroupData("Test1", null , null));

   app.getGroupHelper().submitGroupModification();

     app.getGroupHelper().returntoGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size());

  }
}

