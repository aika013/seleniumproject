package com.cybertek.tests.my_practice.basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XpathLocator {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void absoluteXpath() throws Exception {  // we should start form the top ot the code
        driver.get("http://practice.cybertekschool.com/");
        WebElement dropdownLink = driver.findElement(By.xpath("/html/body/div/div[2]/div/ul/li[11]/a"));
        Thread.sleep(3000);
        dropdownLink.click();
    }

    @Test
    public void relativeXpath() throws  Exception{
        /*we can start lookin from anywhere,
        // -> starts from
        tagname ->
        @ -> attribute
        = -> value
        //tagneme[@attibutr='value']
     */
        driver.get("http://practice.cybertekschool.com/");
        WebElement nameOfElement = driver.findElement(By.xpath("//span[@class='h1y']"));
        WebElement contextMenueLink = driver.findElement(By.xpath("//a[.='Context Menu']"));
        Thread.sleep(3000);
        System.out.println(nameOfElement.getText().toUpperCase());
        System.out.println(contextMenueLink.getText().toUpperCase());
    }
}
