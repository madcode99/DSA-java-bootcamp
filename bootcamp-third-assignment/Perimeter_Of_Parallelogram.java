import java.util.Scanner;

public class Perimeter_Of_Parallelogram {
    public static void main(String[] args) {
        //Perimeter Of Parallelogram
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of base : ");
        float base=input.nextFloat();
        System.out.print("Enter the value of side a : ");
        float a= input.nextFloat();
        float p=2*(a+base);
        System.out.println("The Perimeter Of Parallelogram is :"+p);
    }
}
