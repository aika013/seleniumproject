package com.cybertek.tests.office_hourse_maruf.day_3;

import com.cybertek.base.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutorExamples extends TestBase {

    @Test
    public void test() {
        driver.get(ConfigurationReader.getProperty("url"));
        driver.findElement(By.linkText("Dynamic Controls")).click();

        // JavascriptExecutor -> will CLICK, TYPE, SCROLL  => in "" we can write on of 3
        WebElement webElement = driver.findElement(By.cssSelector("#input-example>input"));

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        String text = "hello";
        jse.executeScript("arguments[0].setAttribute('value','" + text + "')",webElement);
    }

    @Test
    public void highLight(){

    }

    public static void highLight(WebElement element) throws InterruptedException{
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
        Thread.sleep(200);
        jse.executeScript("arguments[0].removeAttribute('style', 'background: yellow; border: 2px solid red;');", element);
        Thread.sleep(200);
    }
}
