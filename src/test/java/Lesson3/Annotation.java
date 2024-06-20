package Lesson3;

import org.testng.annotations.*;

public class Annotation {
    @BeforeSuite
    public void BeforeSuit(){
        System.out.println("visible");

    }
    @BeforeTest
    public void Beforetet(){
        System.out.println("visible test");

    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("class visible ");

    }
    @BeforeMethod
    public void Beforemethods(){
        System.out.println("methods are visble");
    }

    @Test
    public void test(){
        System.out.println("test is working");
    }
    @AfterClass
    public void Afterclass(){
        System.out.println("after class");

    }
    @AfterSuite
    public void Aftersuit(){
        System.out.println("after suit");
    }
}
