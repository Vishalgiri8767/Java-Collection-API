package HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class hardleRaceProblem {
    public static int hurdleRace(int k, List<Integer> height) {
        int tl = Collections.max(height);
        if(k>=tl)
            return 0;
        return tl-k;
    }
    public static void main(String[] args) {
        List<Integer> height = Arrays.asList(1,2,3,3,2);
        int k =1;
        int result = hurdleRace(k,height);
        System.out.println(result);
    }
}
