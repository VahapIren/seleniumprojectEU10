package com.cydeo.tests.day2_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HT6_FacebookLogin {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        WebElement userName=driver.findElement(By.name("email"));
        userName.sendKeys("incorrect@email.com");

        WebElement password= driver.findElement(By.name("pass"));
        password.sendKeys("incorrect");

        WebElement loginButton=driver.findElement(By.name("login"));
        loginButton.click();

        try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

        String expectedTitle="Facebook'a Giriş Yap";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle))
            System.out.println("Title verification PASS");
        else
            System.out.println("Title verification FAIL");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();


    }
}
