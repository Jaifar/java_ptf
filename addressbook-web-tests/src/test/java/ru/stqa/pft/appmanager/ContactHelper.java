package ru.stqa.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.model.ContactData;
import ru.stqa.pft.model.GroupData;

import java.util.ArrayList;
import java.util.List;

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

  public void fillOutContactForm(ContactData contactData) {
    wd.get("http://localhost/addressbook/edit.php");
    type(By.name("firstname"), contactData.getFirstname());
    click(By.cssSelector("label"));
    type(By.name("middlename"), contactData.getMiddlename());
    click(By.name("theform"));
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("nickname"), contactData.getNickname());

  }


  public void deleteContact() {
    if (!wd.findElement(By.name("selected[]")).isSelected()) {
      wd.findElement(By.name("selected[]")).click();
    }
    wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();
    wd.switchTo().alert().accept();

  }

  public void selectContact(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();


  }


  public void submitContactModification() {
    click(By.name("update"));
  }


  public void selectContactMofication(int i) {
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


  public void createContact(ContactData contact) {
    fillOutContactForm(contact);
    submitContactForm();
    goToHomePage();
  }


  public List<ContactData> getContactList() {
    List<ContactData> contacts = new ArrayList<ContactData>();

    List<WebElement> elements = wd.findElements(By.name("entry"));
    for (WebElement element : elements) {

      String lastname = element.findElement(By.xpath("//table[@id='maintable']/tbody/tr[29]/td[2]")).getText();

      String firstname = element.findElement(By.xpath("//table[@id='maintable']/tbody/tr[29]/td[3]")).getText();


      int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
      ContactData contact = new ContactData(id,firstname,lastname,null,null,null);
      contacts.add(contact);
    }
    return contacts;


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
}



