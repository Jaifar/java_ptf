package ru.stqa.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.model.ContactData;

/**
 * Created by Owner on 7/7/2016.
 */
public class ContactHelper extends ContactHelperBase {

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void returnToHomePage() {
    wd.findElement(By.linkText("home page")).click();
  }

  public void submitContactForm() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  public void fillOutContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirstname());
    wd.findElement(By.cssSelector("label")).click();
    type(By.name("middlename"), contactData.getMiddlename());
    wd.findElement(By.name("theform")).click();
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

}
