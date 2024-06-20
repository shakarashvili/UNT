package Lesson3.Priority;

import Lesson1.SetUpDriver2;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTest {
    @Test(priority = 1)
    public void a() {
        WebDriver driver = SetUpDriver2.setUpdriver();
        driver.get("https://andersenlab.com/");
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().equals("Software Development Company – Andersen"), "title is not correct!!!");
        driver.quit();
    }
    @Test(priority = 2)
    public void b() {
        WebDriver driver = SetUpDriver2.setUpdriver();
        driver.get("https://andersenlab.com/");
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().equals("Software Development Company – Andersen"), "title is not correct!!!");
        driver.quit();
    }
    @Test
    public void d() {
        WebDriver driver = SetUpDriver2.setUpdriver();
        driver.get("https://andersenlab.com/");
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().equals("Software Development Company – Andersen"), "title is not correct!!!");
        driver.quit();
    }
    @Test
    public void c() {
        WebDriver driver = SetUpDriver2.setUpdriver();
        driver.get("https://andersenlab.com/");
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().equals("Software Development Company – Andersen"), "title is not correct!!!");
        driver.quit();
    }
}





























