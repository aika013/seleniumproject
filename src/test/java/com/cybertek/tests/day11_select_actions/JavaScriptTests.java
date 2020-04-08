package com.cybertek.tests.day11_select_actions;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptTests {
    WebDriver driver;
    JavascriptExecutor jse;

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        jse = (JavascriptExecutor )driver;
    }

    @AfterMethod
    public void afterTest() {
        driver.quit();
    }

    @Test
    public void scroll() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/");

        WebElement link = driver.findElement(By.linkText("Cybertek School"));
        Thread.sleep(4000);
        jse.executeScript("arguments[0].scrollIntoView(true);", link);
        Thread.sleep(4000);
    }

    @Test
    public void sendKeysWithJS(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement input = driver.findElement(By.cssSelector("input[disabled]"));

        String text = "hi world";

        jse.executeScript("argument[0].setAttribute('value', '" + text + "')", input);

    }
}
