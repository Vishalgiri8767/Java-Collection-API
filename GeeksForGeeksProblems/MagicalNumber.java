package GeeksForGeeksProblems;
/*Your friend loves magic and he has coined a new term -
"Magical number". To perform his magic, he needs that magic number.
You are given a sorted array arr of distinct integers.
A number arr[i] is a magical number if arr[i] = i (0-based indexing).
You have to return the leftmost magical number present in
the given array arr, if there is no magical number in the
array arr then return -1
*/
public class MagicalNumber {
    public static void main(String[] args) {
        int[] arr = {-2, -1, 2, 4, 6};
        int N = arr.length;
        int result = findMagicalNumber(N,arr);
        System.out.println(result);
    }
    public static int findMagicalNumber(int N, int[] arr) {
        for(int i=0; i<N; i++){
            if(i==arr[i])
                return i;
        }
        return -1;
    }
}
