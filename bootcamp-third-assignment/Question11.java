import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        //Perimeter Of Rectangle
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the length : ");
        float l=input.nextFloat();
        System.out.print("Enter the width : ");
        float w= input.nextFloat();
        float P=2*(l+w);
        System.out.println("The Perimeter Of Rectangle is : "+P);

    }
}
