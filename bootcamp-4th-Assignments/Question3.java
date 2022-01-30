import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // A person is eligible to vote if his/her age is greater than or equal to 18.
        // Define a method to find out if he/she is eligible to vote.
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your age :");
        int A= input.nextInt();
        CanVote(A);
    }
    public static void CanVote(int age){
        if( age >= 18){
            System.out.println(" _you can vote_ ");
        }else {
            System.out.println(" _you can not vote_ ");
        }
    }
}
