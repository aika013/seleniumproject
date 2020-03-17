package com.cybertek.tests.office_hours.mira.march17_;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;

public class VyTrack {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://qa3.vytrack.com");
        WebElement username = driver.findElement(By.id("prependedInput"));
        ((WebElement) username).sendKeys("salesmanager110");
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        password.submit();

        Thread.sleep(2000);
        WebElement contactsLink = driver.findElement(By.xpath("(//a[@href='/contact'])[4]"));
        contactsLink.click();

        Thread.sleep(3000);
        WebElement createContact = driver.findElement(By.linkText("Create Contact"));
        createContact.click();

        String currentTitle = driver.getTitle();
        if (currentTitle.equals("Create Contact - Contacts - Costumers")) {
            System.out.println("Tittle is expected");
        }else{
            System.out.println("Tittle is NOT expected");
        }

        HashMap<String, String> contact1 = new HashMap<>();
        contact1.put("First name","John");
        contact1.put("Last name","Smith");
        contact1.put("Phone","571-236-4545");
        contact1.put("Street address","400 Main Street");
        contact1.put("City", "Tysons");
        contact1.put("State", "Va");
        contact1.put("Zip Code", "22102");
        contact1.put("Sales group", "true");
        contact1.put("Country", "United states");

        System.out.println("Contact 1: " + contact1);


    }
}
