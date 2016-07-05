package ru.stqa.pft.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.model.GroupData;

/**
 * Created by Owner on 6/23/2016.
 */
public class GroupModificationTests extends TestBase {





  @Test

  public void testGroupModification(){

   app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
   app.getGroupHelper().fillGroupForm(new GroupData("Test1", "Test2", "Test3"));
   app.getGroupHelper().submitGroupModification();

     app.getGroupHelper().returntoGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before);

  }
}

