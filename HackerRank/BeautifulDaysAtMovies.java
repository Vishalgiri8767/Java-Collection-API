package HackerRank;

public class BeautifulDaysAtMovies {
    public static void main(String[] args) {
        int result = beautifulDays(20, 23, 6);
        System.out.println(result);

      //  beautifulDays(20,24,6);
    }

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int beautyDay = 0;
        for (int start = i; start <= j; start++) {
        //    System.out.println(start);
            int reverseNum = 0;
            int first = start;
            while (first != 0) {
                int digit = first % 10;
                reverseNum = (reverseNum * 10) + digit;
                first= first / 10;
            };
          //  System.out.println(reverseNum);
            if((Math.abs(start-reverseNum))%k==0)
                beautyDay++;
        };
        return beautyDay;
    }
}


