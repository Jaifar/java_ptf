package ru.stqa.pft.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.model.GroupData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreationTests() {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup((new GroupData("Test1", null, null)));

    List<GroupData> before = app.getGroupHelper().getGroupList();

    app.getGroupHelper().initGroupCreation();
    GroupData group = new GroupData("Test1", null, null);
    app.getGroupHelper().createGroup(group);
    app.getGroupHelper().fillGroupForm(new GroupData("Test1", null, null));


    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returntoGroupPage();
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);

    Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    before.add(group);
    byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }}
