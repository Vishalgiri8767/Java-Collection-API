package SortingAlgorithms;

public class BubbleSort {
    private static void bubbleSort(int arr[]){
        if(arr.length == 0){
            System.out.println("invalid array");
        }
        else {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        };
        for(int num: arr){
            System.out.println(num);
        };
    }
    public static void main(String[] args) {
        int [] arr = {1,-14,0};
        bubbleSort(arr);
    }
}
