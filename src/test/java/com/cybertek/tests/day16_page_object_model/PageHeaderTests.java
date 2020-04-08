package com.cybertek.tests.day16_page_object_model;

import com.cybertek.base.TestBase;
import com.cybertek.base.VyTrackTestBase;
import com.cybertek.pages.DashboardPage;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class PageHeaderTests extends VyTrackTestBase {

    // go to vyrack
    // login as driver
    // verify  header is "Quick Launchpad"

    @Test
    public void dashboardPageTest(){
        String username = ConfigurationReader.getProperty("driver_username");
        String password = ConfigurationReader.getProperty("driver_password");
        loginPage.login(username, password);

        DashboardPage dashboardPage = new DashboardPage();
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageHeader, "Quick Launchpad"));
        String actual = dashboardPage.pageHeader.getText();
        assertEquals(actual, "Quick Launchpad");
    }


//    go to vyrack
    // go to Fleet vehicles
    // login as driver
    // verify  header is "Cars"

    @Test
    public void fleetVehicleTest() throws Exception{
        String username = ConfigurationReader.getProperty("driver_username");
        String password = ConfigurationReader.getProperty("driver_password");
        loginPage.login(username, password);

        // change page
        wait.until(ExpectedConditions.elementToBeClickable(dashboardPage.fleet));
        dashboardPage.fleet.click();
        wait.until(ExpectedConditions.elementToBeClickable(dashboardPage.fleet));
        dashboardPage.vehicles.click();

        wait.until(ExpectedConditions.textToBePresentInElement(vehiclePage.pageHeader, "Cars"));
        String actual = vehiclePage.pageHeader.getText();
        assertEquals(actual, "Cars");
    }
}
