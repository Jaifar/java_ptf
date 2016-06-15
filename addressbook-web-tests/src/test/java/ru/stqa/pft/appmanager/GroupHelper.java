package ru.stqa.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.model.GroupData;

/**
 * Created by Owner on 6/14/2016.
 */
public class GroupHelper extends HelperBase {


  public GroupHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void returnToGroupPage() {
    click(By.linkText("groups"));
    click(By.linkText("Logout"));
    click(By.name("pass"));
    wd.findElement(By.name("pass")).sendKeys("\\undefined");
    click(By.name("user"));
    wd.findElement(By.name("user")).sendKeys("\\undefined");
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {

    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getHeader());

  }

  private void type(By locator, By text) {
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
    click(locator);
  }

  public void initGroupCreation() {
    click(By.name("group_name"));
  }

  public void deleteSelectedGroups() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }
}
