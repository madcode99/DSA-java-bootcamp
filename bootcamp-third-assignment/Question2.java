import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        //Area Of Triangle
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the base :");
        float base=input.nextFloat();
        System.out.print("Enter the height :");
        float height=input.nextFloat();
        float A=base*height/2;
        System.out.print("the area of triangle is :"+A);
    }
}
