package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) {

        //1-Setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2-Create instance of the Selenium Webdriver
        //This line openning an empty driver
        WebDriver driver=new ChromeDriver();

        //3-Go to   "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        String currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL=driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //stop code execution for 3 seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //use selenium to navigate baack
        driver.navigate().back();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.navigate().forward();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.navigate().refresh();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.navigate().to("https://google.com");

        //get the title of the page
        //System.out.println("driver.getTitle() = " + driver.getTitle());

        currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

         currentURL=driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);
    }
}
