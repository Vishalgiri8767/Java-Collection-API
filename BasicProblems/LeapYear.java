package BasicProblems;

import java.util.Scanner;

public class LeapYear {
    public static boolean checkLeapYear(int year){
        if(year != 4)
            return false;

        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter Year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        checkLeapYear(year);
    }
}
