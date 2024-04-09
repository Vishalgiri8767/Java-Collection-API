package ArrayListProblems.Level2;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {3,2,3,9,4,5,7,5};
        int n = arr.length;
        ArrayList<Integer>dupArr= method1(arr,n);
        System.out.println(dupArr);
    };
   /* public static ArrayList<Integer> method2(int arr[], int n){

    };*/
    // first =>sort the array.
    // second => adjucent elements are equal then return;
    // arr[i]==arr[i+1];
    public static ArrayList<Integer> method1(int arr[], int n) {
        ArrayList<Integer> dupArr = new ArrayList<>();
        Arrays.sort(arr);
        int temp=0;
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1])
                dupArr.add(arr[i+1]);
            temp++;
        }
        if(dupArr.isEmpty())
            dupArr.add(-1);
        return dupArr;
    }
}
