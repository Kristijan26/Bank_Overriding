// Test class to create objects and call the methods
public class ClassTest {
    public static void main(String args[]) {
        ClassBank s = new ClassSBI();
        ClassBank i = new ICICI();
        ClassBank a = new AXIS();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
    }
}
