package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_TeslaTitleVerifivation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://tesla.com");
        String expectedTitle="Electric Cars, Solar & Clean Energy | Tesla";
        String currentTitle=driver.getTitle();
        System.out.println(currentTitle);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (expectedTitle.equals(currentTitle))
            System.out.println("ok");
        else
            System.out.println("fail");
        driver.close();

    }
}
