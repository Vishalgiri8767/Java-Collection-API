package HackerRank;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;

/* You are in charge of the cake for a child's birthday.
You have decided the cake will have one candle for each year
of their total age. They will only be able to blow out the
tallest of the candles. Count how many candles are tallest.
*/
       /* Example
        candles= [4,4,1,3];
        The maximum height candles are  units high. There are  of them,
        so return .*/

class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int temp = 1;
        Collections.sort(candles, Collections.reverseOrder());
        for(int i=0; i<candles.size(); i++){
            if(candles.get(i)==candles.get(i+1))
                temp += 1;
            else
                break;
        };
        System.out.println("talletst candle is: "+ candles.get(0));
        return temp;

    }

}

public class BirthdayCakeCandles {
    public static void main(String[] args) throws IOException {

        List<Integer> candles = new ArrayList<>(Arrays.asList(4,1,2,5,4));

        int result = Result.birthdayCakeCandles(candles);
        System.out.println("present "+result+" times");
    }
}
