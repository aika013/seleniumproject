package com.cybertek.tests.office_hourse_maruf.day_2;

import com.cybertek.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTablesPractice extends TestBase {

    @BeforeMethod
    public void setUpTest() {
        driver.get("https://www.mockaroo.com/");
        driver.findElement(By.id("num_rows")).clear();
        driver.findElement(By.id("num_rows")).sendKeys("10");
        driver.findElement(By.id("preview")).click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.switchTo().frame("preview_iframe");
    }

    @Test
    public void testHeaderCount() {


        WebElement table = driver.findElement(By.xpath("//table"));
        System.out.println(table.getText());

        //get all the in the table
        List<WebElement> headers = driver.findElements(By.xpath("//table[@style]//th"));
        Assert.assertEquals(headers.size(), 6);
    }

    /*
    verify that value of each entry under gender column is equal to male or female
     */
    @Test
    public void verifyGender() {
        List<WebElement> allGenders = driver.findElements(By.xpath("//table[@style]/tbody/tr/td[5]"));
        System.out.println(allGenders.size());

        //go throug the list
        // verify that values is ether mala or female
        for (WebElement gender : allGenders) {
            String actual = gender.getText();
            Assert.assertTrue(actual.equals("Male") || actual.equals("Female"));
        }
    }

    @Test
    public int getColumn() {
        return driver.findElements(By.xpath("//table[@id='table1'//th]")).size();
    }

    @Test
    public void test() {
        String firstName = "Jason";
        String xpath = "//table[@id='table1']//td[2][.='" + firstName + "']/../td[4]";
        WebElement amount = driver.findElement(By.xpath(xpath));
        Assert.assertEquals(amount.getText(), "$100,00");
    }


}

