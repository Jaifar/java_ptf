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


    int max = 0;
    for (GroupData g : after) {
      if (g.getId() > max) {
        max = g.getId();
      }
    }
    Comparator<? super GroupData> byId = new Comparator<GroupData>() {
      @Override
      public int compare(GroupData o1, GroupData o2) {
        return Integer.compare(o1.getId(), o2.getId());
      }
    };
    int max1 = after.stream().max(byId).get().getId();
    group.setId(max1);
    before.add(group);
    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
  }}
