package GeeksForGeeksProblems;

import java.util.Arrays;

class Pair {
    long min;
    long max;
    Pair(long min, long max){
        this.min=min;
        this.max=max;
    }
}
public class MinAndMaxNumber {
    public static void main(String[] args) {
        long[] arr = {3,92,94,84,23,19};
        long n = arr.length;
        Pair pair = getMinMax(arr,n);
        System.out.println("max number: "+pair.max);
    }
    static Pair getMinMax(long a[], long n)
    {
        Arrays.sort(a);
        long min = a[0];
        long max = a[(int)(n-1)];

        return new Pair(min,max);
    }
}
