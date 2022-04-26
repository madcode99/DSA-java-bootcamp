import java.util.Scanner;

public class EvenOddnumbers {
    public static void main(String[] args) {
        // Write a program to print whether a number is even or odd, also take input.
        Scanner input = new Scanner(System.in);
        //take input
        System.out.println("Enter a number :");
        int num = input.nextInt();
        // An even number is an integer that is exactly divisible by 2.
        if (num % 2 == 0) {
            System.out.println("the following number is even :" + num);
        } else {
            System.out.println("the following number is odd : " + num);
        }
    }
}
