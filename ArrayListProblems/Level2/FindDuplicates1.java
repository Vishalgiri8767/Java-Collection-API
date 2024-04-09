package ArrayListProblems.Level2;

import java.util.ArrayList;
import java.util.Arrays;
public class FindDuplicates1 {
    public static void main(String[] args) {
        int[] arr = {3,2,9,4,5,7,5};
        int n = arr.length;
     //   ArrayList<Integer>dupArr= method1(arr,n);
       // System.out.println(dupArr);
        int ans = method2(arr,n);
        System.out.println(ans);
    };
    //visited soloution.
    public static int method2(int arr[], int n){
        int ans = -1;
        for(int i=0; i<arr.length; i++){
            int index = Math.abs(arr[i]);
            // already visited.
            if(arr[index]<0){
                ans = index;
                break;
            }
            //visited mark
            else
                arr[index] *= -1;
        }
        return ans;
    };
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
