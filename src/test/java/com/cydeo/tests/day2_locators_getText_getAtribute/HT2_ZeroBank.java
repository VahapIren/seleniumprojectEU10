package com.cydeo.tests.day2_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HT2_ZeroBank {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html ");

        String expectedHeaderText=  "Log in to ZeroBank";
        WebElement header =driver.findElement(By.tagName("h3"));
        String actualHeaderText= header.getText();

        if (actualHeaderText.equals(expectedHeaderText))
            System.out.println("Header verification PASS");
        else
            System.out.println("Header verification FAIL");

        driver.close();


    }
}
