package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickVsSubmit {
    /*
        Click()
        sybmit()
        task:
        1. go to forgot password web page
        http://practice.cybertekschool.com/forgot_password
       2.  enter any email
       3. click "retrieve password" bttb
        4. verify the URL is:
        http://practice.cybertekschool.com/email_sent
         */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        driver.findElement(By.name("email")).sendKeys("tukuevkaa13@gmail.com");

        driver.findElement(By.id("form_submit")).submit();

        // Verify URL
        String expectedURL = "http://practice.cybertekschool.com/email_sent";
        String actualURL = driver.getCurrentUrl();
        if(expectedURL.equals(actualURL)){
            System.out.println("PASS for URL");
        }else {
            System.out.println("FAIL for URL");
        }

        // Verify text message
        String expText = "Your e-mail's been sent!";
        String actText = driver.findElement(By.name("confirmation_message")).getText();
        if(expText.equals(actText)){
            System.out.println("PASS for text message");
        }else {
            System.out.println("FAIL for text messege");
        }

    }

}
