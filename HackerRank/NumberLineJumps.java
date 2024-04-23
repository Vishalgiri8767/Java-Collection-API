package HackerRank;

/*
 You are choreographing a circus show with various animals.
 For one act, you are given two kangaroos on a number line ready to
 jump in the positive direction (i.e, toward positive infinity).

The first kangaroo starts at location  and moves at a rate of
meters per jump.
The second kangaroo starts at location  and moves at a rate of

meters per jump.
You have to figure out a way to get both kangaroos at the same location
at the same time as part of the show. If it is possible, return YES, otherwise return NO.
 */

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
