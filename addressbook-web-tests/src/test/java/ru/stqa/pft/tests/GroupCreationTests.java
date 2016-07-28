package ru.stqa.pft.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.model.GroupData;

import java.util.Comparator;
import java.util.List;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreationTests() {

    app.goTo().groupPage();
    List<GroupData> before = app.group().list();
    int index = before.size() +1;
    GroupData group = new GroupData().withName("Test1");
    app.group().create();
    app.goTo().groupPage();



    List<GroupData> after = app.group().list();
    Assert.assertEquals(after.size(), index);
    before.add(group);

    Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);}}
