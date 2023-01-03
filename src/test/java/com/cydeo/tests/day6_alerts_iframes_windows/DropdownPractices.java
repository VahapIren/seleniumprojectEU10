package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }
    @Test
    public void dropdown_test5() throws InterruptedException {

        Select stateDropdown=new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //select Illinois
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");

        //select Virginia
        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");

        //select California
        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);

        //verify final selected is California
        String expectedOptionText="CA";
        String actualOptionText=stateDropdown.getFirstSelectedOption().getAttribute("value");
        //String actualOptionText=stateDropdown.getFirstSelectedOption().getText();  same

        Assert.assertEquals(actualOptionText,expectedOptionText);

    }
    @Test
    public void dropdown_test6(){

        //Select"December 1 2022 and verify it is selected
        Select yearDropdown=new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown=new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //Select year using: visible text
        yearDropdown.selectByVisibleText("2022");

        //Select month using: value attribute
        monthDropdown.selectByValue("11");

        //Select day using: index number
        dayDropdown.selectByIndex(0);

        //creating expected values
        String expectedYear="2022";
        String expectedMonth="December";
        String expectedDay="1";

        String actualYear=yearDropdown.getFirstSelectedOption().getText();
        String actualMonth=monthDropdown.getFirstSelectedOption().getText();
        String actualDay=dayDropdown.getFirstSelectedOption().getText();

        //create assertions
        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertEquals(actualMonth,expectedMonth);
        Assert.assertEquals(actualDay,expectedDay);

    }
    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }
}
