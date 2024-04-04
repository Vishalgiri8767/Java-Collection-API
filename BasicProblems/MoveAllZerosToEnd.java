package BasicProblems;
public class MoveAllZerosToEnd {
    public static void moveZero(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                arr[i]=arr[arr.length];
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,3,0,5,9,0,1,0};
        moveZero(arr);
    }
}
