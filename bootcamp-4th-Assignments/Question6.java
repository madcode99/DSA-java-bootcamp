import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        // Write a program to print the circumference and area of
        // a circle of radius entered by user by defining your own method.
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the radius :");
        double radius =in.nextDouble();
        Circle(radius);
    }
    public static void Circle(double r){
        double area = Math.PI*(r*r);
        System.out.println("Area of the circle : "+area);
        double circumference =Math.PI*2*r;
        System.out.println("Circumference of the circle is : "+circumference);
    }
}
