package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){
        WebDriver driver;
       switch (browserType.toLowerCase()){
           case "chrome" :
               WebDriverManager.chromedriver().setup();
               driver=new ChromeDriver();
               break;
           case "firefox":
               WebDriverManager.chromedriver().setup();
                driver=new FirefoxDriver();
                break;
           default:
               System.out.println("Unknown Browser type "+browserType);
               driver=null;
       }
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       //driver.get("https://www.google.com");
       return driver;
    }

    public static WebDriver googleSearch(String text) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        WebElement inputBox=driver.findElement(By.xpath("//input[@class='gLFyf']"));
        inputBox.sendKeys(text+ Keys.ENTER);

        List<WebElement> links = driver.findElements(By.xpath("//a[contains(@h3,text)]"));
        for (WebElement link : links) {
            if (link.getText().contains(text)){
                link.click();
                break;
            }

        }
        return driver;

/*
        WebElement searchLink=driver.findElement(By.xpath("//h3"));
        searchLink.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//button[.='Tüm Çerezleri Kabul Et']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//button[@id='genderManButton']")).click();


 */

    }

}
