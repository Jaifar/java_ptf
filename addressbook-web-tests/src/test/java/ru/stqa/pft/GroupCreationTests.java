package ru.stqa.pft;


import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {

  @Test
  public void GroupCreationTests() {

    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("Test1", "Test2", "Test3"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
