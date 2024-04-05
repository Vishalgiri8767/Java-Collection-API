package BasicProblems;

import java.util.Scanner;

// greates common divisor.
public class GCD {
    public static int findGcd(int x, int y){
        int small=0;
        int big=0;
        int divisor=0;
        if(x>y)
            small=x;
        else
            big=y;
        System.out.println("small : "+small );
        for(int i=1; i<=small; i++){
            if(small%i==0 && big%i==0){
                System.out.println(i);
                divisor=i;
            }
        }
        return divisor;
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int x = sc.nextInt();
        System.out.println("enter second number");
        int y = sc.nextInt();
        int divisor = findGcd(x,y);
        System.out.println("gcd is "+divisor);
    }
}
