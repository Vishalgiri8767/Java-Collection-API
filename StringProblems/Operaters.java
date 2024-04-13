package StringProblems;
public class Operaters {
    public static void main(String[] args) {
        printAtoZ();
    };
    public static void printAtoZ(){
        for (int i = 0; i < 26; i++) {
            char ch = (char)('A' + i);
            System.out.println(ch);
        }
    }
    public static void operators(){
        System.out.println('a' + 'b');  // double quote for string and
        // char a + char b             // single quote for char.
        // it is printing there Integer value.(Ascii or unicode ).
        // out put => 195

        System.out.println("a" + "b");  //string a + string b. => string
        System.out.println('a' + "bcd"); // string+ch => string

        System.out.println('a' + 3);  // ch(ascii)+integer => integer.
        System.out.println("a"+3);  // string+integer=>stringInteger
    }
}
