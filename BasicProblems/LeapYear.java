package BasicProblems;

import java.util.Scanner;

public class LeapYear {
    public static boolean checkLeapYear(int year){

        if ((year%4==0 && year%100!=0) || (year%400==0)){
           // System.out.println("leap year");
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println("Enter Year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean isLeapYear = checkLeapYear(year);
        if(isLeapYear)
            System.out.println(year+" is leap year");
        else
            System.out.println(year+" is not leap year");

    }
}
