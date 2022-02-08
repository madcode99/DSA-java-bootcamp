import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        // Write a function to find if a number is a palindrome or not. Take number as parameter.
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        numP(n);
    }
    public static void numP(int n){
        int num =n;
        int rev=0;
        while( n>0 ){
            int rem =n%10;
            n/=10;
            rev=rev*10+rem;
        }
        System.out.println(rev);
        if(rev == num){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome ");
        }
    }
}