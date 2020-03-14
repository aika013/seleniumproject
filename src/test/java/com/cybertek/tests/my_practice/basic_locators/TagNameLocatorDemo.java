package com.cybertek.tests.my_practice.basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameLocatorDemo {
    public static void main(String[] args) {
        WebDriver diver = WebDriverFactory.getDriver("chrome");
        diver.manage().window().maximize();
        diver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullName = diver.findElement(By.tagName("input"));
        fullName.sendKeys("John Doe");

        WebElement email = diver.findElement(By.name("email"));
        email.sendKeys("johndoe@cybertekschool.com");

        WebElement signUp = diver.findElement(By.tagName("button"));
        signUp.click();
     }
}
