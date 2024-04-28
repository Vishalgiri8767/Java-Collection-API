package JavaConcepts;

// tight coupling is a one class highly dependent on other class.
public class TightCoupling {
    public static void main(String[] args) {

        Laptop lap = new Laptop();
        Programmer p = new Programmer();
        p.coupling(lap);

    }
}
class Laptop{
    public void coupling(){
        System.out.println("Laptop class");
    }
}
class Programmer{
    public void coupling(Laptop lap){
        System.out.println("Programmer class");
        lap.coupling();
    }
}
