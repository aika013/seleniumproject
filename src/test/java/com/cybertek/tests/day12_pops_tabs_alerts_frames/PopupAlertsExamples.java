package com.cybertek.tests.day12_pops_tabs_alerts_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupAlertsExamples {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void htmlPopup() throws Exception {
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
        WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[3]/form/button/span"));
        button.click();
        Thread.sleep(1000);
        WebElement noooo = driver.findElement(By.xpath("//span[.='No']"));
        noooo.click();
        Thread.sleep(1000);
    }

    @Test
    public void jsAlertsAccept() {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        WebElement button1 = driver.findElement(By.xpath("//button[1]"));
        button1.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }


    @Test
    public void jsAlertsCancel() {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        WebElement button2 = driver.findElement(By.xpath("//button[2]"));
        button2.click();

        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }


    @Test
    public void jsAlertsSendKeys() {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        WebElement bttn3 = driver.findElement(By.xpath("//button[3]"));
        //bttn3.click();

        Alert alert = null;

        try {
            alert = driver.switchTo().alert();
            alert.sendKeys("Admiral Kunkka");
            alert.accept();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }

    }



}
