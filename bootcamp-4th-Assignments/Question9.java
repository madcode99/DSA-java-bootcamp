import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        // Write a program to print the factorial of a number by defining a method named 'Factorial'.
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=input.nextInt();
        Factorial(n);

    }
    public static void Factorial(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println( n+"! = "+fact);
    }
}
