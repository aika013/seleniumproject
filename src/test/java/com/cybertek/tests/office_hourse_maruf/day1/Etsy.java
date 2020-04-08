package com.cybertek.tests.office_hourse_maruf.day1;

import com.cybertek.base.TestBase;
import com.cybertek.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Etsy extends TestBase {
    /*
    search for wooden spoon on etsy
    verify title contains the searchterm
    verify that default shipt to location is Ship to
    verify Ship to countries include Australia
     */

    @Test
    public void verifyCountryList() {
        driver.get("https://etsy.com");
        WebElement input = driver.findElement(By.id("global-enhancements-search-query"));
        input.sendKeys("wooden spoon" + Keys.ENTER);

        String expectedTitle = "Wooden spoon | Etsy";

        // wait a little until title changes to right one
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // using explicit wait to wait until title contains Wooden spoon | Etsy
        wait.until(ExpectedConditions.titleContains(expectedTitle));

        Assert.assertEquals(driver.getTitle(), expectedTitle);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Select shipToList = new Select(driver.findElement(By.name("ship_to")));

        String expectedDefaultCountry = "United States";
        // get the selected element and get its text
        String actualDefaultCountry = shipToList.getFirstSelectedOption().getText().trim();
        Assert.assertEquals(actualDefaultCountry, expectedDefaultCountry);

        //verify that ship to countries include Australia
        //Assert.assertTrue(shipToList.getOptions().contains("Australia"));

        List<String> options = BrowserUtils.getElementsText(shipToList.getOptions());
        Assert.assertTrue(options.contains("Australia"));

        //verify free shipping is not claicked
        WebElement freeShipping = driver.findElement(By.xpath("//label[.='FREE shipping']"));
        Assert.assertFalse(freeShipping.isSelected());

        //verify url changes whe free shipping is clicked
        freeShipping.click();

        String expectedUrl = "free_shipping=true";
        Assert.assertTrue(driver.getCurrentUrl().endsWith(expectedUrl));

    }
}