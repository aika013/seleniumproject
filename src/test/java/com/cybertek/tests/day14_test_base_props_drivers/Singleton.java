package com.cybertek.tests.day14_test_base_props_drivers;

public class Singleton {
    //male constructor private
    private Singleton(){

    }
    private static String string;

    public static String getInstance(){
        if(string==null){
            string="chrome";
        }
        return string;
    }

}
