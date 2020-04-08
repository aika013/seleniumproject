package com.cybertek.tests.day15_webtables;

import com.cybertek.base.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesTests extends TestBase {
    @BeforeMethod
    public void setUpTest() throws Exception {
        String url = ConfigurationReader.getProperty("url");
        Thread.sleep(5000);
        driver.get(url);
        driver.findElement(By.linkText("Sortable Data Tables")).click();
    }

    @Test
    public void printTable() throws Exception {
        WebElement myTable = driver.findElement(By.id("table1"));
        System.out.println("myTable.getText() = " + myTable.getText());
    }

    @Test
    public void getHeaders() throws Exception {
        WebElement header = driver.findElement(By.tagName("thead"));
        System.out.println(header.getText());

        // get all headers in a list
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println(headers.size());

        //INSTEAD OF ALL THESE 38-42 , WE CAN USE LINE 44
//        for (WebElement header1 : headers) {
//            System.out.println(header1.getText());
//        }
//        List<String> headersStr = BrowserUtils.getElementsText(headers);
//        System.out.println(headersStr);

        System.out.println(BrowserUtils.getElementsText(headers));
    }

    @Test
    public void test1() {
        //get numbers of cols
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("Numbers of columns: " + headers.size());

        //get number of rows including header
        List<WebElement> rowsWithHeader = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println("Number of header is: " + rowsWithHeader.size());

        //get number of rows without header
        List<WebElement> rowsWithOutHeader = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("Rows With Out Header = " + rowsWithOutHeader.size());


    }

    @Test
    public void getSingleRowByIndex() {
//get the first row in the body
        WebElement row = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[4]"));
        System.out.println(row.getText());

        //get the first row (in the body) dynamic xpath
        String xpath = getTableRowXpath(3);
        row = driver.findElement(By.xpath(xpath));
        System.out.println(row.getText());
    }

    @Test
    public static String getTableRowXpath(int index) {
        String xpath = "//table[@id='table1']/tbody/tr[" + index + "]";
        return xpath;

    }

    //get single call based on index
    @Test
    public void getSingleBasedByIndex() {
        WebElement cell = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[1]"));
        System.out.println(cell.getText());
        String xpath = getCellXpathByIndex(2, 3);
        cell = driver.findElement(By.xpath(xpath));
        System.out.println(cell.getText());
    }

    public static String getCellXpathByIndex(int row, int column) {
        String xpath = "//table[@id='table1']/tbody/tr[" + row + "]/td[" + column + "]";
        return xpath;

    }

    //Iterate go through the table using loops and get the all values
    @Test
    public void IterateTheTableUsingLoops() {
        //get the nubmbers of rows
        int rowCount = getRowCount();  // rowCount for outerLoop
        // get the nubmebrs of col
        int colCount = getColCount();  //colCount for inner loop

        for (int i = 1; i <= rowCount; i++) {
            for (int j = 1; j <= colCount; j++) {
                String xpath = getCellXpathByIndex(i, j);
                WebElement cell = driver.findElement(By.xpath(xpath));
                System.out.println(cell.getText() );
            }
        }
    }

    //static can not call non-static
    //numbers of rows excluding the table headers
    public int getRowCount() {
        return driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
    }

    public int getColCount() {
        return driver.findElements(By.xpath("//table[@id='table1']//th")).size();
    }
}
