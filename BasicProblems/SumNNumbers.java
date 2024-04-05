package BasicProblems;

import java.util.Scanner;

public class SumNNumbers {
    public static int doSum(int number){
        int sum = 0;
        for(int i=1; i<=number; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = sc.nextInt();
        int sum = doSum(number);
        System.out.println(sum);
    }
}
