package BasicProblems;

public class SumOfDigits {
    public static void main(String[] args) {
        int sum = SumOfDigits.calSum(-1047);
        System.out.println(sum);
    };
    public static int calSum(int number){
        number = Math.abs(number);
        System.out.println(number);
        int sum=0;
        while(number != 0){
            int digit = number%10;
            number = number/10;
            sum += digit;
        }
        return sum;
    }
}
