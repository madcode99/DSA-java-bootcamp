import java.util.Scanner;

public class Volume_Of_Cone {
    public static void main(String[] args) {
        // Volume Of Cone Java Program
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of radius : ");
        float r=input.nextFloat();
        System.out.print("Enter the value of height : ");
        float h= input.nextFloat();
        float temp = r*r;
        double V= 3.14*temp*(h/3);
        System.out.println("The Volume Of Cone : "+V);
    }
}
