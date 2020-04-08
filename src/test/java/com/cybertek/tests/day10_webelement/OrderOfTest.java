package com.cybertek.tests.day10_webelement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderOfTest {
    String title= "cbt";

    @Test(priority = 1)
    public void login(){
        System.out.println("opening the browsers");
        System.out.println("capturing title");
        title = "cbt";
    }

    @Test(priority = 0)
    public void assertTitle(){
        System.out.println("verifying the title");
        Assert.assertEquals(title, "cbt");
    }

    @Test (priority = 55, dependsOnMethods = "login")
    public void verifyOtherThings(){
        System.out.println("verify something else ");
    }
}
