package ArrayListProblems.Level2;

//Java Program To Find the Largest Two Numbers in A given array

import org.w3c.dom.ls.LSOutput;

import java.net.Inet4Address;
import java.util.*;

public class LargestNumber {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10,21,36,9,5));
        ArrayList<Integer> sortedList = LargestNumber.findLargest2Num(arr);
        System.out.println("original list\n"+ arr);
        System.out.println(sortedList);
        int largest1= sortedList.get(0);
        int largest2= sortedList.size() > 1 ? sortedList.get(1) :largest1;
        System.out.println("largest number: "+largest1);
        System.out.println("2nd largest number: "+largest2 );

    }
    public static ArrayList<Integer> findLargest2Num(ArrayList<Integer> number) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        if (number.size() <= 0) {
            System.out.println("list should not be empty");
        } else {

            for (int num : number) {
                if (!set.contains(num)) {
                    list.add(num);
                    set.add(num);
                }
            }
            Collections.sort(list, Collections.reverseOrder());

        }
        return list;
    }
}
