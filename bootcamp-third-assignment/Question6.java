import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        // Area Of Rhombus
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Diagonal p :");
        float p =input.nextFloat();
        System.out.print("Enter the Diagonal q :");
        float q=input.nextFloat();
        float A=(p*q)/2;
        System.out.println("Area Of Rhombus : "+A);
    }
}
