package ArrayListProblems.Level2;

import java.util.ArrayList;
import java.util.Collections;

class FindDuplicates3 {
    public static void main(String[] args) {
        int arr[] = {3,4,3,3,3,5,8,9,9};
        int n = arr.length;
       ArrayList<Integer> list = duplicates(arr,n);
        System.out.println(list);
    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> dupArr = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    if (dupArr.contains(arr[i])) {

                        break;
                    } else {
                        dupArr.add(arr[i]);
                        Collections.sort(dupArr);
                    }
                }
            }
        }
        if (dupArr.isEmpty())
            dupArr.add(-1);

        return dupArr;

    }
}

