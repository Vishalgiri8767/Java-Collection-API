package BasicProblems;

public class ReverseInteger {
    public static void main(String[] args) {
       int revNum =  reverseInt(-2034);
        System.out.println(revNum);
    };
    static int reverseInt(int num){
        int revNum = 0;
        while (num != 0){
            int digit = num%10;
            revNum = revNum*10 + digit;
            num = num/10;
        };
        return revNum;
    }
}
