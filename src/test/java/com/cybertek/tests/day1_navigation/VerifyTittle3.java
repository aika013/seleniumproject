package com.cybertek.tests.day1_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTittle3 {
    public static void main(String[] args) {
        /*
        1. Go to Cybertek practice web cite
        2. verify tittle  expected tittle:Practice

        Actual tittle ? -->
         */

        //connect browser and driver
        // setup driver
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        String practiceURL = "http://practice.cybertekschool.com/";

        driver.get(practiceURL);

        driver.manage().window().maximize();

        //2.->

        String expectedTittle = "practice";

        String actualResult = driver.getTitle();

        if(expectedTittle.equals(actualResult)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("I exepected '" + expectedTittle+"'");
            System.out.println("The actual result is '"+ actualResult+"'");
        }

        driver.close();

































    }
}
