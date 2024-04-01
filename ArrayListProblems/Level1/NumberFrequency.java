package ArrayListProblems.Level1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
// Find the occurrence of an Element in an Array
public class NumberFrequency {
    public static int calNumFrequency(int arr[], int element){

        ArrayList<Integer>list = new ArrayList<>();
        for(int num : arr){
            list.add(num);
        };
        int temp=0;
        for(int i=0; i<list.size(); i++){
            if(element==list.get(i)){
                temp++;
            }

        }
    return temp;
    }
    public static void main(String[] args) {
        int [] arr = {3,93,3,82,8,33,3};
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the element who's frequeny you want to know");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int n = calNumFrequency(arr,element);
        System.out.println(n);
    }
}
