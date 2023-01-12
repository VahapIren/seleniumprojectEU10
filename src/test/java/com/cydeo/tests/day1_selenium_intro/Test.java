package com.cydeo.tests.day1_selenium_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver=WebDriverFactory.getDriver("chrome");

        driver.get("https://booking.com");
        WebElement chooseHouse=driver.findElement(By.xpath("//div[@class='de7f9979e1']"));
        chooseHouse.click();
        //input[@id='ss']
        Set<String > allWindowHandles=driver.getWindowHandles();

        // window handle 1 - main window
        // window handle 2 - 2nd window

        for (String each : driver.getWindowHandles()) {

            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: " + driver.getTitle());
            if (driver.getTitle().equals("Dünyanın En İyi Kiralık Tatil Yerleri | Booking.com")){
                break;
            }
        }
        WebElement inputBox2=driver.findElement(By.xpath("//input[@id='ss']"));
        inputBox2.sendKeys("Norway"+ Keys.ENTER);

        driver.findElement(By.xpath("//button[@class='fc63351294 a822bdf511 e3c025e003 fa565176a8 cfb238afa1 ae1678b153 c9fa5fc96d be298b15fa']")).click();
        driver.findElement(By.xpath("//span[@data-date='2023-03-11']")).click();
        driver.findElement(By.xpath("//span[@data-date='2023-03-12']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
