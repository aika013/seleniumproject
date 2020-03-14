package com.cybertek.tests.day3_Locators_2;

import com.github.javafaker.Faker;

public class FakerPractice {
    public static void main(String[] args) {
        //create Faker object
        Faker fakeData = new Faker();

        // i need firstName
        String name = fakeData.name().firstName();
        System.out.println(name);
    }
}
