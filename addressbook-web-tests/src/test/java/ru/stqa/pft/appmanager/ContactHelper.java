package ru.stqa.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.model.ContactData;

/**
 * Created by Owner on 7/17/2016.
 */
public class ContactHelper extends ContactHelperBase {




  public ContactHelper(FirefoxDriver wd) {
    super(wd);

  }

  public void goToHomePage() {
    click(By.linkText("home page"));
  }

  public void submitContactForm() {
    click(By.name("submit"));
  }

  public void fillOutContactForm(ContactData contactData, boolean creation) {
    wd.get("http://localhost/addressbook/edit.php");
    type(By.name("firstname"), contactData.getFirstname());
    click(By.cssSelector("label"));
    type(By.name("middlename"), contactData.getMiddlename());
    click(By.name("theform"));
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("nickname"), contactData.getNickname());

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    }else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }



    }



  public void deleteContact() {
    wd.switchTo().alert().accept();
  }

  public void selectContact() {

    if (!wd.findElement(By.name("selected[]")).isSelected()) {
      click(By.name("selected[]"));
    }
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
  }


  public void sumitContactModification() {
    click(By.name("update"));
  }


  public void selectContactMofication() {
    wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();
  }

  public void updateContactForm() {
    wd.findElement(By.name("nickname")).click();
    wd.findElement(By.name("nickname")).clear();
    wd.findElement(By.name("nickname")).sendKeys("Jaifar-Jaifar");
  }






  private void logOut() {

  }

  public boolean isThereAContact() {
    return isElementPresent(By.xpath("selected[]"));
  }




  public int getContactCount() {
    return wd.findElements(By.name("selected[]")).size();
  }


  }


