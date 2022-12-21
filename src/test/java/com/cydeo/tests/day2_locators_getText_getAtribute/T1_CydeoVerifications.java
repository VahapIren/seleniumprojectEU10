package com.cydeo.tests.day2_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");

        //verify URL contains "cydeo"
        String expectedURL="cydeo";
        String actualURL= driver.getCurrentUrl();

        if (actualURL.contains(expectedURL))
            System.out.println("URL verification PASSED");
        else
            System.out.println("URL verification FAILED");

        //Verify title is "Practice"
        String expectedTitle="Practice";
        String actualTitle= driver.getTitle();
        if (actualTitle.equals(expectedTitle))
            System.out.println("Title verification PASSED");
        else
            System.out.println("Title verification FAILED");
        driver.close();


    }
}
