package GeeksForGeeksProblems;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,8,9};
        int N = arr.length;
        int K = 84;
        int result = searchInSorted(arr,N,K);
        System.out.println(result);
    }
    static int searchInSorted(int arr[], int N, int K)
    {
        // logic = if element is present return 1 and
        // it is absent then return -1;
        for(int i=0; i<N; i++){
            if(arr[i]==K)
                return 1;
        }
        return -1;
    }
}
