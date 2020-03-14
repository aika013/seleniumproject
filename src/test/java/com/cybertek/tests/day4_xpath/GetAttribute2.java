package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        //EXp #1
        WebElement exmp1 = driver.findElement(By.partialLinkText("Example 1:"));
        System.out.println(exmp1.getAttribute("href"));
        System.out.println(exmp1.getAttribute("name"));
        System.out.println(exmp1.getAttribute("type"));

        //
        // driver.close();

    }
}
