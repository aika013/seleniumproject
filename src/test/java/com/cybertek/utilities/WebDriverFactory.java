package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    //write a static return method which returns WebDriver
    //name : getDriver
    //it takes a String as a parameter --> browser type
    //returns ChromeDriver and FirefoxDrover

    public static WebDriver getDriver(String browserType) {
        //local variable
        WebDriver driver = null;

        switch (browserType.toLowerCase()){
            //local variables
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
        }

        return driver;

    }
}
