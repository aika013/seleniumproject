package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
//Locator 1. ID
    /*
    task
    go to cybertek okta login page
    write email to the text  box
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.get("https://cybertekschool.okta.com/");

        Thread.sleep(3000);

        driver.findElement(By.id("okta-signin-username")).sendKeys("tukuevaa13@gmail.com");

        driver.findElement(By.id("okta-signin-password")).sendKeys("Aika7413");

        driver.findElement(By.id("okta-signin-submit")).submit();

        Thread.sleep(1000);

       driver.findElement(By.xpath("//*[@id=\"form8\"]/div[2]/input")).submit();

//        WebElement element = driver.findElement(By.xpath("//*[@id=\"okta-sign-in\"]/div[2]/div/div/span/div/label"));
//        element.submit();


    }

}

















