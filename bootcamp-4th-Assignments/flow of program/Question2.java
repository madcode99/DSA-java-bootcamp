import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Take two numbers and print the sum of both.
        Scanner input =new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = input.nextInt();
        int b= input.nextInt();
        System.out.println(Sum(a,b));
    }
    public static int Sum(int a,int b){
        return a+b;
    }
}
