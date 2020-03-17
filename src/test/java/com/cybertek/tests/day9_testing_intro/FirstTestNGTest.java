package com.cybertek.tests.day9_testing_intro;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FirstTestNGTest {

    @Test
    public void test1() {
        System.out.println("test one TEST NG");
    }

    @Ignore
    @Test
    public void test2() {
        System.out.println("test two TEST NG");
    }

    @Test
    public void test3() {
        System.out.println("test three TEST NG");
    }
}
