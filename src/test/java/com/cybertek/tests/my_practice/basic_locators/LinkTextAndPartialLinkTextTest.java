package com.cybertek.tests.my_practice.basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPartialLinkTextTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //link text
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        WebElement linkTxt = driver.findElement(By.linkText("Example 6: Loading overlay that disappears and disappears again"));
        System.out.println("first text: "+linkTxt.getText());

        WebElement cbt = driver.findElement(By.linkText("Cybertek School"));
        System.out.println("second text: "+cbt.getText());

        //partial linked text
        WebElement partTxt = driver.findElement(By.partialLinkText("Example 1:"));
        System.out.println("partialLinkedTxt: "+partTxt.getText());


    }
}
