package HashMap;

import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {3,2,4,9,93,3,5,4,3};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int key = arr[i];
            // If the key is already present, update its frequency
            if(map.containsKey(key))
                map.put(key, map.get(key)+ 1);
            else
                map.put(key,1);
        };
        // print the frequency of each element;
        for(int key:map.keySet())
            System.out.println("Element "+ key +" occures "+ map.get(key));
    }
}
