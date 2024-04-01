package ArrayListProblems.Level1;

import java.util.*;

//Java Program To Find two elements such that difference between them is the largest
class Arr {
    int largest;
    int smallest;
    Arr(int largest, int smallest){
        this.largest=largest;
        this.smallest=smallest;
    }
}
public class LargestDiff {

    public Arr findDiff(int arr[]){
        List<Integer> arrList = new ArrayList<>();
        for(int num: arr)
            arrList.add(num);
        Collections.sort(arrList, Comparator.naturalOrder());
        int smallValue = arrList.get(0);
        int largeValue = arrList.get(arrList.size()-1);
        System.out.println();
        return new Arr(largeValue,smallValue);
    }
    public static void main(String[] args) {
        int [] arr = {5,1,2,3,4};
        LargestDiff ob = new LargestDiff();
        Arr fn = ob.findDiff(arr);
        int difference = fn.largest-fn.smallest;
        System.out.println(Arrays.toString(arr));
        System.out.println("two element which have largest diffrence "+fn.largest +" and "+fn.smallest);
        System.out.println("diffrence is "+difference);

    }
}
