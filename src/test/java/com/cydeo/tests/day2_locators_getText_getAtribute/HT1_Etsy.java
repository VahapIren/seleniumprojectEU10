package com.cydeo.tests.day2_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HT1_Etsy {
    public static void main(String[] args) {


    //open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com ");

        WebElement searchInput=driver.findElement(By.name("search_query"));
        searchInput.sendKeys("wooden spoon"+ Keys.ENTER);

        String expectedTitle="Wooden spoon - Etsy";
        String  actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle))
            System.out.println("Title verification is PASS");
        else
            System.out.println("Title verification is FAIL");





    }
}
