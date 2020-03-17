package com.cybertek.tests.day8_reviews_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbaySearchTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        WebElement input = driver.findElement(By.id("gh-ac"));
        input.sendKeys("wooden spoon" + Keys.ENTER);
        Thread.sleep(2000);
        WebElement countEl = driver.findElement(By.cssSelector("h1>span"));
        String count = countEl.getText();
        System.out.println(count);

        int count1 = Integer.parseInt(count.replace(",", ""));
        System.out.println(count1);

        WebElement all = driver.findElement(By.linkText("All"));
        all.click();
        Thread.sleep(2000);

// re initialized the element that is throwing the StateElemtntExeption
        countEl = driver.findElement(By.cssSelector("h1>span"));
        count = countEl.getText();
        System.out.println(count);

        int count2 = Integer.parseInt(count.replace(",", ""));
        System.out.println(count2);

        if (count1 < count2) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("count1 = " + count1);
            System.out.println("count2 = " + count2);
        }

        driver.navigate().back();

        input = driver.findElement(By.id("gh-ac"));
        String woodenSpoon = input.getAttribute("value"); //getAttribute("outerHTML"), getAttribute("innreHTML"), getAttribute(value) , getText();
        System.out.println(woodenSpoon);

        if (woodenSpoon.equals("wooden spoon")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("Expected result = " + "woodenSpoon");
            System.out.println("Actual = " + woodenSpoon);
        }
        driver.navigate().back();

        Thread.sleep(2000);
        input = driver.findElement(By.id("gh-ac"));
        woodenSpoon = input.getAttribute("value");
        System.out.println("woodenSpoon = " + woodenSpoon);

        if(woodenSpoon.isEmpty()){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected a blank value");
            System.out.println("Actual: " + woodenSpoon);
        }
        driver.quit();
    }
}
