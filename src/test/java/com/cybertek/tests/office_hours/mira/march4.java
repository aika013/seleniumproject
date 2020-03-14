package com.cybertek.tests.office_hours.mira;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class march4 {
    public static void main(String[] args) throws InterruptedException {
  /*
        1. Go to https://automationpractice.com
        2. Search for 'tShirt' in a searchBox + click enter ot click search button
        3. validate you got 'no results' message on UI
       4. search for 'tshirt'
       5.validate there was 1 result found
       */
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://automationpractice.com");

        WebElement search_box = driver.findElement(By.id("search_query_top"));
        search_box.sendKeys("t-shirt" + Keys.ENTER);
//Keys.ENTER => Click the Enter key

        /*
        <p class ="alert alert warning">
        No results were found for your search and nbsp;"tshirt"
        </p>
         */

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement error = driver.findElement(By.xpath("//p[@class='alert alert-warning']"));
        String errorText = error.getText();
        //getText()-->returns String(text) from element
        System.out.println("Error message" + errorText);
        //noSuchElementException - it means we could notlocate the element

        search_box = driver.findElement(By.id("search_query_top"));
        search_box.clear();

        search_box.sendKeys("t-shirt" + Keys.ENTER);

        //StaleElementExeptionReferenceException = element is old/stale - we want to finde
        //this element again or refresh the code

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread.sleep(3000);

        WebElement count = driver.findElement(By.className("product-count"));
        System.out.println("items found: " + count.getText());

        WebElement addToCard = driver.findElement(By.className("button ajax_add_to_cart_button btn btn-default"));
        driver.quit();

                /*
        <a class="button ajax_add_to_cart_button btn btn-default"
        href="http://automationpractice.com/index.php?controller=cart&amp;add=1&amp;id_product=1&amp;token=e817bb0705dd58da8db074c69f729fd8"
        rel="nofollow" title="Add to cart" data-id-product="1">
            <span>Add to cart</span>
        </a>
        a - link
        span - description
         */
        WebElement addToCart = driver.findElement(By.className("button ajax_add_to_cart_button btn btn-default"));
        addToCart.click();
//        driver.quit();

    }
}



