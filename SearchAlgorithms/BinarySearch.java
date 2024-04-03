package SearchAlgorithms;
/*
        This type of searching algorithm is used to find the position of a specific value
        contained in a sorted array. The binary search algorithm works on the principle
        of divide and conquer and it is considered the best searching algorithm because
        it's faster to run.
*/
/*
Approach for Binary Search
        Compare the target element with the middle element of the array.
        If the target element is greater than the middle element, then the search continues in the right half.
        Else if the target element is less than the middle value, the search continues in the left half.
        This process is repeated until the middle element is equal to the target element,
        or the target element is not in the array
        If the target element is found, its index is returned, else -1 is returned.
*/
public class BinarySearch {
    public static int binarySearch(int arr[],int element){
        int low=0;
        int high = arr.length-1;

        while(low <= high ) {
            int mid = (low + high)/2;
            if(element > arr[mid]){
                low=mid+1;
            }
            else if(element <arr[mid]){
                high = mid-1;
            }
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,8,9};
        int element = 8;
        int index = binarySearch(arr,element);
        System.out.println(index);

    }
}
