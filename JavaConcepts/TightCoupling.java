package JavaConcepts;

public class TightCoupling {

}
class Laptop{
    public static void coupling(){
        System.out.println("Laptop class");
    }
}
class Programmer{
    public void coupling(Laptop lap){
        System.out.println("Programmer class");
    }
}
