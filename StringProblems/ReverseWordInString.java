package StringProblems;

import java.util.Arrays;

public class ReverseWordInString {
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        reverseWordInString(str);
    };
    public static void reverseWordInString(String str){

        String st[]  = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        String s = "";
        System.out.println(Arrays.toString(st));
       /* for (int i = st.length-1 ; i > 0; i--) {
            System.out.print(st[i]+ ".");
        }*/
        for (int i = st.length-1; i > 0; i--) {
            s = s+st[i]+".";
            sb.append(st[i]);
            sb.append(".");
        }
        System.out.println(sb);
        System.out.println(s.substring(0,s.length()-1));
        System.out.println(sb.substring(0,s.length()-1));
    }
}
