package HackerRank;

public class ElectronicShopProblem {
    public static void getMoneySpent(int[] keyboards, int[] drives, int b){
        int total = 0;
        int max = -1;
        for(int keyboard: keyboards){
            for(int drive:drives){
                 total = drive + keyboard;
                System.out.println(total);
                 if(total <= b && total > max)
                     max=total;
            }
        }
        System.out.println(max);
    };
    public static void main(String[] args) {
        int[] keyboards = {40,50,60};
        int[] drives = {5,8,12};
        int b = 60;
        getMoneySpent(keyboards,drives,b);
    }
}
