package HackerRank;

import java.util.*;

public class MigratoryBirdsProblem {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,1,2,2,4));
        migratoryBirds(arr);
    }
    public static void migratoryBirds(List<Integer> arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num:arr) {
            if(map.containsKey(num))
                map.put(num, map.get(num)+1);
            else
                map.put(num,1);
        }

        for(Map.Entry<Integer,Integer> val:map.entrySet())
            System.out.println(val);

    }
}
