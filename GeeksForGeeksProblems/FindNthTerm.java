package GeeksForGeeksProblems;

//Find n-th term of series 1, 3, 6, 10, 15, 21
public class FindNthTerm {

    public static int nthTermInSeries(int n){
     int Nth = n*(n+1)/2;
     return Nth;
    }
    public static void main(String[] args) {
        int n = 500;
        int Nth = nthTermInSeries(n);
        System.out.println(n+"th term of series is: "+ Nth);
    }
}
