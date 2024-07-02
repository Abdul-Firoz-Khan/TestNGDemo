

import org.testng.annotations.*;

public class Demo01_TestNG_Annotations {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Inside BeforeMethodDemo1");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Inside AfterMethodDemo1");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Inside BeforeClassDemo1");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Inside AfterClassDemo1");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Inside BeforeTestDemo1");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("Inside AfterTestDemo1");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Inside BeforeSuiteDemo1");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("Inside AfterSuiteDemo1");
    }
    @Test
    public void test1(){
        System.out.println("Inside a Test1 method");
    }
    @Test
    public void test2(){
        System.out.println("Inside a Test2 method");
    }
}
