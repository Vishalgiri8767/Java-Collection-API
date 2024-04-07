package GeeksForGeeksProblems;

import java.util.Arrays;

public class ConvertToWave {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        convertToWave(arr,n);
    }
    public static void convertToWave(int[] arr, int n){
        for(int i=0; i<n-1; i=i+2){
         //   System.out.println(arr[i]);
            System.out.println(Arrays.toString(arr));
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        };
        System.out.println(Arrays.toString(arr));

    }
}
