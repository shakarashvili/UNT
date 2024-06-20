package Lesson1.WebDriverMethods;

import Lesson1.SetUpDriver2;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import java.time.Duration;
import java.util.Set;

public class WindowHanldeexample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = SetUpDriver2.setUpdriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.guinnessworldrecords.com/search?term=%2A");
        System.out.println(driver.getWindowHandle());
        Set<String> windowHandles1 =  driver.getWindowHandles();// ეს იჭერს იმ ტაბს სადაც გადახევედი თავისი უნიკალურობით

        ((JavascriptExecutor)driver).executeScript("window.open()"); // ეს უბრალოდ ხსნის ახალ ტაბს ქრომში
        Set<String> windowHandles2 =  driver.getWindowHandles();// ეს იჭერს იმ ტაბს სადაც გადახევედი თავისი უნიკალურობით
        windowHandles2.removeAll(windowHandles1);
        String idofSecondwindow = windowHandles2.iterator().next(); // იტერატორი გადაყვება ელემენტს და ნექსთი გადადის შემეგ ელემენტზე
        driver.switchTo().window(idofSecondwindow); // და ეს არის უვკე გადასვლა თვითან ამ ტაბზე და ამ ტაბში გახსნა საიტის .

        driver.get("http://www.automationpractice.pl/index.php");
        System.out.println(driver.getWindowHandle());
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.WINDOW); // ამითი იხსნება აბსოლუტურად ცალკე ქრომი და ცალკე ხსნის მითითებულ საიტს
        driver.get("https://jobs.ge/");
        driver.switchTo().newWindow(WindowType.TAB); // ეს იმ გახსნილ ბრაუზერში ხსნის ახალ ტაბს
        driver.get("https://www.yahoo.com/?guccounter=1");
        driver.quit();

    }
}





























