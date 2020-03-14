package com.cybertek.tests.my_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmznCard {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.get("https://www.amazon.com/");

        Thread.sleep(2000);

        driver.findElement(By.name("field-keywords")).sendKeys("wooden spoon");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).submit();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/div[2]/h2")).click();
    }
}
