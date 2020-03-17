package com.cybertek.tests.day8_reviews_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetAttributeExamples {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        //get tittle
        System.out.println(driver.getTitle());

        // get currentUrl
        System.out.println(driver.getCurrentUrl());

        //get page source
        System.out.println(driver.getPageSource());

        WebElement myEbayLink = driver.findElement(By.linkText("My eBay"));

        //get cetrain attributes of the web element
        String classValue = myEbayLink.getAttribute("class");
        System.out.println(classValue);

        String href = myEbayLink.getAttribute("href");
        System.out.println(href);

        //get text of the element
        System.out.println(myEbayLink.getText());

        WebElement input = driver.findElement(By.id("gh-ac"));

        input.sendKeys("wooden spoon");
        System.out.println(input.getAttribute("value"));

        //=>(input.getAttribute("innerHTML")) -> will return the text of the elemnt
        System.out.println(myEbayLink.getAttribute("innerHTML"));

        //(myEbayLink.getAttribute("outerHTML")) => returns html information of element
        System.out.println(myEbayLink.getAttribute("outerHTML"));
        System.out.println(input.getAttribute("outerHTML"));



    }
}
