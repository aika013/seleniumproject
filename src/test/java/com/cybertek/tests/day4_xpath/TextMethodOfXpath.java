package com.cybertek.tests.day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextMethodOfXpath {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //locate element context menu
        driver.get("http://practice.cybertekschool.com/context_menu");

        WebElement text = driver.findElement(By.xpath("//h3[text()='Context Menu']")); //relative

        String expText = "Context Menu";

        String actText = text.getText();

        if(actText.equals(expText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        //System.out.println(driver.findElement(By.xpath("/html/body/div/div[2]/div/div/h[3]/"))); // absolute x-path





    }
}
