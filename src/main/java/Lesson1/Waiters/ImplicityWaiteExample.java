package Lesson1.Waiters;

import Lesson1.SetUpDriver2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ImplicityWaiteExample {
    public static void main(String[] args) {
        WebDriver driver = SetUpDriver2.setUpdriver();
        driver.get("https://www.guinnessworldrecords.com/Account/Login?ReturnUrl=%2faccount");
        driver.findElement(By.id("ez-accept-all")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); // იმფლისითი ელოდება გარკვეული დროით ელემენტს , კონკრეტულიდ როით
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2)); // ელოდება საიტის ჩატვირთვას
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
    }

}



























