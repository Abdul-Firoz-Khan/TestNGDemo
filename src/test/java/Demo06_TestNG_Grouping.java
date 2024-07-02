import org.testng.annotations.Test;

public class Demo06_TestNG_Grouping {
    @Test(groups ={"bike","e-bike"})
public void bike() {
    System.out.println("Ola");
}

    @Test(groups = {"bike","scooter"})
    public void bike2() {
        System.out.println("Honda Activa ");
    }

    @Test(groups = {"bike"})
    public void bike3() {
        System.out.println("Hero Passion");
    }
}
