package com.cydeo.tests.day2_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {
    public static void main(String[] args) {

        //open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        //verify header text is as expexted
        WebElement headerText=driver.findElement(By.tagName("h2"));
        String expectedHeaderText="Registration form";
        String actualHeaderText= headerText.getText();

        if (actualHeaderText.equals(expectedHeaderText))
            System.out.println("Header text verification PASS");
        else
            System.out.println("Header text verification FAIL!!");

        //Locate "First name" input box
        //WebElement firstNameInput= driver.findElement(By.name("firstname"));
        WebElement firstNameInput= driver.findElement(By.className("form-control"));

        //verify placeholder attribute's value is as expected
        String expectedPlaceHolder="first name";
        String actualPlaceHolder=firstNameInput.getAttribute("placeholder");

        if (actualPlaceHolder.equals(expectedPlaceHolder))
            System.out.println("Place holder attribute verification PASS ");
        else
            System.out.println("Place holder attribute verification FAIL ");

        driver.close();



    }
}
