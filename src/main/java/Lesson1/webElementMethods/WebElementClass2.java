package Lesson1.webElementMethods;

import Lesson1.SetUpDriver2;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementClass2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =  SetUpDriver2.setUpdriver();
        driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
        System.out.println("get from elements ============");
        WebElement registerButton  = driver.findElement(By.id("SubmitCreate"));
        System.out.println("text from element"+ registerButton.getText());
        System.out.println("tag name " + registerButton.getTagName());
        System.out.println("Value of the class attribute: " + registerButton.getAttribute("class"));//კლასის სახელი
        System.out.println("get css value " + registerButton.getCssValue("font-size")); // ფონსი ზომა

        System.out.println("location is " + registerButton.getLocation()); // კორდინანტებთან მუშაობა
        System.out.println("X cordinate is " + registerButton.getLocation().x); // მხოლოდ იქსი მარცხნიდან მარჯვნივ
        System.out.println("X cordinate is " + registerButton.getLocation().y); // მხოლოდ იგრეკი ზემოდან ქვემოთ
        System.out.println(registerButton.getSize()); // ზომის გაგება
        System.out.println("width size " + registerButton.getSize().width);
        System.out.println("height size " + registerButton.getSize().height);

        //რა არის იზ??

        driver.get("https://www.guinnessworldrecords.com/Account/Login?ReturnUrl=%2faccount");
        Thread.sleep(2000);
        try{
           driver.findElement(By.id("ez-accept-all")).click();   // აქ ქუქი იყო ეკრანზე და ამითი აშორებ და რავი ექსეფშენიც დავუწერეთ თუ მაგალითად ვე გაივლის


        } catch (NoSuchElementException e){
            System.out.println("web not displayed ");
        }

        WebElement checkbox = driver.findElement(By.id("RememberMe"));
        System.out.println(checkbox.isEnabled());
        System.out.println(checkbox.isSelected());
        System.out.println(checkbox.isDisplayed());
        checkbox.click();
        checkbox.click();






        driver.quit();

    }
}










































