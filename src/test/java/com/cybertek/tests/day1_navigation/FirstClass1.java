package com.cybertek.tests.day1_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass1 {
    public static void main(String[] args) throws InterruptedException {

        // binary connecting the driver with browsers
        WebDriverManager.chromedriver().setup();

        //web driver --> Interface
        // I have a driver
        WebDriver driver = new ChromeDriver();

        // I want to open google home page

        //how do you lunch / open a web page?
        //by using get() --> url as String
        driver.get("https://www.google.com");

        //Navifations
        //navigate().to() --> open a web page

        driver.navigate().to("https://www.facebook.com");

        //get() vs navigate().to()
        //get() --> wait to load the page fully
        //to() --> does not wait

        //navigate().back()
        //go go google 2. go to cybertek practice website
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().to("http://practice.cybertekschool.com/");
        Thread.sleep(3000);
        driver.navigate().back();

    }
}
