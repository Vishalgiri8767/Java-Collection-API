package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PizzaProblem {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-11,2,19,37,64,-18));
        int k = 3;
        int l = list.size();
        ArrayList<Integer> res = findMeatPizza(list,k,l);
        System.out.println();
        System.out.println(res);
    }
    public static ArrayList<Integer> findMeatPizza(List<Integer> list, int k, int l){
        // -11,2,19,37,64,-18
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> filter = new ArrayList<>();
        for (int i = 0; i < l-2; i++) {
          //  System.out.println("i: "+list.get(i));
            for (int j = i; j < i+3 ; j++) {
              //  System.out.print(list.get(j) + " ");
                filter.add(list.get(j));
                if(list.get(j)<0)
                    result.add(list.get(j));

            }
        }
        return result;
    }
}
