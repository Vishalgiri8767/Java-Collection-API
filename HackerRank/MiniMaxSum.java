package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {
    public static MinMax findMinMaxSum(List<Integer> arr){
        long min = 0;
        long max = 0;
        for (int i = 1; i < arr.size(); i++)
            max +=arr.get(i);
        for (int i = 0; i < arr.size()-1; i++)
            min += arr.get(i);

        return new MinMax(min,max);
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,3,5,7,9));
        MinMax mn = findMinMaxSum(arr);
        System.out.println(mn.min);
        System.out.println(mn.max);
    }
}
class MinMax{
    long min, max;
    public MinMax(long min, long max){
        this.min = min;
        this.max = max;
    }
}
