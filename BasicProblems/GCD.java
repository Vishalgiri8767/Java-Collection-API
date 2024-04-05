package BasicProblems;

import java.util.Scanner;

// greates common divisor.
public class GCD {
    public static int findGcd(int x, int y){
        if(x<=0 || y<=0){
            return -1;
        }
        int small = 0;
        int big=0;
        int divisor=0;
        if(x>y) {
            big = x;
            small = y;
        }
        else if(x<y) {
            big = y;
            small = x;
        }
        else
            big=small=x=y;
//        System.out.println("small : "+small );
//        System.out.println("big :"+ big);

        for(int i=2; i<=small; i++){
            if(small%i==0 && big%i==0){
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
        if(divisor == -1)
            System.out.println("Value must be greater than 0");
        else
            System.out.println("gcd is "+divisor);
    }
}
