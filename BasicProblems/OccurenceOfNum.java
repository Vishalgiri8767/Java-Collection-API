package BasicProblems;

import java.util.Scanner;

//Write a Java program to count the occurrence of a specific character in a string.
public class OccurenceOfNum {
    public static int findOccurance(int[] arr,int target){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    };
    public static void main(String[] args) {
        int[] arr = {3,4,93,93,3,5,9,8};
        System.out.println("check occurences: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int count = findOccurance(arr,target);
        System.out.println(target + " found "+count + " times");
    }
}
