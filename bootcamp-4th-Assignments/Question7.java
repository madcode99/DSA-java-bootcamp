import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        // Define a method to find out if a number is prime or not.
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=input.nextInt();
        System.out.println(isPrime(num));
    }
    public static boolean isPrime(int n){
        if( n <= 1){
            return false;
        }
        int a =2;
        while ( a*a <= n ){
            if(n%a == 0){
                return false;
            }
            a++ ;
        }
        return a * a > n;
    }
}
