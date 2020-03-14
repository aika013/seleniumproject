package com.cybertek.tests.day5_more_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassNameExample1 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/login");

        WebElement link = driver.findElement(By.className("nav-link"));

        System.out.println(link.getText());

        //class name does not work is the value os the calss attribute has a space

//        WebElement loginBtn = driver.findElement(By.className("btn btn-primary"));
//        loginBtn.click();


    }
}
