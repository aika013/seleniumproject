package com.cybertek.tests.office_hourse_maruf.day_4;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionsExamples {

    @Test
    public void test1(){
        Assert.assertEquals(11, 1 ,"first assertion fail ");
        Assert.assertEquals(2, 2, "second assertion pass ");
    }

    @Test
    public void test2(){
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(1, 1);
        softAssert.assertEquals(2, 2);
        softAssert.assertAll();
    }

    @Test
    public void test3(){
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(false, "first assertion");
        System.out.println("first assertion done");

        softAssert.assertTrue(false, "second assertion");
        System.out.println("second assertion done");

        softAssert.assertTrue(true, "third assertion");
        System.out.println("third assertion done");

        softAssert.assertTrue(true, "fourth assertion");
        System.out.println("fourth assertion done");

        //report all of the soft asserts , if any of the soft assert ever failed , throws assertion error
        softAssert.assertAll();

        softAssert.assertTrue(false, "fifth assertion");
        System.out.println("fifth assertion done");


    }
}
