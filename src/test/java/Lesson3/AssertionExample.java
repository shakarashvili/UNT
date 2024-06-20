package Lesson3;

import Lesson1.SetUpDriver2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AssertionExample {
    WebDriver driver;
    @BeforeMethod
    public void BeforeMethod(){
        driver = SetUpDriver2.setUpdriver();
    }


    @Test
    public void checkWebSiteTitle(){
        WebDriver driver = SetUpDriver2.setUpdriver();
        driver.get("https://andersenlab.com/");
        System.out.println(driver.getTitle());
       // Assert.assertTrue(driver.getTitle().equals("Software Development Company - Andersen"),"title is not right ");
        Assert.assertTrue(driver.getTitle().contains("Andersen"),"title is right");
        Assert.assertFalse(driver.getTitle().equals("Adnerser"));
        //ამით ნახულობ ამ სახელს შეიცავს თუ არა
        //button(text()='Accept all cookies')
        //Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Accept all cookies']")).isDisplayed());
        //აქ ნახულობს ელემენტი თუ არის ხილვადი
        By cookibutton = By.xpath("//button[text()='Accept all cookies']");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(cookibutton));
        Assert.assertEquals(driver.findElement(cookibutton).getText(),"asd");


    }
    @AfterMethod
    public void Aftermethod(){
        driver.quit();
    }
}
















