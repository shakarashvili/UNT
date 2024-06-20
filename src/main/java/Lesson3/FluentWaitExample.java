package Lesson3;

import Lesson1.SetUpDriver2;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FluentWaitExample {
    public static void main(String[] args) {
        WebDriver driver = SetUpDriver2.setUpdriver();
        driver.get("https://www.guinnessworldrecords.com/Account/Login?ReturnUrl=%2faccount");
       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));  // ამით ქმნი კონკრეტულად ვეითის ობიექტს
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ez-accept-all"))).click(); */
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
        .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(InvalidElementStateException.class);
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ez-accept-all"))).click();
        driver.quit();
















    }
}





























