package ru.stqa.pft.appmanager;

import com.sun.javafx.binding.ExpressionHelperBase;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.model.GroupData;

/**
 * Created by Owner on 6/16/2016.
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
    wd.findElement(By.name("group_header")).clear();
    wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    click(By.name("group_footer"));
    wd.findElement(By.name("group_footer")).clear();
    wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  public void initGroupCreation() {
    click(By.name("group_name"));
  }

  public void deleteSelectedGroups() {
    click(By.name("delete"));
  }
}
