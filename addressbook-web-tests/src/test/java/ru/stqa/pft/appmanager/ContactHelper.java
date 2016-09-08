package ru.stqa.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.model.ContactData;
import ru.stqa.pft.model.GroupData;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
 public void modify(ContactData contact) {
   selectContactById(contact.getId());
    initContactModification((contact.getId()));

    updateContactForm();
    submitContactModification();
    goToHomePage();
  }

  public void deleteContact() {

    wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();
    wd.switchTo().alert().accept();

  }

  public void selectContact(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();


  }
  public void selectContactById(int id) {
    wd.findElement(By.cssSelector("input[id='" + id + "']")).click();





  }

  public void initContactModification(int id) {
   
    wd.findElement(By.cssSelector("a[href='edit.php?id="+id+"']")).click();}

  public void submitContactModification() {
    click(By.name("update"));
  }


  public void selectContactMofication(int id) {
    wd.findElement(By.cssSelector("input[id='" + id + "']")).click();


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


  public void create(ContactData contact) {
    fillOutContactForm(contact);
    submitContactForm();
    goToHomePage();
  }
  public void delete(int index) {
  selectContact(index);
   deleteContact();
   returnsToHomePage();
  }

  public void delete(ContactData contact) {
    selectContactById(contact.getId());
    deleteContact();
    returnsToHomePage();
  }

  public List<ContactData> list() {
    List<ContactData> contacts = new ArrayList<ContactData>();
    List<WebElement> rows = wd.findElements(By.name("entry"));
   for (WebElement row : rows) {
      List <WebElement> cells = row.findElements(By.tagName("td"));

     String lastname = cells.get(1).getText();

     String firstname = cells.get(2).getText();
     String address = cells.get(3).getText();
     String AllEmails = cells.get(4).getText();
     String Allphones = cells.get(5).getText();

     int id = Integer.parseInt(row.findElement(By.tagName("input")).getAttribute("value"));
     contacts.add(new ContactData().withId(id).withLastname(lastname).withFirstname(firstname).withAlladdress(address)
               .withAllemails(AllEmails).withPhones(Allphones));
   }
    return contacts;
  }
  public Set<ContactData> all() {
   Set<ContactData> contacts = new HashSet<ContactData>();
    List<WebElement> rows = wd.findElements(By.name("entry"));
    for (WebElement row : rows) {
      List<WebElement> cells = row.findElements(By.tagName("td"));
      String lastname = cells.get(1).getText();

      String firstname = cells.get(2).getText();
      String address = cells.get(3).getText();
      String AllEmails = cells.get(4).getText();
      String Allphones = cells.get(5).getText();

      int id = Integer.parseInt(row.findElement(By.tagName("input")).getAttribute("value"));
      contacts.add(new ContactData().withId(id).withLastname(lastname).withFirstname(firstname).withAlladdress(address)
              .withAllemails(AllEmails).withPhones(Allphones));
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

  public void returnsToHomePage() {
    click(By.linkText("home"));

  }


}



