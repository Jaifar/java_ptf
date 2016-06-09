package ru.stqa.pft.Addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class eee {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void eee() {
        wd.get("http://www.msn.com/?pc=SK216&ocid=SK216DHP&osmkt=en-us");
        wd.findElement(By.id("skypefreclose")).click();
        wd.findElement(By.linkText("Sign in")).click();
        new Actions(wd).doubleClick(wd.findElement(By.cssSelector("div.placeholder"))).build().perform();
        wd.findElement(By.id("i0116")).click();
        wd.findElement(By.id("i0116")).clear();
        wd.findElement(By.id("i0116")).sendKeys("tanyahabary@gmail.com");
        wd.findElement(By.xpath("//div[@id='CredentialsInputPane']/div[4]/div[2]/div/fieldset/div[2]/div/div/div/div/div")).click();
        wd.findElement(By.id("i0118")).click();
        wd.findElement(By.id("i0118")).clear();
        wd.findElement(By.id("i0118")).sendKeys("Askask1987");
        wd.findElement(By.id("idSIButton9")).click();
        wd.findElement(By.id("signup")).click();
        wd.navigate().back();
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
