package GeeksForGeeksProblems;

import java.util.ArrayList;
//Maximum of all subarrays of size k
//Given an array arr[] of size N and an integer K.
// Find the maximum for each and every contiguous subarray of size K.
public class MaxOfSubArrays {
    public static void main(String[] args) {
        int[] arr ={1,2,3,2,0};
        int n = arr.length;
        int k =3;
        max_of_subarrays(arr,n,k);
    };
    //Function to find maximum of each subarray of size k.
    static void max_of_subarrays(int arr[], int n, int k)
    {
        int max=0;
        for(int i=0; i<n-2; i++){
            if(arr[i]>arr[i+1] && arr[i]>arr[i+2]){
                max = arr[i];
            } else if (arr[i+1]>arr[i] && arr[i+1]>arr[i+2]) {
                max = arr[i+1];
            }
            else
                max = arr[i+2];
            System.out.println(arr[i]+" "+arr[i+1]+" "+arr[i+2]+" : " + max);
        }
    }
}
