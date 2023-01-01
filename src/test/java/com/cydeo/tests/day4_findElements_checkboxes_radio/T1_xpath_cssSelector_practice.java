package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement homeLink1=driver.findElement(By.cssSelector("a[class='nav-link']"));//syntax1

        WebElement homeLink2=driver.findElement(By.cssSelector("a.nav-link"));//syntax2

        WebElement homeLink3=driver.findElement(By.cssSelector("a[href='/']"));//syntax3

        WebElement header_ex1= driver.findElement(By.cssSelector("div.example>h2"));//

        WebElement header_ex2= driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        WebElement header_ex3= driver.findElement(By.xpath("//h2[.='Forgot Password']"));


        WebElement emailLabel= driver.findElement(By.xpath("//label[@for='email']"));

        WebElement inputBox1=driver.findElement(By.xpath("//input[@name='email']"));

        WebElement inputBox2=driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));//contains method

        WebElement retrievePasswordButton1=driver.findElement(By.xpath("//button[@id='form_submit']"));
        WebElement retrievePasswordButton2=driver.findElement(By.xpath("//button[@type='submit']"));

        //Powered by Cydeo Text
        WebElement poweredByCydeoText=driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //Verify all web elements are displayed

        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox1.isDisplayed() = " + inputBox1.isDisplayed());
        System.out.println("retrievePasswordButton1.isDisplayed() = " + retrievePasswordButton1.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());



    }
}
