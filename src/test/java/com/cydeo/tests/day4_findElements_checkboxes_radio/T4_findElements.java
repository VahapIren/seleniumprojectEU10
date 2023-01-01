package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");

        //Locata all athe links in the page
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        //Print out the number of the links on the page
        System.out.println("allLinks.size() = " + allLinks.size());

        //Print out the texts of the links
        for (WebElement each : allLinks) {
            System.out.println("Text of links: "+each.getText());
            //Print out HREF attribute values of the links
            System.out.println("HREF Values: "+each.getAttribute("href"));

        }




    }
}
