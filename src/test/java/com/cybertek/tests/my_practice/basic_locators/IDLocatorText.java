package com.cybertek.tests.my_practice.basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocatorText {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement element = driver.findElement(By.id("disappearing_button"));

        String txt = element.getText();

        element.click();

        System.out.println("name of the last button: "+txt);

        driver.close();

    }
}
