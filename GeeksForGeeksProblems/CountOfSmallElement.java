package GeeksForGeeksProblems;

public class CountOfSmallElement {
    public static int countOfElements(int []arr,int n,int x)
    {
        int count=0;
        int i=0;
       while(n>i && x>=arr[i]){
           count++;
           i++;
       }
        return count;

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 8, 10};
        int n = arr.length;
        int x = 9;
        int num = countOfElements(arr,n,x);
        System.out.println(num);
    }
}
