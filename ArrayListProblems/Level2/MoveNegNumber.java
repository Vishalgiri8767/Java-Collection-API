package ArrayListProblems.Level2;

public class MoveNegNumber {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, -4, 8, -6};
        int[] newArr = moveNegToleft(arr);
        for (int num : newArr)
            System.out.println(num);
    }

    static int[] moveNegToleft(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (left <= right && arr[left] < 0)
                left++;
        }
        while (left <= right) {
            if (left <= right && arr[right] > 0)
                right--;
        }
        if (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}