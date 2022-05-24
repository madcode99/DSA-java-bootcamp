import java.util.Scanner;

public class Curved_Surface_Area_Of_Cylinder {
    public static void main(String[] args) {
        //Curved Surface Area Of Cylinder
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the r : ");
        float r= input.nextFloat();
        System.out.print("Enter the h : ");
        float h= input.nextFloat();
        double ans=2*22/7*r*h;
        System.out.print("The Curved Surface Area Of Cylinder : "+ans);
    }
}
