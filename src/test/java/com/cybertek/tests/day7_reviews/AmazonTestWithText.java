package com.cybertek.tests.day7_reviews;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTestWithText {
    /**
     * open browser
     * go to amazon
     * search for any item
     * remember the name of the second result
     * click on the second result
     * verify that product name is same in the product page
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        String needsToFind = "Learning Selenium Testing Tools Second Edition";
        WebElement searchBox = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div[3]/div/input"));
        searchBox.sendKeys(needsToFind + Keys.ENTER);

        Thread.sleep(2000);
        WebElement searchBook = driver.findElement(By.xpath("//span[.='Selenium Testing Tools Cookbook - Second Edition']"));
        System.out.println(searchBook.getText());
        searchBook.click();
        driver.close();

    }
}
