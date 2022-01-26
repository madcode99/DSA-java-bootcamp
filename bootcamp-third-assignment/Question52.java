import java.util.Scanner;

public class Question52 {
    public static void main(String[] args) {
        //Write a program to print the sum of negative numbers, sum of positive even numbers and
        // the sum of positive odd numbers from a list of numbers (N) entered by the user.
        // The list terminates when the user enters a zero.
        Scanner input =new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.print("Enter a number : ");
            int n= input.nextInt();
             sum=sum+n;
            if(n==0){
                System.out.println("Sum : "+sum);
                break;
            }
        }
    }
}
