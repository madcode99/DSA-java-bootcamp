import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        //Take 2 numbers as input and print the largest number.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers :");
        int num = input.nextInt();
        int num1 = input.nextInt();
        int LargestNum = 0;
        if (num > num1) {
            LargestNum = num;
        } else if (num1 > num) {
            LargestNum = num;
        }
        System.out.println("The Largest number is  :" + LargestNum);
    }
}