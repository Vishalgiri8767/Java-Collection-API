package HackerRank;

import java.util.ArrayDeque;
import java.util.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class P2 {
    public static void main(String[] args) {
        int[] orders = {-11, 2, 19, 37, 64, -18};
        int size = 3;

        int[] result = firstMeatOrders(orders, size);

        // Output the result
        for (int meatOrder : result) {
            System.out.print(meatOrder + " ");
        }
    }

    public static int[] firstMeatOrders(int[] orders, int size) {
        // Initialize a deque to represent the orders displayed on the screen
        Deque<Integer> display = new ArrayDeque<>();
        int[] output = new int[orders.length];

        // Iterate through the orders
        for (int i = 0; i < orders.length; i++) {
            int order = orders[i];

            // Add the current order to the display
            display.offer(order);

            // If the display size exceeds K, remove the oldest order
            if (display.size() > size) {
                display.poll();
            }

            // Check if the first order in the display is a meat-based pizza order
            int meatOrder = 0;
            for (int item : display) {
                if (item < 0) { // Meat-based pizza order
                    meatOrder = item;
                    break;
                }
            }

            // Add the first meat-based pizza order to the output list
            output[i] = meatOrder;
        }

        return output;
    }
}
