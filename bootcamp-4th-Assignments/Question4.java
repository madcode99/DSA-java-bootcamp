import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
       // Write a program to print the sum of two numbers entered by user by defining your own method.
        Scanner in=new Scanner(System.in);
        System.out.print("Enter two numbers  : ");
        int n1=in.nextInt();
        int n2=in.nextInt();
        System.out.println("Sum : "+ Sum(n1,n2) );
    }
    public static int Sum (int n1 ,int n2){
        return n1+n2;
    }
}
