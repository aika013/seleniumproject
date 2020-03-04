package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBookItURL {
    /*
    2. Go to Bookit login page
    https://cybertek-reservation-qa.herokuapp.com/sign-in
    2. Verify that URL contains “cybertek-reservation”
    */
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(" https://cybertek-reservation-qa.herokuapp.com/sign-in");

        driver.manage().window().maximize();

        String expectedURL = "cybertek-resrvation";
        String actualURL = driver.getCurrentUrl();


        if(expectedURL.equals(actualURL)){
            System.out.println("pass - checked the tittle is matching!");
        }else{
            System.out.println("Fail!");
            System.out.println("I was expecting " + expectedURL);
            System.out.println("I have recieved actualTitle " + actualURL);
        }
    }


}
