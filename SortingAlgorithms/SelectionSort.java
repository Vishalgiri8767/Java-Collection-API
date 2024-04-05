package SortingAlgorithms;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {};
        int[] sortedArr=selectionSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    };
    public static int[] selectionSort(int[] arr){
        int min,temp=0;
        for(int i=0; i<arr.length; i++){
            min=i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                };
            };
            temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        };
        return arr;
    }
}
