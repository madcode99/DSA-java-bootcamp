import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        System.out.println(PTR());
    }
    public static float PTR(){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter principle : ");
        float P = input.nextFloat();
        System.out.print("Enter Time : ");
        float T = input.nextFloat();
        System.out.print("Enter Rate :");
        float R = input.nextInt();
        float Interest =(P*T*P)/100;
        System.out.println("The interest will be  :");
        return Interest;
    }
}
