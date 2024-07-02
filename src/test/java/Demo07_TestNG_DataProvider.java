import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo07_TestNG_DataProvider {
    @Test(dataProvider = "loginTestData")
    public void login(String name, String Password) {
        System.out.println("Name = " + name);
        System.out.println("Password = " + Password);

    }

    @DataProvider(name = "loginTestData")
    String[][] tdata() {
        String[][] data = {{"John", "john123"}, {"Peter", "peter123"}, {"Mark", "mark123"}};
        return data;
    }

}
