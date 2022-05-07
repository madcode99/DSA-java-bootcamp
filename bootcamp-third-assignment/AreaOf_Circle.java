import java.util.Scanner;

public class AreaOf_Circle {
        public static void main(String[] args) {
            //Area Of Circle Java Program
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the value of r: ");
            float r=input.nextFloat();
            float pi = (float) 3.1416;
            float A=pi*(r*r);
            System.out.println("the area of circle is :"+A);
        }
}
