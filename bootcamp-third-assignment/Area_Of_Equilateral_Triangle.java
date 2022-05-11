import java.util.Scanner;

public class Area_Of_Equilateral_Triangle {
    public static void main(String[] args) {
        //Area Of Equilateral Triangle
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the value of a :");
        float a=input.nextFloat();
        float temp = a * a;
        double A= 1.73205080757/4*temp;// the square root of 3 is 1.73205080757
        System.out.println("the area of Equilateral Triangle is :"+A);

    }
}
