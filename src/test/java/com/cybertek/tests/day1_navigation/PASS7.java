package com.cybertek.tests.day1_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PASS7 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().fullscreen();

        driver.get("https://google.com");
        String gg = "Google";

        driver.navigate().to("https://www.etsy.com/");
        String etsyTt = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        driver.navigate().back();

        if (driver.getTitle().equals(gg)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        driver.navigate().forward();

        if (driver.getTitle().equals(etsyTt)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        driver.close();
    }
}
