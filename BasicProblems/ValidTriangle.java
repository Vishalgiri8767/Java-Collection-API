package BasicProblems;
// for valid triangle :
// two sides sum > other side.
// program for checking given triangle valid or not

import java.util.Scanner;

public class ValidTriangle {
    static boolean checkTriangle(int a,int b,int c){
        if(a+b >c && a+c > b && b+c> a )
            return true;

        return false;
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of first side: ");
        int a = sc.nextInt();
        System.out.println("Enter value of second side: ");
        int b = sc.nextInt();
        System.out.println("Enter value of third side: ");
        int c = sc.nextInt();
        boolean isTriangel = checkTriangle(a,b,c);
        if(isTriangel)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid triangle");
    }
}
