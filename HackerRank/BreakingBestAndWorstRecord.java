package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingBestAndWorstRecord {
    public static void main(String[] args) {
        int[] arr = {12, 24, 10, 24};
        List<Integer> list = new ArrayList<>(Arrays.asList(10,5,20,20,4,5,2,25,1));
        breakingRecords(list);
    }

    public static void breakingRecords(List<Integer> scores) {
        int max = scores.get(0);
        int min=scores.get(0);
        int m,n;
        m=n=0;
        for (int i = 0; i < scores.size()-1; i++) {
          if(max< scores.get(i)){
              max=scores.get(i);
              m++;
          }
          else if(min > scores.get(i)){
              min=scores.get(i);
              n++;
          }
        }
        System.out.println(m +" "+n );
    }
}
