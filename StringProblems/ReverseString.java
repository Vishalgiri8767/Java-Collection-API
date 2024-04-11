package StringProblems;

import java.util.Scanner;

// program for reversing a given string.
public class ReverseString {

    public static void main(String[] args) {
        // take input from the user
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(reverse(str));
    }

    public static String reverse(String in) {
        if (in == null)
            throw new IllegalArgumentException("Null is not valid input");

        StringBuilder out = new StringBuilder();

        char[] chars = in.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--)
            out.append(chars[i]);

        return out.toString();
    }

}