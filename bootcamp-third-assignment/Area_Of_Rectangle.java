import java.util.Scanner;

public class Area_Of_Rectangle {
    public static void main(String[] args) {
        //Area Of Rectangle Program
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length :");
        float l=input.nextFloat();
        System.out.println("Enter the width :");
        float w=input.nextFloat();
        float A=w*l;
        System.out.println("The area of triangle is :"+A);
    }
}
