package HashMap;

import java.util.HashMap;
import java.util.Map;

class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // adding values in hashmap.
        map.put("india", 140);
        map.put("china", 150);
        map.put("us", 30);
        map.put("Bihar", 28);
        map.put("Latur",null);
        map.put("china",160);
        System.out.println(map);

/*
        // removing values.
        map.remove("us");
        System.out.println(map);

        // get element using key.
        System.out.println(map.get("china")); ;

        // chekc key present or not...
        boolean check = map.containsKey("Latur");
        System.out.println(check);

        // check element present or not.
        boolean isPresent = map.containsValue("Thane");
        System.out.println(isPresent);
*/

        // iterate
        for(Map.Entry<String,Integer> country:map.entrySet()){
            System.out.print(country.getKey()+": ");
            System.out.println(country.getValue());
        };
        for(Map.Entry<String,Integer> value:map.entrySet()){
            System.out.println(value.getValue());
        }
        for(Map.Entry<String,Integer>pair:map.entrySet()){
            System.out.println(pair.getKey()+" "+pair.getValue());
        }
    }
}
