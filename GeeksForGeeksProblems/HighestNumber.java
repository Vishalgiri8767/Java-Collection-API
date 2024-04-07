package GeeksForGeeksProblems;

public class HighestNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,8,3,6,9,30};
        int n =arr.length;
        HighestNumber hn = new HighestNumber();
        int max = hn.findMaximum(arr,n);
        System.out.println("Maximum number is: "+max);
    };
    int findMaximum(int[] arr, int n) {
        int max = arr[0];
        for(int i=1; i<n; i++){
            if(max<arr[i]) {
                max=arr[i];
            }
        }
        return max;
    }
}
