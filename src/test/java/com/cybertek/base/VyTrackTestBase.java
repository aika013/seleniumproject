package com.cybertek.base;

import com.cybertek.pages.CreateCalendarEventPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.pages.VehiclePage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class VyTrackTestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected VehiclePage vehiclePage;
    protected CreateCalendarEventPage createCalendarEventPage;




    @BeforeMethod
    public void setUpMethod() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get(ConfigurationReader.getProperty("vytrack_url"));
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        vehiclePage = new VehiclePage();
        createCalendarEventPage = new CreateCalendarEventPage();
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        //close the driver
        Thread.sleep(5000);

        //then make the object null value
        Driver.closeDriver();
    }
}
