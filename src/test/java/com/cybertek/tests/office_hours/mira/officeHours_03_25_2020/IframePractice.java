package com.cybertek.tests.office_hours.mira.officeHours_03_25_2020;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class IframePractice {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1() throws Exception {
        driver.get("http://practice.cybertekschool.com/nested_frames");

        Thread.sleep(3000);

        //we landed to the red
        driver.switchTo().frame("frame-top");

        //we landed to the blue web-doc
        List<WebElement> frameList = driver.findElements(By.xpath("//frame"));
        /*
        we have stored all frames web elements inside the list
        1. loop through list
        2. switch to each frame and get text from body
        3. get back to parent frame
        */
        for (int i = 0; i < frameList.size(); i++) {
            driver.switchTo().frame(i);
            String bodyText = driver.findElement(By.xpath("//body")).getText();
            System.out.println("Body text: " + bodyText);
            driver.switchTo().parentFrame();
        }
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        String bodyText = driver.findElement(By.xpath("//body")).getText();
        System.out.println("Body text: " + bodyText);

        driver.switchTo().defaultContent();
    }
}
