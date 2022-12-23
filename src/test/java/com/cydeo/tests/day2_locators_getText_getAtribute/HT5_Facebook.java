package com.cydeo.tests.day2_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HT5_Facebook {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        String expectedTitle="Facebook - Giriş Yap veya Kaydol";
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
