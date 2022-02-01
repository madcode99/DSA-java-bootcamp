import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        // Define a method that returns the product of two numbers entered by user.
        Scanner input=new Scanner(System.in);
        System.out.print("Enter two numbers :");
        int a=input.nextInt();
        int b= input.nextInt();
        System.out.println("Product :"+Product(a,b));
    }
    public static int Product(int a , int b){
        return a*b;
    }
}
