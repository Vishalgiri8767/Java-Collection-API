package BasicProblems;

public class PalindromeCheckInt {

    public static void main(String[] args) {
        boolean isPalindrome = PalindromeCheckInt.checkPalindrome(1221);
        if(isPalindrome){
            System.out.println("palindrome number");
        }
        else{
            System.out.println("not palindrome number");
        }
    }
    public static boolean checkPalindrome(int number){
        int originalNum = number;
        int reverseNum = 0;

        while(number != 0){
            int digit = number%10;
            reverseNum = reverseNum * 10 + digit;
            number /= 10;       // number = number/10;
        }
        return originalNum == reverseNum;
    }

}
