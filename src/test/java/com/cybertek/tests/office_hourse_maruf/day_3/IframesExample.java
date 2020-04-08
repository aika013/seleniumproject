package com.cybertek.tests.office_hourse_maruf.day_3;

import com.cybertek.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IframesExample extends TestBase {

    @Test
    public void test() {
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
        //switch to iframe using id
        driver.switchTo().frame("iframeResult");
        System.out.println(driver.findElement(By.tagName("h2")).getText());

        //switch to iframe using web element
        WebElement innerFrame = driver.findElement(By.cssSelector("iframe[src='demo_iframe.htm']"));
        driver.switchTo().frame(innerFrame);
        System.out.println(driver.findElement(By.tagName("h1")).getText());

        driver.switchTo().defaultContent();
//        driver.switchTo().parentFrame();
//        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.cssSelector("span[class='cm-m-xml cm-meta']")).getText());
    }
}
