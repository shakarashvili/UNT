package Lesson1.WebDriverMethods;

import Lesson1.SetUpDriver2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class RefreshExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = SetUpDriver2.setUpdriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.guinnessworldrecords.com/search?term=%2A");
        WebElement searchfild =  driver.findElement(By.id("search-term"));
        searchfild.sendKeys("alo vasia");
        Thread.sleep(1000);
        driver.navigate().refresh(); // რეფრეში
        searchfild = driver.findElement(By.id("search-term")); // რეფრეშის მერე ვერ იპოვაელემენტი ამიტონ თავიდან მოძებნა გადა საჭირო
        searchfild.sendKeys("yeas yes lets go");
        Thread.sleep(1000);
        driver.quit();
    }
}






























