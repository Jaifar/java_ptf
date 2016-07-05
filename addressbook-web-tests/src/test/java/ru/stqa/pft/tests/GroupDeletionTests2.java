package ru.stqa.pft.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTests2 extends TestBase{




  @Test
    public void groupDeletionTests() {


      app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
      app.getGroupHelper().selectGroup();
      app.getGroupHelper().deleteSelectedGroup();
     app.getNavigationHelper().gotoGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before -1);
    }


}
