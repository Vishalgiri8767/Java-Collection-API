package HashMap;
import java.util.*;

public class Main {
    public static void countFrequency(int arr[]){
        Map<Integer,Integer> map = new HashMap<>();

        int max = Integer.MIN_VALUE;
        int minVal = 0;
        int maxKey= 0;
        int minKey=0;

        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        };
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int min = entry.getValue();
            // System.out.println(entry);
            System.out.println(entry.getKey() + ": "+entry.getValue());
            if(max<entry.getValue()){
                max = entry.getValue();
            }
            if(min >= entry.getValue()){
                min = entry.getValue();
                minVal = min;
            }
        };
        System.out.println("max and min frequency: "+ max +"and "+ minVal);

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==minVal)
                minKey = entry.getKey();
        };
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==minVal)
                minKey = entry.getKey();
        }

          System.out.println("Min and Max Values :"+maxKey +","+ minKey);
    
}

    public static void main(String[] args) {
        int [] arr = {1,2,1,2,3,4,2};

        countFrequency(arr);
    }
}
