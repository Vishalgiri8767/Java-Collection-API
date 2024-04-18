package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDiffrence {
    public static void main(String[] args) {
        // how to create 2D arraylist.
        ArrayList<ArrayList<Integer>> arrayList2D = new ArrayList<>();
        // create row1.
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        // add row1 in arraylist.
        arrayList2D.add(row1);

        // create row2
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        // add row1 in arraylist.
        arrayList2D.add(row2);

        // row3
        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(8);
        row3.add(9);
        // add row1 in arraylist.
        arrayList2D.add(row3);
        // call function
        diagonalDifference(arrayList2D);
    }
    public static int diagonalDifference(ArrayList<ArrayList<Integer>> arr) {
        int left_d_sum = 0;
        int right_d_sum = 0;
    };
}
