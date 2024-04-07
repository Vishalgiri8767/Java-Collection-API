package GeeksForGeeksProblems;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,2,3,5};

        int n = arr.length+1;
       // System.out.println(n);
       int missingNum =  s.missingNumber(arr,n);
       System.out.println("Missing Number is :"+missingNum);
    }
}
class Solution {
    int missingNumber(int[] array, int n) {
        // Your Code Here
       // sum of n natural number - sum of given array.

        int nSum = (n*(n+1))/2;
        System.out.println("nSum :"+nSum);
        int s = array.length;

        int sum = 0;
        for(int i=0; i<s; i++){
            sum += array[i];
        }
        System.out.println(sum);
        return nSum-sum;
    }
}