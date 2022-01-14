import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        //Area Of Isosceles Triangle
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the base :");
        float base= input.nextFloat();
        System.out.print("Enter the height :");
        float height = input.nextFloat();
        float A=base*height/2;
        System.out.print("The area of Isosceles Triangle : "+A);
    }
}
