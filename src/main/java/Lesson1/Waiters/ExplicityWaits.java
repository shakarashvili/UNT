package Lesson1.Waiters;

import Lesson1.SetUpDriver2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.rmi.server.ExportException;
import java.time.Duration;

public class ExplicityWaits {
    public static void main(String[] args) {
        WebDriver driver = SetUpDriver2.setUpdriver();
        driver.get("https://www.guinnessworldrecords.com/Account/Login?ReturnUrl=%2faccount");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));  // ამით ქმნი კონკრეტულად ვეითის ობიექტს
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ez-accept-all"))).click(); // მოცდა სანამ გამოჩნდება ელემენტიო aამ ობიექტის მეშვეობით
//driver.findElement(By.id("ez-accept-all")).click();
        ExpectedConditions.elementToBeClickable(By.id("")); // მოცდა სანამ ელემენტი გახდება დაკლიკვადი

        wait.until(ExpectedConditions.elementToBeSelected(By.id("RememberMe"))); // ელოდება სანამ ელემენტი გახდება მონიშვნადი
        driver.findElement(By.id("Username")).sendKeys("example");

        wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("Username"),"AQA"));
        driver.findElement(By.id("password")).sendKeys("second home");
        










    }
}




















