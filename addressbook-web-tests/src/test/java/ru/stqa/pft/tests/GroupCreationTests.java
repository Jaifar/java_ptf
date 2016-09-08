package ru.stqa.pft.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.model.GroupData;
import ru.stqa.pft.model.Groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreationTests() {

    app.goTo().groupPage();
   Groups before = app.group().all();

    GroupData group = new GroupData().withName("Test1");
    app.group().create(group);
    app.goTo().groupPage();
    assertThat(app.group().count(),equalTo(before.size() +1));

    Groups after = app.group().all();

    assertThat(after, equalTo(
            before.withAdded(group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));
  }
  @Test
  public void testBadGroupCreationTests() {

    app.goTo().groupPage();
    Groups before = app.group().all();

    GroupData group = new GroupData().withName("Test1'");
    app.group().create();
    app.goTo().groupPage();
    assertThat(app.group().count(),equalTo(before.size()));
    Groups after = app.group().all();

    assertThat(after, equalTo(before));
  }}
