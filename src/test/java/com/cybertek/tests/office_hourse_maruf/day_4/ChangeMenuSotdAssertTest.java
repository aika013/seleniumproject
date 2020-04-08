package com.cybertek.tests.office_hourse_maruf.day_4;

import com.cybertek.base.VyTrackTestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;
import static org.testng.Assert.assertNotEquals;

public class ChangeMenuSotdAssertTest extends VyTrackTestBase {

    @Test
    public void testMenuOption(){
        loginPage.login(ConfigurationReader.getProperty("driver_username"),
                ConfigurationReader.getProperty("driver_password"));
//        asserNotEquals(driver.getCurrentUrl(), "https://app.vytrack.com/user/login");
    }
}
