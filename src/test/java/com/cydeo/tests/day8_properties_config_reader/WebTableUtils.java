package com.cydeo.tests.day8_properties_config_reader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableUtils {

    public  static String returnOrderDate(WebDriver driver,String customerName){

        String locator="//table[@id='ctl00_MainContent_orderGrid']//td[.='"+customerName+"']/following-sibling::td[3]";

        WebElement customerDateCell=driver.findElement(By.xpath(locator));

        return customerDateCell.getText();
    }



}
