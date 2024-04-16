package StringProblems;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "vishal giri ";
        String s = removeSpaces(str);
        System.out.println(s.toString());
    }
    public static String removeSpaces(String str){
        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();
        for(char letter: ch){
            if(!Character.isWhitespace(letter))
                sb.append(letter);
            str = String.valueOf(letter);
        };
        return str;
    }
}
