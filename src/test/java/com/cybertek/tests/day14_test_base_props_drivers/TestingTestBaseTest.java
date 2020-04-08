package com.cybertek.tests.day14_test_base_props_drivers;

import com.cybertek.base.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingTestBaseTest extends TestBase {
//♔//
    @Test
    public void testTitle(){
        String url = ConfigurationReader.getProperty("url");
        driver.get(url);

        Assert.assertEquals(driver.getTitle(), "Practice");

    }
}
