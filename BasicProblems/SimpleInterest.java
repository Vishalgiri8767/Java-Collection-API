package BasicProblems;

import java.util.Scanner;

public class SimpleInterest {
    public static float simpleInterest(int p,int time,float rate){
        float simpleInterest;
        return simpleInterest = (p*rate*time)/100;

    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount");
        int principle = sc.nextInt();
        System.out.println("Enter duration");
        int duration = sc.nextInt();
        System.out.println("Enter rate of Interest");
        float rate = sc.nextFloat();

        float si = simpleInterest(principle,duration,rate);
        System.out.println("simple interest on "+principle +" is "+si);
    }
}
