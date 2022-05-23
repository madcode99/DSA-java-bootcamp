import java.util.Scanner;

public class Volume_Of_Pyramid {
    public static void main(String[] args) {
        //Volume Of Pyramid
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the length : ");
        float l=input.nextFloat();
        System.out.print("Enter the width : ");
        float w=input.nextFloat();
        System.out.print("Enter the height : ");
        float h= input.nextFloat();
        double V=l*w*h/3;
        System.out.println("The Volume Of Pyramid : "+V);
    }
}
