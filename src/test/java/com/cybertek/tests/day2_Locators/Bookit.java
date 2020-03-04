package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookit {
    public static void main(String[] args) throws InterruptedException {
        /*
           Task 1:
1. Go to Bookit login page
https://cybertek-reservation-qa.herokuapp.com/sign-in
2. Verify the title of the page
Task 2:

         */
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//task 1
        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");

        Thread.sleep(3000);
// expected vs actual for verify
        String expectedTitle = "bookit";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("pass - checked the tittle is matching!");
        }else{
            System.out.println("Fail!");
            System.out.println("I was expecting " + expectedTitle);
            System.out.println("I have recieved actualTitle " + actualTitle);
        }

        driver.getCurrentUrl();



    }
}






















