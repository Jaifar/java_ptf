package ru.stqa.pft.tests;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.model.GroupData;
import ru.stqa.pft.model.Groups;
import sun.plugin.dom.core.CoreConstants;

import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class GroupDeletionTests2 extends TestBase {
  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().groupPage();
    if (app.group().list().size()== 0) {
      app.group().create(new GroupData().withName("test1"));
    }
  }


  @Test
  public void groupDeletionTests() {
    Groups before = app.group().all();
    GroupData deletedGroup = before.iterator().next();
    app.group().delete(deletedGroup);
    Groups after = app.group().all();
    assertEquals(after.size(), before.size() -1);

    assertThat(after, equalTo(before.without(deletedGroup)));

  }


}



