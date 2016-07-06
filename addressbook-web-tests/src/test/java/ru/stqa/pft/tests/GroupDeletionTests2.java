package ru.stqa.pft.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.model.GroupData;

import java.util.List;

public class GroupDeletionTests2 extends TestBase{




  @Test
    public void groupDeletionTests() {


      app.getNavigationHelper().gotoGroupPage();

    List<GroupData> before = app.getGroupHelper().getGroupList();

      app.getGroupHelper().selectGroup(before.size() - 1);
      app.getGroupHelper().deleteSelectedGroup();
     app.getNavigationHelper().gotoGroupPage();

    List<GroupData> after = app.getGroupHelper().getGroupList();

    Assert.assertEquals(after.size(), before.size() -1);

    before.remove(before.size() -1);

      Assert.assertEquals(before, after);
    }
    }



