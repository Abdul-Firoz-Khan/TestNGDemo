import org.testng.annotations.Test;

public class Demo05_TestNG_Grouping {
    @Test(groups ={"car","e-car"})
    public void mg() {
        System.out.println("MG Hector");
    }

    @Test(groups = {"car","suv"})
    public void xylo() {
        System.out.println("Mahindra Xylo");
    }

    @Test(groups = {"car"})
    public void swift() {
        System.out.println("Maruti Swift");
    }
}
