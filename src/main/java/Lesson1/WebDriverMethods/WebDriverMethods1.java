package Lesson1.WebDriverMethods;

import Lesson1.SetUpDriver2;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class WebDriverMethods1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = SetUpDriver2.setUpdriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.guinnessworldrecords.com/search?term=%2A");
        driver.findElement(By.id("search-term")).sendKeys("Handstandpush ups");
        Thread.sleep(1000);
        driver.get("https://www.guinnessworldrecords.com/records/");
        List<WebElement> webElementList =  driver.findElements(By.cssSelector(".columned.block.block-4-12 a"));
        for(WebElement element: webElementList){ // ელემენტებზე გადაყოლა და ინფორმაციების წამოღება შესაბამისი ელემენტი ვისაც ააქვს
            System.out.println(element.getText());
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
       // System.out.println(driver.getPageSource());

        System.out.println("------------------------------------");
        Set<Cookie> cookies =  driver.manage().getCookies();
        for (Cookie cookie: cookies){ // უნიკალურის პოვნა
            System.out.println(cookie);
        }
        System.out.println(cookies.size());
        System.out.println(cookies.toArray()[2]);
        System.out.println("------------------------------------");
        driver.navigate().to("http://www.automationpractice.pl/index.php"); // საიტზე გადასვლა შიგნით
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back(); // უკან დაბრუნება
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().forward(); // წინ გადასვლა
        System.out.println(driver.getTitle()); // საიტის სახელის წამოღება
        System.out.println(driver.getCurrentUrl()); // საიტის წამოღება
        driver.navigate().refresh(); // რეფრეში
        Thread.sleep(2000);









        driver.quit();
    }
}







































