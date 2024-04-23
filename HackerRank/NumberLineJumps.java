package HackerRank;

public class NumberLineJumps {
    public static void main(String[] args) {
        String result = kangaroo(2 ,1,1,2);
        System.out.println(result);
    }
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        if((v1-v2)==0){
            return "NO";
        }
        if((x2-x1) % (v1-v2) == 0 && (v1-v2) > 0){
            return "YES";
        }else{
            return"NO";
        }

    }

}
