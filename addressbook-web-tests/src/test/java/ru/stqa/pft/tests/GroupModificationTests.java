package ru.stqa.pft.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.model.GroupData;

/**
 * Created by Owner on 6/23/2016.
 */
public class GroupModificationTests extends TestBase {


  @Test

  public void testGroupModification(){
    app.app.getNavigationHelper().gotoGroupPage();
    app.app.getGroupHelper().selectGroup();
    app.app.getGroupHelper().initGroupModification();
    app.app.getGroupHelper().fillGroupForm(new GroupData("Test1", "Test2", "Test3"));
    app.app.getGroupHelper().submitGroupModification();
    app.app.getGroupHelper().returntoGroupPage();

  }
}

