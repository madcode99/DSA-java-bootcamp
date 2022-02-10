import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Write a program to print whether a number is even or odd, also take input from the user.
        EvenOdd();
    }
    public static void EvenOdd(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        if(n%2 == 0){
            System.out.println(n+" is Even number .");
        }else {
            System.out.println(n+" is odd number ");
        }
    }
}
