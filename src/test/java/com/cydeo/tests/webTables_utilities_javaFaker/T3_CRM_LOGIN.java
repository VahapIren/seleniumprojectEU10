package com.cydeo.tests.webTables_utilities_javaFaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T3_CRM_LOGIN {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
    }

    @Test
    public void crm_login_test(){
        driver.get("https://login1.nextbasecrm.com/");

        WebElement inputUserName=driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys("helpdesk1@cybertekschool.com");

        WebElement inputPassword=driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        WebElement loginBtn=driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBtn.click();

        BrowserUtils.verifyTitle(driver,"My tasks");

    }

    @Test
    public void crm_login_test2(){
        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver,"helpdesk2@cybertekschool.com","UserUser");

        BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle(driver,"(1) Portal");

    }
}
