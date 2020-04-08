package com.cybertek.tests.day11_select_actions;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectClassTests {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

    @Test
    public void getSelectOption() {
        //find a element that has select tag
        WebElement dropdown = driver.findElement(By.id("dropdown"));

        //create a select object
        Select dropdownList = new Select(dropdown);

        //get the select option
        WebElement selectedOption = dropdownList.getFirstSelectedOption();
        System.out.println(selectedOption.getText());

        //verify selected option
        Assert.assertEquals(selectedOption.getText(), " Please select an option");
    }

    @Test
    public void selectFormsList() throws InterruptedException {
        //get the element with select type
        WebElement dropdown = driver.findElement(By.id("state"));

        //create class class
        Select states = new Select(dropdown);

        //TODO selectByVisibleText --> select by the text of the option
        states.selectByVisibleText("Iowa");
        Thread.sleep(1000);
        states.selectByVisibleText("New York");
        Thread.sleep(1000);
        states.selectByVisibleText("Kentucky");
        Thread.sleep(1000);

        //TODO selectByVisibleText --> select by the index of the option , 0 based count
        states.selectByIndex(0);
        Thread.sleep(1000);
        states.selectByIndex(10);
        Thread.sleep(1000);
        states.selectByIndex(20);
        Thread.sleep(1000);

        //TODO selectByValue --> select based on value of the value atribute of the option
        //TODO selectByValue --> it is not selected text
        states.selectByValue("VA");
        Thread.sleep(1000);
        states.selectByValue("SC");
        Thread.sleep(1000);
        states.selectByValue("CO");
        Thread.sleep(1000);
        states.selectByValue("NE");
        Thread.sleep(1000);
    }

    @Test
    public void getAllAvailableOptions() {
        Select monthList = new Select(driver.findElement(By.id("month")));

        //print the current selection
        System.out.println(monthList.getFirstSelectedOption().getText());

        //TODO getOptions --> returns all of the available option s from dropdown
        List<WebElement> allOptions = monthList.getOptions();

        System.out.println("Number of options " + allOptions.size());
        for (WebElement month : allOptions) {
            System.out.println(month.getText());
        }

        //verify that month list always shows the current month as selected
        // get the current month
        String expected = LocalDate.now().getMonth().name();
        String actual = monthList.getFirstSelectedOption().getText();
        Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase());

        //verify that month list has following values: January... December
        List<String> expectedMonth = Arrays.asList("January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December");
        Assert.assertEquals(allOptions, expectedMonth);

        //get options gives me list webElemnt , so allOption sis aList of web elements
        //but my expected is a list string, i have to make shore the both list of strings
        //i need to get list String from list of web elemnt

        List<String> actualMonths = new ArrayList<>();
        for (WebElement option : allOptions) {
            actualMonths.add(option.getText());
        }

        Assert.assertEquals(actualMonths, expectedMonth);
    }

    @Test
    public void verifyOptions(){
        Select list = new Select( driver.findElement(By.id("dropdown")));

        //verify the list has 3 option s
        int expectedSize = 3;
        int actualSize = list.getOptions().size();

        List<String> expectedValue = Arrays.asList("Please select an option" ,"Option 1", "Option 2");

        List<String> actualValues = new ArrayList<>();

        for (WebElement option : list.getOptions()){
            actualValues.add(option.getText());
        }

        Assert.assertEquals(actualValues, expectedValue);
    }
}















































