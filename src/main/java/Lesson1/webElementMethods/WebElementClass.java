package Lesson1.webElementMethods;

import Lesson1.SetUpDriver2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementClass {
    public static void main(String[] args) {
       WebDriver driver =  SetUpDriver2.setUpdriver();
       driver.get("https://www.guinnessworldrecords.com/search?term=%2A");
        WebElement searchfild  = driver.findElement(By.id("search-term"));
        WebElement searchbutton = driver.findElement(By.id("search-button"));
        searchfild.sendKeys("handstand");
        searchfild.clear();
        searchfild.sendKeys("anather keys");
        searchbutton.clear();

        System.out.println("get from elements ============");
        searchbutton = driver.findElement(By.id("search-button"));
        System.out.println("text from element"+ searchbutton.getText());
        System.out.println("tag name " + searchbutton.getTagName());
        System.out.println("Value of the class attribute: " + searchbutton.getAttribute("class"));
        System.out.println("get css value " + searchbutton.getCssValue("Line-height"));
        driver.quit();


    }
}
























