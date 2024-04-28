package JavaConcepts;

interface Computer {
    void compile();
};
class Desktop1 implements Computer{
    @Override
    public void compile() {
        System.out.println("compling in desktop");
    }
};
class Laptop1 implements Computer{
    @Override
    public void compile() {
        System.out.println("compling in Laptop");
    }
};
class Programmer1{
    public void code(Computer comp){
        comp.compile();
    }
}
public class LooseCoupling {
    public static void main(String[] args) {
        Programmer1 p = new Programmer1();
        p.code(new Desktop1());
        p.code(new Laptop1());

    }
}
