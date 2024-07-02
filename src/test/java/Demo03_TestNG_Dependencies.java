import org.testng.annotations.Test;

public class Demo03_TestNG_Dependencies {
    @Test
    public void login(){
        System.out.println("Code To Login");
    }
    @Test(dependsOnMethods = {"login"})
    public void dashboard(){
        System.out.println("Dashboard Page");
    }
    @Test(dependsOnMethods = {"dashboard"})
    public void logout(){
        System.out.println("Logout To Application");
    }
}
