package BasicProblems;
public class FindFactorial {
    int temp=1;
    public static void main(String[] args) {
        FindFactorial fn = new FindFactorial();
       int fact = fn.findFictorialNum(7);
        System.out.println(fact);
    }
    public int findFictorialNum(int number){

        for(int i=number; i>0; i--){
            temp = temp*i;
        }
        return temp;

    }
}
