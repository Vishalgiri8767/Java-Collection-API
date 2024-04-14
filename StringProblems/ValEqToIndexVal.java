package StringProblems;

import java.util.ArrayList;

public class ValEqToIndexVal {
    public static ArrayList<Integer> valueEqualToIndex(int[] arr){
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==i+1)
                list.add(arr[i]);
        };
        return list;
    };
    public static void main(String[] args) {
        int[] arr={15, 2, 45, 12, 7};
        ArrayList<Integer> num = valueEqualToIndex(arr);
        System.out.println(num);
    }
}
