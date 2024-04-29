package HackerRank;

import java.util.Collections;
import java.util.List;

public class hardleRaceProblem {
    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int tl = Collections.max(height);
        if(k>=tl)
            return 0;

        return tl-k;

    }


    public static void main(String[] args) {

    }
}
