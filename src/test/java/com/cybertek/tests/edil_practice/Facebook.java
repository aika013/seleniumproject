package com.cybertek.tests.edil_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver =new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("+13479627395");
        Thread.sleep(2000);

        driver.findElement(By.id("pass")).sendKeys("Tukueva95"+ Keys.ENTER);
        Thread.sleep(2000);

        driver.findElement(By.className("_1frb")).sendKeys("arman birmagambetov"+ Keys.ENTER);
        Thread.sleep(2000);

        driver.findElement(By.linkText("Birmagambetov Arman")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[1]/" +
                "div/div[1]/div/div[3]/div/div[2]/div[2]/div/div/div[2]/a")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div/div/div[4]/div/div[1]" +
                "/div/div/div/div/div/div[1]/div/div[2]/div[4]/div/div/div/span/div/div/" +
                "div[2]/div/div/div/div")).sendKeys("congrats!!"+Keys.ENTER);

























    }
}
