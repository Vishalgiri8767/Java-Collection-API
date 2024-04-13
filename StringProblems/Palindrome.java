package StringProblems;
// check first and last element if equal then shift first and last to i+1 and i(n-1) and check again.
public class Palindrome {
    public static boolean checkPalindrome(String str){
        for (int i = 0; i < str.length() - 1; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end){
                return false;
            }
        }
        return true;
    };
    public static void main(String[] args) {
        String str ="1214";
        boolean isPalindrome = checkPalindrome(str);
        System.out.println(isPalindrome);
    }
}
