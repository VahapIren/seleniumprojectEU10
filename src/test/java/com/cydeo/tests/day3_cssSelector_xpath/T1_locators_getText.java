package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {
    public static void main(String[] args) {

        //WebDriverManager.chromedriver().setup();
        //WebDriver driver=new ChromeDriver();
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login.nextbasecrm.com/");

        WebElement inputUserName=driver.findElement(By.className("login-inp"));
        inputUserName.sendKeys("incorrect");

        WebElement inputUserPassword= driver.findElement(By.name("USER_PASSWORD"));
        inputUserPassword.sendKeys("incorrect");

        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.className("errortext"));
        String expectedErrorMessage="Incorrect login or password";
        String actualErrorMessage=errorMessage.getText();

        if (actualErrorMessage.equals(expectedErrorMessage))
            System.out.println("Error message verification PASS");
        else
            System.out.println("Error message verification FAIL");


    }
}
