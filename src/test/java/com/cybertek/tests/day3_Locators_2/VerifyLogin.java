package com.cybertek.tests.day3_Locators_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/login");

        //tomsmith
        //SuperSecretPassword

        driver.findElement(By.name("username")).sendKeys("tomsmith");

        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");

        driver.findElement(By.xpath("//*[@id=\"wooden_spoon\"]")).submit();

        WebElement welcomeMessage = driver.findElement(By.tagName("h4"));

        //verify the mesaage
        //expe and actual
        String expMessagse = "Welcome to the Secure Area. When you are done click logout below.";

        //string vs WebElemnt => we need to convert to string
        //getText() => for converting webElement to String take text from element
        String actMessage = welcomeMessage.getText();

        if(actMessage.equals(expMessagse)){
            System.out.println("Pass.. message found");
        }else{
            System.out.println("Fail");
            System.out.println("I was expecting "+ expMessagse);
            System.out.println("I get: " + actMessage);
        }




    }
}
