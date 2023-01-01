package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementReferenceException {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");

        //Locate Cydeo link, verify it is displayed
        WebElement cydeoLink= driver.findElement(By.xpath("//a[text()='CYDEO']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        //refresh the page
        driver.navigate().refresh();

        //we are refreshing web element referance by re-assigning(re-locating) the web element
        cydeoLink= driver.findElement(By.xpath("//a[text()='CYDEO']"));
        //Locate Cydeo link, verify it is displayed
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());
        



    }
}
