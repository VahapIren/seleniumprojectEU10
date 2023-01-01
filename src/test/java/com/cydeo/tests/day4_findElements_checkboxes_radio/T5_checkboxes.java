package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/checkboxes");

        //we have to locate checkboxes
        WebElement checkbox1= driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2= driver.findElement(By.xpath("//input[@name='checkbox2']"));

        //confirm checkbox1 is not selected
        System.out.println("checkbox1.isSelected(), expecting false = " + checkbox1.isSelected());

        //confirm checkbox2 is selected
        System.out.println("checkbox2.isSelected(), expecting true = " + checkbox2.isSelected());

        //Click checkbox #1 to select it
        Thread.sleep(2000);
        checkbox1.click();

        //Click checkbox #2 to deselect it
        Thread.sleep(2000);
        checkbox2.click();

        //confirm checkbox1 is selected
        System.out.println("checkbox1.isSelected(), expecting true = " + checkbox1.isSelected());
        //confirm checkbox2 is not selected
        System.out.println("checkbox2.isSelected(), expecting false = " + checkbox2.isSelected());
    }
}
