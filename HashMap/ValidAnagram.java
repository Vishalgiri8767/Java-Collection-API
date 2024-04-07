package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void isAnagram(String str){
        Map<Integer, String > map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            int key = i;
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    };
    public static void main(String[] args) {
        isAnagram("vishalgiri");
    }
}
