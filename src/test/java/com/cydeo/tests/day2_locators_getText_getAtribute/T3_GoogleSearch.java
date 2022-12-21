package com.cydeo.tests.day2_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {

        //open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //go to "google.com"
        driver.get("https://google.com");

        //write "apple" in search box
        //press ENTER using Keys.ENTER
        WebElement googleSearchBox=driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

        //verify Title

        String expectedTitle="apple";
        String actualTitle=driver.getTitle();

        if (actualTitle.startsWith(expectedTitle))
            System.out.println("Title verification PASSED");
        else
            System.out.println("Title verification FAILED");








    }
}
