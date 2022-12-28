package com.cydeo.tests.day2_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://turkeyoutdoor.org");

        String expectedTitle="Türkiye'nin Outdoor Sayfası - Doğa Yürüyüşü, Hiking, Trekking, Kampçılık, Dağcılık, Ekstrem Sporlar, Doğa Sporları, Macera Turizmi, Doğa Turizmi, Outdoor Ekipman, Outdoor Giyim";

                String actualTitle=driver.getTitle();
        if (actualTitle.equals(expectedTitle))
            System.out.println("Title verification is PASSED");
        else
            System.out.println("Title verification is FAILED");
    }
}
