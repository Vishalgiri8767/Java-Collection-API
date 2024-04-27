package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxPerimeterTriangle {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,5,3,4));
        int n = arr.size();
        maxPerimeterTriangle(arr,n);
    }
    public static void maxPerimeterTriangle(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int sum = 0;
        int max = 0;

        Collections.sort(arr);
        System.out.println(arr);
        if(n<3){
            System.out.println("less than 3 sides");
        }
        else if(n==3) {
          //  max = Collections.max(arr);
            if (arr.get(n-1) < arr.get(0)+arr.get(1)){
                System.out.println((arr.get(0)+arr.get(1)+arr.get(2)));
            }
            else
                System.out.println("Not valid triangle");
        }
        else
            for (int i = 0; i < n-2; i++) {
                max = arr.get(n - 1);
                sum += arr.get(i + 1);
                System.out.println(sum);
            }
                if(sum > max){
                    System.out.println(sum+max);
                }{

                }

    }
}
