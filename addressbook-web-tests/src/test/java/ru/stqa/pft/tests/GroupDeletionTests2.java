package ru.stqa.pft.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests2 extends TestBase{


  public GroupDeletionTests2(String browser) {

  }

  @Test
    public void groupDeletionTests() {

      app.getNavigationHelper().gotoGroupPage();
      app.getGroupHelper().selectGroup();
      app.getGroupHelper().deleteSelectedGroup();
       app.getNavigationHelper().gotoGroupPage();
    }


}
