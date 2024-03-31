package JavaProblems.Level1;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class JavaBasic {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);

    // insert 40 at index 3
        list.add(3,40);
    /*    for (Integer i: list) {
            System.out.println(i);
        };*/

        // insert new arraylist inside existing.
        ArrayList<Integer> newList = new ArrayList();
        newList.add(110);
        newList.add(120);
        newList.add(130);

        list.addAll(newList);
      //  list.forEach(e-> System.out.println(e));

        //get number at index 4
        int num = list.get(4);
       System.out.println(list);
     //   System.out.println(num);

    // remove element at position 3.
        list.remove(3);
        System.out.println(list);

    // remove element by there value.
        list.remove(Integer.valueOf(110));
        System.out.println(list);
        //clear the list means remove all elements from the list and make it empty.
      //  list.clear();
      //  System.out.println(list);

        // check if element is present or not.
        boolean bool = list.contains(120);

        System.out.println(bool);

    }

}
