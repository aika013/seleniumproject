package com.cybertek.base;

import com.cybertek.utilities.Driver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = Driver.getDriver();
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        //close the driver
        Thread.sleep(5000);

        //then make the object null value
        Driver.closeDriver();
    }


}