package com.cybertek.tests.day1_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL5 {
        /*
        1 go to etsy
        2. verifi URL
         */
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup(); // to connect and setup
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.etsy.com/"); // to open the wb site
            driver.manage().window().maximize(); // to make window full size

            // for verify title --> getTitle()
            //for verify URL -->
            String expectedURL = "https://www.etsy.com/";

            String actualURL = driver.getCurrentUrl();

            if(expectedURL.equals(actualURL)){
                System.out.println("pass");
            }else{
                System.out.println("FAIL");
                System.out.println("I expected " + expectedURL);
                System.out.println("The actual URL is " + actualURL);
            }

            driver.close();


    }
}
