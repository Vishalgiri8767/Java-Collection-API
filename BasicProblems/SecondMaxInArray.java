package BasicProblems;

public class SecondMaxInArray {
    public static int find2Max(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax && arr[i] != max)
                secondMax = arr[i];
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr = {33,25,7,13};
       int result = find2Max(arr);
       System.out.println(result);
    }
}
