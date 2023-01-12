package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    /*
    This method will log in with helpdesk1@cybertekschool.com
     user when it is called
     */
    public static void crm_login(WebDriver driver){

        WebElement inputUserName=driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys("helpdesk1@cybertekschool.com");

        WebElement inputPassword=driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        WebElement loginBtn=driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBtn.click();

    }

    public static void crm_login(WebDriver driver,String username,String password){

        WebElement inputUserName=driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys(username);

        WebElement inputPassword=driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(password);

        WebElement loginBtn=driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBtn.click();

    }
}
