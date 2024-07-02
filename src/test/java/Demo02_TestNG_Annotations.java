

import org.testng.annotations.*;

public class Demo02_TestNG_Annotations {
@BeforeClass
@Parameters({"Browser","Author"})
public void setup(@Optional("Edge") String browser,@Optional("Cena") String author){
    System.out.println("Browser = "+ browser);
    System.out.println("Author = " + author);
}
    @Test
    public void test3(){
        System.out.println("Inside a Test3 method");
    }
    @Test
    public void test4(){
        System.out.println("Inside a Test4 method");
    }
}
