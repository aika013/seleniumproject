package com.cybertek.tests.day12_pops_tabs_alerts_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframeExample {
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
    public void test() throws Exception {
        driver.get("http://practice.cybertekschool.com/tinymce");
        Thread.sleep(2000);
        driver.switchTo().frame("mce_0_ifr");
        WebElement textBox = driver.findElement(By.id("tinymce"));
        textBox.clear();
        textBox.sendKeys("great.thanks");
        Thread.sleep(3000);

        //get out of the frame
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.tagName("h3")));

        //TODO switch by webelement
        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        textBox.clear();
        textBox.sendKeys("great.thanks one time");

    }


}
