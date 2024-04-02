package SearchAlgorithms;
// Linear search or sequencial search.
   /*     This algorithm works by sequentially iterating through the whole array or list from one end
        until the target element is found. If the element is found, it returns its index, else -1.
*/
/*
Time Complexity Analysis
        The Best Case occurs when the target element is the first element of the array.
        The number of comparisons, in this case, is 1. So, the time complexity is O(1).

        The Average Case: On average, the target element will be somewhere in the middle of the array.
        The number of comparisons, in this case, will be N/2. So, the time complexity will be O(N)
        (the constant being ignored).

        The Worst Case occurs when the target element is the
        last element in the array or not in the array.
        In this case, we have to traverse the entire array,
        and so the number of comparisons will be N. So, the time complexity will be O(N).

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void linearSearch(int arr[],int target){
        ArrayList<Integer> arrList = new ArrayList<>();
        int temp=0;
        for(int num: arr){
            arrList.add(num);
        }
        System.out.println("Element found at index ");
        for(int i=0; i<arrList.size(); i++){
            if(arrList.get(i)==target){
                System.out.print(i +", ");
                temp++;
            }
        }
        if(temp == 0)
            System.out.println("element not found");
    }
    public static void main(String[] args) {
        int [] arr = {2,4,5,6,9,4,4};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter target number: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        linearSearch(arr,target);
    }
}
