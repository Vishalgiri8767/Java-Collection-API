package StringProblems;

public class Basics {
    public static void main(String[] args) {
        String name = "navin";
        System.out.println(name);
        System.out.println(System.identityHashCode(name));
        name="haq";
        System.out.println(name);
        System.out.println(System.identityHashCode(name));
//        System.out.println(name.equals(name));
//        System.out.println(name==name);
    }
}
