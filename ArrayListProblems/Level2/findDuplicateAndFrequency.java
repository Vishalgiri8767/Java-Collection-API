package ArrayListProblems.Level2;

import java.net.Inet4Address;
import java.util.ArrayList;

public class findDuplicateAndFrequency {
    public static ArrayList<Integer> findDup(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: arr)
            list.add(num);
        int count = 0;
        // find frequnce of each element;
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)==list.get(i+1)){
                count++;
            };
            System.out.println(list.get(i) + " frequency "+ count);

        }
      //  System.out.println(list);
        return list;
    };
    public static void main(String[] args) {
        int[] arr = {3,4,9,3,5,8,4};
        ArrayList<Integer> newArr = findDup(arr);
        System.out.println(newArr);
    }
}
