package ru.stqa.pft.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTests2 extends TestBase{




  @Test
    public void groupDeletionTests() {
    int before = app.getGroupHelper().getGroupCount();

      app.getNavigationHelper().gotoGroupPage();
      app.getGroupHelper().selectGroup();
      app.getGroupHelper().deleteSelectedGroup();
     app.getNavigationHelper().gotoGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before -1);
    }


}
