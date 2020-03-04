package com.cybertek.tests.day1_navigation;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations2 {
    public static void main(String[] args) throws InterruptedException {

        /*
        driver.navigate().to("URL")
        driver.navigate().back()
        driver.navigate().forward()
        driver.navigate().refresh()

         */

        //navigate().forward()
        //go to practice -> go to google -> back to practice -> forward to google

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // i want to see full window
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        String practiceWebURL = "http://practice.cybertekschool.com/";

        //go to practice
        driver.get(practiceWebURL);

        Thread.sleep(3000);

        //go to google
        String ggURL = "https://www.google.com";
        driver.navigate().to(ggURL);

        //back to practice
        driver.navigate().back();

        Thread.sleep(3000);

        //back to google
        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        Thread.sleep(2000);

        //close driver
        //close the current web browser ONLY
        driver.close();

        //close down all the web browser
        driver.quit();


    }
}
