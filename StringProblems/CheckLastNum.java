package StringProblems;
/*
String with numbers at its end
Given string s that is appended with a number at last.
The task is to check whether the length of string excluding
that number is equal to that number.
*/

public class CheckLastNum {
    public static int isTrue(String s){
        if(s==null || s.length()==0 )
            return 0;
        char num = s.charAt(s.length()-1);
      //  Integer n = Integer.parseInt(String.valueOf(num));
        int n = Character.getNumericValue(num);
        System.out.println(s.length());
        System.out.println(num);
        if(s.length()-1 != n){
            return 0;
        };
        return 1;
    };
    public static void main(String[] args) {
        String str = "geeks5";
        int isTrue = isTrue(str);
        System.out.println(isTrue);
    }
}
