package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAtribute {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login.nextbasecrm.com/");

        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel="Remember me on this computer";
        String actualRememberMeLabel=rememberMeLabel.getText();

        if (actualRememberMeLabel.equals(expectedRememberMeLabel))
            System.out.println("Label verification PASS");
        else
            System.out.println("Label verification FAIL");

        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPasswordLinkText="Forgot your password?";
        String actualForgotPasswordLinkText=forgotPasswordLink.getText();

        if (actualForgotPasswordLinkText.equals(expectedForgotPasswordLinkText))
            System.out.println("forgot password link verification PASS");
        else {
            System.out.println("actualForgotPasswordLinkText = " + actualForgotPasswordLinkText);
            System.out.println("expectedForgotPasswordLinkText = " + expectedForgotPasswordLinkText);
            System.out.println("forgot password link verification FAIL");
        }

        String expectedInHref="forgot_password=yes";
        String actualInHref=forgotPasswordLink.getAttribute("href");
        System.out.println("actualInHref = " + actualInHref);

        if (actualInHref.contains(expectedInHref))
            System.out.println("HREF attribute value verification PASS");
        else
            System.out.println("HREF attribute value verification FAIL");


    }
}
