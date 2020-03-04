package com.cybertek.tests.day1_navigation;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeryURLOfPracticeWeb6 {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. go to Cybertek practice website
                 http://practice.cybertekschool.com/
        2. verify the URL
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");  // we saying go to cybertekschool
        driver.manage().window().maximize();                // open screen for full size

        String expectedURL ="http://practice.cybertekschool.com/";  // check my expecting result

        String actualURL = driver.getCurrentUrl();                  // verifying URL

        if(expectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("I expected " + expectedURL);
            System.out.println("The actual URL is " + actualURL);
        }
        Thread.sleep(3000);

        driver.close();

    }
}
