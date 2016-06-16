package ru.stqa.pft.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.TestBase;
import ru.stqa.pft.model.GroupData;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {


    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("Test1", "Test2", "Test3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
