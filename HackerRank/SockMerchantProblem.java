package HackerRank;

import java.util.List;
import java.util.*;

public class SockMerchantProblem {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList());
        int n = list.size();
        int count = sockMerchant(n,list);
        System.out.println(count);
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int numPair = 0;
        Map<Integer,Integer> pair = new HashMap<>();
        for(int color: ar){
            if(pair.containsKey(color))
                pair.put(color, pair.get(color)+1);
            else
                pair.put(color, 1);
        };
        for(Map.Entry<Integer,Integer> value:pair.entrySet()){
            System.out.println(value);
            if(value.getValue()>1){
                 numPair =numPair + value.getValue()/2;
            }
        }
        return numPair;
    }
}
