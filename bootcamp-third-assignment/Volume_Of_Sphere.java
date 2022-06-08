import java.util.Scanner;

public class Volume_Of_Sphere {
    public static void main(String[] args) {
        // Volume Of Sphere
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the radius : ");
        float r= input.nextFloat();
        float temp=r*r*r;
        double V=4/3*22/7*temp;
        System.out.println("The Volume Of Sphere is : "+V);
    }
}
