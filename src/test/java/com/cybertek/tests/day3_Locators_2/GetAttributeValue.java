package com.cybertek.tests.day3_Locators_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();

        //I want to get the value of type attributes
        //type = "text" - > get attribute ("attribute name")

        WebElement username = driver.findElement(By.name("username"));
        String valueOfTypeUserName = username.getAttribute("type");
        System.out.println("Value of TYPE OF USERNAME is "+valueOfTypeUserName);

        WebElement password = driver.findElement(By.name("password"));
        String valueOfTypePassword = password.getAttribute("type");
        System.out.println("Value of TYPE OF PASSWORD is " + valueOfTypePassword);

        WebElement loginbttn = driver.findElement(By.id("wooden_spoon"));
        // want to print class attribute
        System.out.println("class: "+loginbttn.getAttribute("class"));
        System.out.println("type: "+loginbttn.getAttribute("type"));
        System.out.println("id: "+loginbttn.getAttribute("id"));





    }
}
