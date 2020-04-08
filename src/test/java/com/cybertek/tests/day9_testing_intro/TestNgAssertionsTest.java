package com.cybertek.tests.day9_testing_intro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgAssertionsTest {
    @Test
    public void test1() {
        String expected = "one";
        String actual = "one";

        Assert.assertEquals(actual, expected);
        Assert.assertEquals(1, 1);
        Assert.assertEquals(true, true);

        System.out.println("test one complete");

    }

    @Test
    public void test2() {
        String expected = "one";
        String actual = "two";

        System.out.println("starting to compare");

        Assert.assertEquals(actual, expected);

        System.out.println("test two complete");

    }

    @Test
    public void test3() {
        String expected = "one";
        String actual = "two";
        Assert.assertNotEquals(expected, actual);
        Assert.assertNotEquals(1, 2);
    }

    @Test
    public void test4() {
        String expected = "one";
        String actual = "one";
        Assert.assertTrue(expected.equals(actual));

        int e = 100;
        int a = 200;
        Assert.assertTrue(a>e);
    }

    @Test
    public void test5(){
        //verify that URL is equal to https://www.google.com/
        String expected = "https://www.google.com/";
        String actual = " https://www.google.com/";
        Assert.assertEquals(expected, actual);

        //verify that title starts with java
        String expected1 = "Java";
        String actual1 = "java - Google Search";
        Assert.assertTrue(actual1.contains(expected1));
    }
}
