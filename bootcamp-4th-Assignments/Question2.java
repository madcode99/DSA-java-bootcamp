import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Define a program to find out whether a given number is even or odd.
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num= input.nextInt();
        EvenOdd(num);
    }
    public static void EvenOdd(int n){
        if(n % 2 == 0){
            System.out.print(n+ " is Even");
        }
        else {
            System.out.print(n+ " is Odd");
        }
    }
}
