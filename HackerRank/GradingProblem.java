package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingProblem {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(73,67,35,38,33));
        gradingStudents(list);
    };
    public static void gradingStudents(List<Integer> grades) {
        // Write your code here
        for (int i = 0; i < grades.size(); i++){
             if(grades.get(i)%5!=0 && grades.get(i)>=38){
                int rem = grades.get(i)%5;
                int maxNum = grades.get(i) + (5-rem);
               //  System.out.println(maxNum);
                if (maxNum-grades.get(i)<3)
                    grades.set(i,maxNum);
            }
        }
        System.out.println(grades);
    }
}
