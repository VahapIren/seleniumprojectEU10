package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {
    public static void sleep(int second){
        second*=1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }

    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedInTitle){
        Set<String> allWindowHandels=driver.getWindowHandles();
        for (String each : allWindowHandels) {
            driver.switchTo().window(each);
            System.out.println(driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains(expectedInUrl))
                break;
        }

        String actualTitle=driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));


    }
    /*
   This method accepts a String "expectedTitle" and Asserts if it is true
    */
    public static void verifyTitle(WebDriver driver ,String expectedTitle){

        Assert.assertEquals(driver.getTitle(), expectedTitle);

    }
}
