import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        //Area Of Parallelogram
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the base :");
        float base=input.nextFloat();
        System.out.print("Enter the height :");
        float height= input.nextFloat();
        float A=base*height;
        System.out.println("The area of Parallelogram :"+A);

    }
}
