package com.cybertek.tests.day7_reviews;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonWithCss {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        WebElement todayDeal = driver.findElement(By.cssSelector("a[tabindex='47']"));
        todayDeal.click();

        String expected = "Today' Deals";
        WebElement topHeader = driver.findElement(By.cssSelector(".nav-a-content"));
        System.out.println(topHeader.getText());

        if (expected.equalsIgnoreCase(topHeader.getText())){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expected = " + expected);
            System.out.println("actual = " + topHeader.getText());
        }

        WebElement bttmHeader = driver.findElement(By.cssSelector("h1>div:nth-of-type(1)"));
        System.out.println(bttmHeader.getText());

        if(expected.equals(bttmHeader.getText())){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expected = " + expected);
            System.out.println("actual = " + bttmHeader.getText());
        }

        driver.close();

    }
}
