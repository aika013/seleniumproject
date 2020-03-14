package com.cybertek.tests.day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathPractice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");

        //absolute x-path locate username box
        WebElement userNameBox = driver.findElement(By.xpath("//*[@id=\"login\"]/div[1]/div/input"));
        userNameBox.sendKeys("tukuevaa13@gmail.com");

        //relative x-path locate password box
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[2]/div/input")).sendKeys("aika456789");


    }
}
