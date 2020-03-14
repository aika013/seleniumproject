package com.cybertek.tests.day3_Locators_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedText {
    public static void main(String[] args) {
        //Locator --> LinkText
        //
        //to locatwe element

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        driver.manage().window().maximize();


        System.out.println("===linkText vs partialText===");
        //linkText
        WebElement exmp3 = driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds"));
        //System.out.println(exmp3.getText());
        String textVersionOfExmpl = exmp3.getText();
        System.out.println(textVersionOfExmpl);

        //partialText
        WebElement exmpl3_2 = driver.findElement(By.partialLinkText("Example 3:"));
        String text = exmpl3_2.getText();
        System.out.println(text);

        System.out.println(driver.findElement(By.linkText("Cybertek School")).getText());


        System.out.println(driver.findElement(By.partialLinkText("Cybertek")).getText());

    }
}

/*
   //ID, name, tagname, class , linkText
        //Locator --> LinkText
        //<a>  a tag is link . in this situation, we will use linkText locator
        //to locate the element
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        driver.manage().window().maximize();


        WebElement example3 = driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds"));
        String textVersionOfExample3 = example3.getText();
        System.out.println(textVersionOfExample3);

        //linkText vs partialLinkText
        //I want to locate Example3 with only a part of it
        WebElement example3_2 = driver.findElement(By.partialLinkText("Example 3:"));
        String text = example3_2.getText();
        System.out.println(text);

 */
