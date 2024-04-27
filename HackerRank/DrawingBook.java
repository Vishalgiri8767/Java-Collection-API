package HackerRank;


/*In this Drawing Book problem you have Given n and p, find and print the minimum
number of pages that must be turned in in order to arrive at page p.*/

public class DrawingBook {
    public static void main(String[] args) {
        pageCount(5, 4);
    }

    public static void pageCount(int n, int p) {
        int count = 0;
        if (n / 2 >= p) {
            for (int i = 1; i < n; i += 2) {
                System.out.println(i);
                if (i <= p)
                    break;
                    count++;
            }
            System.out.println(count);
        }
        else{
            for (int i = n; i >= 1  ; i-=2) {
                System.out.println(i);
                if(i >= p)
                    count++;
            }
            System.out.println("need to flip page = "+count);
        }
    }
}
