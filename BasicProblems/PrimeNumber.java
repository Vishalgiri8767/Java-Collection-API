package BasicProblems;
public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber.checkPrime(29);
    }
    public static void checkPrime(int number){
        if(number==2)
            System.out.println("2 is prime number");

        for(int i=2; i<number; i++){
            if(number%i==0){
                System.out.println(number+" is non-prime number");
                break;
            }
            else{
                System.out.println(number+" is prime number");
                break;
            }
        }
    }
}
