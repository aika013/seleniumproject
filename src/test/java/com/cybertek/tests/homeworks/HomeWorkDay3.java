package com.cybertek.tests.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkDay3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        driver.navigate().to("https://www.ebay.com/");

        driver.findElement(By.id("gh-ac")).sendKeys("shoes");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).submit();

        String expectedTitle = "shoes | eBay";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Pass title");
        } else {
            System.out.println("Fail title...");
            System.out.println("I was expecting result is: " + expectedTitle);
            System.out.println("I have got " + actualTitle);
        }
//Keys.ENTER => for click the
        String expectedURL = "https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=shoes&_sacat=0";
        String actualURL = driver.getCurrentUrl();


        if(expectedURL.equals(actualURL)){
            System.out.println("Pass URL");
        }else{
            System.out.println("Fail URL");
        }

        //TakesScreenshot scrnShot = ((TakesScreenshot).webDriver);

        Thread.sleep(2000);

        driver.close();


    }
}
