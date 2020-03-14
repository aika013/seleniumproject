package com.cybertek.tests.my_practice.basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement home  = driver.findElement(By.className("nav-link"));
        home.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement title = driver.findElement(By.className("h3"));
        String titleText = title.getText();
        System.out.println(titleText);

        //NEXT LINE WILL FAIL // IT IS SUPPOSED TO BE FAIL
        //IF CLASS HAS A SPACE WE CAN NOT USE IT
        WebElement button1 = driver.findElement(By.className("btn btn-primary"));
        String bttn1 = button1.getText();
        System.out.println(bttn1);

    }
}
