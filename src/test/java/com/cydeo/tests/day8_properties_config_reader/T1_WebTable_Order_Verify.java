package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_WebTable_Order_Verify {
    public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test
    public void order_name_verify_test(){

        WebElement bobMartinCell=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        System.out.println("bobMartinCell = " + bobMartinCell);  ////td[.='Bob Martin']/../td[5]  alternative locator
        System.out.println("bobMartinCell.getText() = " + bobMartinCell.getText());

        String expectedName="Bob Martin";
        String actualName=bobMartinCell.getText();
        Assert.assertEquals(actualName,expectedName);

        WebElement bobMartinDateCell=
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        System.out.println("bobMartinDateCell.getText() = " + bobMartinDateCell.getText());

        String expectedBobDate="12/31/2021";
        String actualDate=bobMartinDateCell.getText();
        Assert.assertEquals(actualDate,expectedBobDate);


    }


}
