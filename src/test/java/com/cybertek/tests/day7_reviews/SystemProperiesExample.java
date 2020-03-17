package com.cybertek.tests.day7_reviews;

public class SystemProperiesExample {
    public static void main(String[] args) {
        String property = System.getProperty("os.name"); // os.type = null // os.name = Mac OS X
         System.out.println(property);
    }
}
