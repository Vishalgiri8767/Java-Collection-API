package BasicProblems;
public class FindMinValue {
    public int findMin(int arr[]){
        if(arr.length==0 || arr==null){
            return -1;
        };
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    };
    public static void main(String[] args) {
        FindMinValue fm = new FindMinValue();
        int []arr = {3,9,5,1,3,0,7};
        int min =fm.findMin(arr);
        System.out.println(min);
    }
}
