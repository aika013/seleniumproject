package com.cybertek.tests.my_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.TreeMap;

public class FacebookLogin {
    public static void main(String[] args) throws InterruptedException {
        //im setting up web driver manager with chrome driver
        WebDriverManager.chromedriver().setup();

        //creating the object from webDriver
        WebDriver driver = new ChromeDriver();

        //im going to use the driver object to make the operations
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.navigate().to("https://www.etsy.com/");

        Thread.sleep(3000);

        driver.navigate().back();

//        Thread.sleep(3000);


        String expectedTitle = "Facebook - Log In or Sign ";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("First pass it is checked the tittle is matching!");
        } else {
            System.out.println("Fail!");
            System.out.println("I was expecting " + expectedTitle);
            System.out.println("I have recieved actualTitle " + actualTitle);
        }

//        if(driver.getTitle().equals("Facebook - Log In or Sign Up")){
//            System.out.println("Pass it is checked the tittle is matching!");
//        }else{
//            System.out.println("Fail!");
//        }

        Thread.sleep(3000);

        driver.findElement(By.id("email")).sendKeys("tukuevaa13@gmail.com");

        driver.findElement(By.id("pass")).sendKeys("Tukueva95");

        driver.findElement(By.id("u_0_b")).click();

        // Thread.sleep(3000);
        driver.findElement(By.id("email")).click();

        driver.findElement(By.id("email")).sendKeys("+13479627395");

        driver.findElement(By.id("pass")).sendKeys("Tukueva95");

        driver.findElement(By.id("loginbutton")).click();


        //driver.close();


    }
}
