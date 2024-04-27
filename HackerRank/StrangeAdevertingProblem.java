package HackerRank;
//HackerLand Enterprise is adopting a new viral advertising strategy.
// When they launch a new product,
// they advertise it to exactly  people on social media.

public class StrangeAdevertingProblem {
    public static void main(String[] args) {
        int result = viralAdvertising(5);
        System.out.println(result);
    }
    public static int viralAdvertising(int n) {
        // Write your code here
        int liked = 0;
        int shared = 5;
        int cummulative = 0;
        for (int day = 1; day <= n; day++) {
            liked = shared/2;
            shared = liked*3;
            cummulative=liked+cummulative;
        }
        return cummulative;

    }

}
