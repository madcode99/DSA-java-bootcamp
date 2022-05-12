import java.util.Scanner;

public class Perimeter_Of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of a :");
        float a =input.nextFloat();
        float P=3*a;
        System.out.println("The Perimeter Of Equilateral Triangle is : "+P);
    }
}
