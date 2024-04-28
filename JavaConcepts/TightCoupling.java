package JavaConcepts;

public class TightCoupling {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.coupling(new Laptop());
     //   p.coupling(new Laptop());
        Laptop lap = new Laptop();

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
    }
}
