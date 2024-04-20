package StringProblems;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class CharFrequency {
    public static void main(String[] args) {
        findRep("Applea");
    }

    public static void findRep(String str) {
        str = str.toLowerCase();
        char[] ch = str.toCharArray();
        HashMap<Character, Integer> rep = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            char key = ch[i];
            if (rep.containsKey(key)) {
                rep.put(key, rep.get(ch[i]) + 1);
            } else
                rep.put(key, 1);
        }
        for(Map.Entry<Character,Integer> val :rep.entrySet()){
            if(val.getValue()>1)
                System.out.println(val.getKey() + ":"+ val.getValue());
        }
    }
}
