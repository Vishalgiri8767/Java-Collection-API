package ArrayListProblems.Level2;
public class FindDuplicates2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 1, 1, 6, 7, 8, 8};
        findDuplicates(array);
    }

    public static void findDuplicates(int[] array) {
        System.out.println("Duplicate elements in the array:");
        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            int absIndex = Math.abs(array[i]);
            // Check if the current element is not marked as visited (negative)
            if (array[absIndex] >= 0) {
                // Mark the element as visited by negating its value
                array[absIndex] = -array[absIndex];
            } else {
                // If the element is already marked as visited, it's a duplicate
                System.out.println(absIndex);
            }
        }
    }
}
