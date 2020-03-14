package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VyTrack {
    /*
    1. go to VyTrack login page
    2. write user name  data:storemanager52
    3. write password UserUser123
    4. click login button
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.get("https://app.vytrack.com/user/login");

        Thread.sleep(2000);

        driver.findElement(By.id("prependedInput")).sendKeys("storemanager52");

        Thread.sleep(2000);

        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");

        Thread.sleep(2000);

        driver.findElement(By.id("_submit")).submit();

        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("First pass it is checked the tittle is matching!");
        } else {
            System.out.println("Fail!");
            System.out.println("I was expecting " + expectedTitle);
            System.out.println("I have recieved actualTitle " + actualTitle);
        }

        driver.close();
    }
}
