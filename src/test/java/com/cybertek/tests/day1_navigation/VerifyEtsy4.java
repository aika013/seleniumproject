package com.cybertek.tests.day1_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyEtsy4 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver etsy = new ChromeDriver();

        String practiceURL = "https://www.etsy.com/";
        etsy.get(practiceURL);

        etsy.manage().window().maximize();

        String expTl = "etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        String actRes = etsy.getTitle();

        if(expTl.equalsIgnoreCase(actRes)){
            System.out.println("The test is PASS");
        }else{
            System.out.println("The test is FAILed");
            System.out.println("I exepected '" + expTl+"'");
            System.out.println("The actual result is " + actRes);
        }

        //etsy.close();

    }
}
