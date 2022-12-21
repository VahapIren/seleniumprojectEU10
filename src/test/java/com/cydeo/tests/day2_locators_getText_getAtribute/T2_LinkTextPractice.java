package com.cydeo.tests.day2_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //go to practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        //click to A/B Testing from top of the list
        driver.findElement(By.linkText("A/B Testing")).click();
        //if we write wrong or not found NoSuchElementException comes

        //verify title is "No A/B Test"


    }
}
