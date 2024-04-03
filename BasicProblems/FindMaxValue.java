package BasicProblems;
import java.util.Arrays;
public class FindMaxValue {
    public int maxValue(int arr[]) {

        if(arr.length==0 || arr==null) {
            System.out.println("Invalid array");
            return -1;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("max element from this array is: ");
        return max;
    }
    public static void main(String[] args) {
        int[] arr ={};
        FindMaxValue max1 = new FindMaxValue();
        int max = max1.maxValue(arr);
        System.out.println(max);
    }
}
