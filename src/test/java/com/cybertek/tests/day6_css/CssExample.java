package com.cybertek.tests.day6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// # => id name
// . => class name
// ^ => starts with
// $ => ends with
// * => contains
// =>
public class CssExample {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button = driver.findElement(
    By.cssSelector("[onclick='button1()']")); //.nav-link , .col-md-4.col-4, .col-md-4, html>body>nav>ul>li>a, button, [onclick='button1()'] ,
        System.out.println(button.getText());

        driver.close();
    }
}
