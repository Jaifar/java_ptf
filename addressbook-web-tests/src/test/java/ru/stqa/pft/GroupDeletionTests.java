package ru.stqa.pft;

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

public class GroupDeletionTests {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void testgroupDeletion() {
        wd.get("https://login.live.com/ppsecure/post.srf?wa=wsignin1.0&rpsnv=12&ct=1465487979&rver=6.7.6643.0&wp=&wreply=https:%2f%2fwww.msn.com%2fen-us%2fhomepage%2fSecure%2fPassport%3fru%3dhttp%253a%252f%252fwww.msn.com%252f%253fpc%253dSK216%2526ocid%253dSK216DHP%2526osmkt%253den-us%2526pfr%253d1&lc=1033&id=1184&mkt=en-us&pcexp=True&bk=1465487991&uaid=64ce55e70a484ec08898c2f334e27c7c&pid=0");
        wd.get("http://localhost/addressbook/group.php");
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).sendKeys("\\undefined");
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys("admin");
        wd.findElement(By.id("LoginForm")).click();
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys("secret");
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
        wd.findElement(By.linkText("groups")).click();
        new Actions(wd).clickAndHold(wd.findElement(By.name("selected[]"))).build.perform();
        wd.findElement(By.xpath("//div[@id='content']/form/input[5]")).click();
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
