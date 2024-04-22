package HackerRank;

public class UtopianTreeProblem {
    public static void main(String[] args) {
        int result = utopianTree(5);
        System.out.println(result);
    }
    public static int utopianTree(int n) {
        int result = 0;

        for (int i = 0; i <= n; i++) {
            if(i%2==0){
                result +=1;
                //System.out.println(result);
            }else {
                result *= 2;
               // System.out.println(result);
            }
        }
        return result;
    }
}
