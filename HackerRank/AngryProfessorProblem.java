package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given the arrival time of each student and a threshhold number of attendees. determine if
        the class is cancelled.
        Example
        a = [-2, -1,0, 1, 2]
        The first 3 students arrived on. The last 2 were late. The threshold is 3 students, so class
        will go on. Return YES.*/
public class AngryProfessorProblem {
    public static String angryProfessor(int k, List<Integer> a) {
        int count = 0;
        for (int i = 0; i <a.size() ; i++) {
            if(a.get(i)<1){
                count++;
                if(count>=k)
                    return "Class will continue";
            }
        }
        return "Class will cancel";
    }
    public static void main(String[] args) {
        int k = 4;
        List<Integer> a = new ArrayList<>(Arrays.asList(0, -1,-2, 2, 1));
        String result = angryProfessor(k,a);
        System.out.println(result);
    }
}
