package GeeksForGeeksProblems;
//        Given a sorted array of size N and an integer K,
//        find the position(0-based indexing) at which K is present
//        in the array using binary search.
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,9,3,4,1,8,6};
        int k=14;
        BinarySearch bs = new BinarySearch();
        int result = bs.binarySearch(arr,k);
        System.out.println(result);
    }
    public int binarySearch(int[] arr, int k){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==k)
                return mid;
            else if(arr[mid]>mid)
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }

}
