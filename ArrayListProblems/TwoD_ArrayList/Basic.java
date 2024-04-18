package ArrayListProblems.TwoD_ArrayList;

import java.util.ArrayList;

public class Basic {
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

        System.out.println(arrayList2D);

        int left_d_sum = 0;
        int right_d_sum = 0;
        for (int i = 0; i < arrayList2D.size(); i++) {
                 left_d_sum+=arrayList2D.get(0).get(0);
                 left_d_sum+=arrayList2D.get(1).get(1);
                 left_d_sum+=arrayList2D.get(2).get(2);
            }
        System.out.println(left_d_sum);

        }
      //  System.out.println(arrayList2D.size());

      //  System.out.println(arrayList2D.get(0).get(0));
      //  System.out.println(arrayList2D.get(0).get(arrayList2D.size()));

      /*  for (int i = 0; i < arrayList2D.size(); i++) {
            ArrayList<Integer> row = arrayList2D.get(i);
            for (int j = 0; j < row.size(); j++) {
                System.out.println(row.get(j));
            }
        };*/

}