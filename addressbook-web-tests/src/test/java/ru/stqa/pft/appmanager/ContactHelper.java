package ru.stqa.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.model.ContactData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Owner on 7/17/2016.
 */
public class ContactHelper extends ContactHelperBase {

  private int contactCount;


  public ContactHelper(FirefoxDriver wd) {
    super(wd);

  }

  public void returnToHomePage() {
    click(By.linkText("home page"));
  }

  public void submitContactForm() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillOutContactForm(ContactData contactData) {
    wd.get("http://localhost/addressbook/edit.php");
    type(By.name("firstname"), contactData.getFirstname());
    click(By.cssSelector("label"));
    type(By.name("middlename"), contactData.getMiddlename());
    click(By.name("theform"));
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("nickname"), contactData.getNickname());
    type(By.name("title"), contactData.getTitle());
    type(By.name("company"), contactData.getCompany());
    type(By.name("address"), contactData.getAddress());
    type(By.name("home"), contactData.getHomephone());
    type(By.name("mobile"), contactData.getMobile());
    type(By.name("work"), contactData.getWorkphone());
    type(By.name("email"), contactData.getEmail());
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
    wd.findElement(By.xpath("//div[@id='content']/form[1]/input[22]")).click();
  }


  public void selectContactMofication() {
    wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();
  }

  public void updateContactForm() {
    wd.findElement(By.name("nickname")).click();
    wd.findElement(By.name("nickname")).clear();
    wd.findElement(By.name("nickname")).sendKeys("Jaifar-Jaifar");
  }

  public void createContact (ContactData contact) {
    fillOutContactForm(contact);
    submitContactForm();
    returnToHomePage();


  }

  private void logOut() {

  }

  public boolean isThereAContact() {
    return isElementPresent(By.xpath("selected[]"));
  }

  private boolean isElementPresent(By id) {

      try {
        wd.findElement(id);
        return true;
      }catch (NoSuchElementException ex){
        return false;
      }}


  public int getContactCount() {
    return wd.findElements(By.name("selected[]")).size();
  }

  public List<ContactData> getContactList() {
    List<ContactData> contacts = new ArrayList<ContactData>();
    List<WebElement>elements = wd.findElements(By.cssSelector("span.contact"));
    for (WebElement element : elements) {
      String name = element.getText();

      ContactData contact = new ContactData("firstname", "middlename", "lastname", "nickname", "title", "company", "address", "homephone", "mobile", " workphone", "email");
      contacts.add(contact);
    }

    return contacts;
  }}


