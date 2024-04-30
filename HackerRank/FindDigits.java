package HackerRank;

public class FindDigits {
    public static int findNumber(int n){
        int count= 0;
        int temp =0;
        while (n>0){
            int digit = n%10;
            if(digit!= 0 && temp%digit==0)
                count++;
            n/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        int result = findNumber(12345);
        System.out.println(result);
    }
}
