package ArrayListProblems.Level1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Program 1: Find the Even and Odd Elements of an Array
class Arr1 {
    ArrayList<Integer>even;
    ArrayList<Integer>odd;

     Arr1(ArrayList<Integer>even, ArrayList<Integer>odd){
        this.even = even;
        this.odd = odd;
    }
};

public class EvenAndOdd {
    public static Arr1 findOddEven(ArrayList<Integer> list){
        ArrayList<Integer>even = new ArrayList<>();
        ArrayList<Integer>odd = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            if(list.get(i) % 2==0)
                even.add(list.get(i));

            else
                odd.add(list.get(i));
        };
        return new Arr1(even,odd);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,4,0,5,6,-2));
        Arr1 ob = findOddEven(list);
        System.out.println("even numbers: "+ob.even);
        System.out.println("odd numbers: "+ob.odd);
    }
}
