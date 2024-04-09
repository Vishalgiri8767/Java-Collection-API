package BasicProblems;

public class ReverseInteger {
    public static void main(String[] args) {
       int revNum =  reverseNum1(2034);
        System.out.println(revNum);
        int rNum = reverseNum2(2034);
        System.out.println(rNum);
    };
    static int reverseNum2(int num){
        String numStr = Integer.toString(num);
        StringBuffer revStr = new StringBuffer();
        for(int i=numStr.length()-1; i>=0; i--){
            revStr.append(numStr.charAt(i));
        };
        int revNum = Integer.parseInt(revStr.toString());
        return revNum;
    }
    static int reverseNum1(int num){
        int revNum = 0;
        while (num != 0){
            int digit = num%10;
            revNum = revNum*10 + digit;
            num = num/10;
        };
        return revNum;
    }
}
