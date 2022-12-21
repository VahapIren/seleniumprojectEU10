package com.cydeo.tests.day2_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HT3_BackAndForthNavigation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement gmail=driver.findElement(By.className("gb_j"));
        gmail.click();

        String expectedGmailTitle="Gmail";
        String actualGmailTitle =driver.getTitle();

        if (actualGmailTitle.contains(expectedGmailTitle))
            System.out.println("Gmail Title verification PASS");
        else
            System.out.println("Gmail Title verification FAIL");

        driver.navigate().back();

        String expectedGoogleTitle="Google";
        String actualGoogleTitle=driver.getTitle();

        if (actualGoogleTitle.equals(expectedGoogleTitle))
            System.out.println("Google title verification PASS");
        else
            System.out.println("Google title verification FAIL");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();



    }
}
