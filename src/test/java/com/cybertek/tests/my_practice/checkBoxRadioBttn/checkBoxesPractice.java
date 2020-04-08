package com.cybertek.tests.my_practice.checkBoxRadioBttn;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class checkBoxesPractice {
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
    public void test1() throws Exception{
        driver.get("http://practice.cybertekschool.com/checkboxes");
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(1)")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(2)")).click();


        // click on that checkbox wich is not clicked
        List<WebElement> checkBoxes  = driver.findElements(By.tagName("input"));
        for(WebElement checkbox : checkBoxes){
            Thread.sleep(2000);
            if(!checkbox.isSelected()){
                checkbox.click();
            }
        }
    }
}
