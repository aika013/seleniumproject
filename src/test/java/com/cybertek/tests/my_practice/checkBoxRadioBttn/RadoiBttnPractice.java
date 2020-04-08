package com.cybertek.tests.my_practice.checkBoxRadioBttn;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class RadoiBttnPractice {
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
    public void testRadioBttn() throws Exception {
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        Thread.sleep(2000);
        List<WebElement> radioBttn = driver.findElements(By.cssSelector("input[type='radio']"));
        for(WebElement radio : radioBttn){
            System.out.println(radio.getAttribute("id"));
        }

    }
}

