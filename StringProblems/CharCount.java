package StringProblems;

import java.util.HashMap;
import java.util.Map;

// How do you get distinct characters and their count in a string in Java?
public class CharCount {
    public static void main(String[] args) {
        String str = "aAaAbbCdea";
        getCharCount(str);
    };
    public static void getCharCount(String str){
        Map<Character, Integer> charsCount = new HashMap<>();
        char[] chars = str.toCharArray();
        for(char c : chars){
            if(charsCount.containsKey(c)){
                charsCount.put(c,charsCount.get(c)+1);
            }
            else
                charsCount.put(c,1);
        }
        System.out.println(charsCount);
    }
}
