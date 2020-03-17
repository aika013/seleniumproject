package com.cybertek.tests.day7_reviews;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StaleElementExample {
    private static void secondNameMatchTest() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        String searchTerm = "disinfectant wipes";

        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        searchInput.sendKeys(searchTerm);

        WebElement searchBttn = driver.findElement(By.className("nav-input"));
        searchBttn.click();

        WebElement firstResult = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        System.out.println(firstResult.getText());

        Thread.sleep(2000);

        //write xpath that captures

        String expectedName = firstResult.getText();
        firstResult.click();

        WebElement productName = driver.findElement(By.id("productTitle"));
        String actualName= productName.getText();
        System.out.println(actualName);

        if(expectedName.equalsIgnoreCase(actualName)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedName = " + expectedName);
            System.out.println("actualName = " + actualName);
        }
        driver.close();
    }
}
