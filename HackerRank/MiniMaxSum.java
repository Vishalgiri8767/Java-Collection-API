package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/*Given five positive integers, find the minimum and maximum
        values that can be calculated by summing exactly four
        of the five integers. Then print the respective minimum
        and maximum values as a single line of two space-separated
        long integers.*/

public class MiniMaxSum {
    public static MinMax findMinMaxSum(List<Integer> arr){
        arr.sort(Comparator.naturalOrder());
        long minSum = 0;
        long maxSum = 0;
        for (int i = 1; i < arr.size(); i++)
            maxSum +=arr.get(i);
        for (int i = 0; i < arr.size()-1; i++)
            minSum += arr.get(i);

        return new MinMax(minSum,maxSum);
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(3,2,7,9));
        MinMax mn = findMinMaxSum(arr);
        System.out.println("Minimun Sum: "+mn.min);
        System.out.println("Maximum Sum: "+mn.max);
    }
}
class MinMax{
    long min, max;
    public MinMax(long min, long max){
        this.min = min;
        this.max = max;
    }
}
