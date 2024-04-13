package StringProblems;

import java.util.Arrays;

public class ReverseWordInString {
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        String line = reverseWordInString(str);
        System.out.println(line);
    };
    public static String reverseWordInString(String S)
        {
            String res = "";
            String[] str = S.split("\\.");
            for(int i=str.length-1;i>=0;i--){
                res=res+str[i]+".";
            }
            return res.substring(0,res.length()-1);
        }
    }
