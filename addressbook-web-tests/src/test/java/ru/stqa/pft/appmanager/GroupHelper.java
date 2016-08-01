package ru.stqa.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.model.GroupData;
import ru.stqa.pft.model.Groups;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Owner on 6/23/2016.
 */
public class GroupHelper extends HelperBase {


  public GroupHelper(WebDriver wd) {
    super(wd);
  }

  public void returntoGroupPage() {
    click(By.linkText("groups"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));

  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void create() {
    click(By.name("new"));
    click(By.name("group_name"));
    wd.findElement(By.name("group_name")).clear();
    wd.findElement(By.name("group_name")).sendKeys("Test1");
    click(By.name("group_header"));
    wd.findElement(By.name("group_header")).clear();
    wd.findElement(By.name("group_header")).sendKeys("111");
    click(By.name("group_footer"));
    wd.findElement(By.name("group_footer")).clear();
    wd.findElement(By.name("group_footer")).sendKeys("1111");
    click(By.name("group_footer"));
    wd.findElement(By.name("group_footer")).clear();
    wd.findElement(By.name("group_footer")).sendKeys("2222");
    click(By.name("submit"));


  }

  public void deleteSelectedGroup() {
    click(By.name("delete"));
  }

  public void selectGroup(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();

  }
  public void selectGroupById(int id) {
    wd.findElement(By.cssSelector("input[value='" + id + "']")).click();

  }
  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }

  public void login(String username, String password) {
    wd.get("http://localhost/addressbook/edit.php");
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).sendKeys("\\undefined");
    wd.findElement(By.id("nav")).click();
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.cssSelector("label")).click();
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }

  public void logOut() {
    wd.findElement(By.linkText("Logout")).click();
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).sendKeys("\\undefined");
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).sendKeys("\\undefined");
  }


  protected void fillOutContactForm() {
    wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[4]/td[8]/a/img")).click();
    wd.findElement(By.name("nickname")).click();
    wd.findElement(By.name("nickname")).clear();
    wd.findElement(By.name("nickname")).sendKeys("Jaifar Jaifar");
    wd.findElement(By.xpath("//div[@id='content']/form[1]")).click();
    wd.findElement(By.name("homepage")).click();
    wd.findElement(By.name("homepage")).clear();
    wd.findElement(By.name("homepage")).sendKeys("www.facebook.com");
    wd.findElement(By.xpath("//div[@id='content']/form[1]/input[22]")).click();
    wd.findElement(By.linkText("home page")).click();
  }


  public void create(GroupData group) {
  }


  public void modify( GroupData group) {
    selectGroupById(group.getId());
    initGroupModification();
    fillGroupForm(group);
    submitGroupModification();
    returntoGroupPage();
  }

  public void delete(int index) {
    selectGroup(index);
    deleteSelectedGroup();
    returntoGroupPage();
  }

  

  public void delete(GroupData group) {
    selectGroupById(group.getId());
    deleteSelectedGroup();
    returntoGroupPage();
  }


  public boolean isThereAGroup() {
    return isElementPresent(By.name("Selected[]"));
  }

  public int getGroupCount() {
    return wd.findElements(By.name("selected[]")).size();
  }

  public List<GroupData> list() {
    List<GroupData> groups = new ArrayList<>();
    List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
    for (WebElement element : elements) {
      String name = element.getText();
      int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
      groups.add(new GroupData().withId(id).withName(name));
    }
    return groups;
  }

  public Groups all() {
    Groups groups = new Groups();
    List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
    for (WebElement element : elements) {
      String name = element.getText();
      int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
      groups.add(new GroupData().withId(id).withName(name));
    }
    return groups;
  }



}