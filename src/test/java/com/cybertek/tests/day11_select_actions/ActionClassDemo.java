package com.cybertek.tests.day11_select_actions;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class ActionClassDemo {
    WebDriver driver;
    Actions actions;

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        actions = new Actions(driver);

    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

    @Test
    public void hoverTest() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");

        Thread.sleep(2000);
        WebElement target = driver.findElement(By.tagName("img"));

        //moveToElement() --> moves the mouse on the top of given web element
        actions.moveToElement(target).perform();
        Thread.sleep(2000);

    }

    @Test
    public void hover2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/jqueryui/menu");
        WebElement enabled = driver.findElement(By.id("ui-id-3"));
        WebElement download = driver.findElement(By.id("ui-id-4"));
        WebElement pdf = driver.findElement(By.id("ui-id-5"));

        actions.
                moveToElement(enabled).
                pause(2000).
                moveToElement(download).
                pause(2000).
                click(pdf).
                build().perform();

        //multiple actions -> build, single action -> no build

    }

    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

       WebElement money =  driver.findElement(By.id("draggable"));
       WebElement bank =  driver.findElement(By.id("droptarget"));
       Thread.sleep(2000);
       actions.dragAndDrop(money,bank).perform();
        Thread.sleep(2000);
    }

    @Test
    public void scrollDown() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement money =  driver.findElement(By.id("draggable"));
        WebElement bank =  driver.findElement(By.id("droptarget"));

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        actions.dragAndDrop(money, bank).perform();
        Thread.sleep(2000);
    }

    @Test
    public void drugAndDropAgain() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement money =  driver.findElement(By.id("draggable"));
        WebElement bank =  driver.findElement(By.id("droptarget"));
        Thread.sleep(2000);
        actions.moveToElement(money).clickAndHold().moveToElement(bank).release().build().perform();
        Thread.sleep(2000);
    }
}
