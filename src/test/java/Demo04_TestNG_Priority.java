import org.testng.annotations.Test;

public class Demo04_TestNG_Priority {
    @Test(priority = 1)
    public void test5() {
        System.out.println("Inside a Test5 method");
    }

    @Test(priority = 3)
    public void test6() {
        System.out.println("Inside a Test6 method");
    }

    @Test(priority = 2, enabled = false)
    public void test7() {
        System.out.println("Inside a Test7 method");
    }
}
