package HackerRank;

/*
A person wants to determine the most expensive computer keyboard and
 USB drive that can be purchased with a give budget. Given price lists
 for keyboards and USB drives and a budget, find the cost to buy them.
 If it is not possible to buy both items, return .
*/

public class ElectronicShopProblem {
    public static int getMoneySpent(int[] keyboards, int[] drives, int b){
        int total = 0;
        int max = -1;
        for(int keyboard: keyboards){
            for(int drive:drives){
                 total = drive + keyboard;
              //  System.out.println(total);
                 if(total <= b && total > max)
                     max=total;
            }
        }
        if(max>=total)
            return -1;

        return max;
    };
    public static void main(String[] args) {
        int[] keyboards = {5,1,1};
        int[] drives = {4};
        int b = 5;
        int result = getMoneySpent(keyboards,drives,b);
        System.out.println(result);
    }
}
