package ArrayListProblems.Level1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {

    }
}
//1) Explain the different ways of constructing an ArrayList?
//  a) ArrayList() —> It creates an empty ArrayList with initial capacity of 10.
class ArrayCreation {
    public void array1(){
        List<Integer> list = new ArrayList();
    }
    // b) ArrayList(int initialCapacity) —> It creates an empty ArrayList with supplied initial capacity.
    public void array2(){
        List<Integer> list = new ArrayList(20);
    }
    // c) ArrayList(Collection c) —> It creates an ArrayList containing the elements of the supplied collection.
    public void array3(){
        List<Integer> list1 = new ArrayList();
        List<Integer> list = new ArrayList(list1);
    };
    // insert element at initialization...
    public void array4(){
        List<String> list = new ArrayList<>(
                Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));
    }
}
