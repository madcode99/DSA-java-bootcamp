import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        //Volume Of Cylinder
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the radius : ");
        float r =input.nextFloat();
        System.out.print("Enter the height : ");
        float h= input.nextFloat();
        double V= 3.14 *r*r*h;
        System.out.print("The Volume Of Cylinder is : "+V);
    }
}
