import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        //Total Surface Area Of Cube
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        float a= input.nextFloat();
        float ans =6*a*a;
        System.out.println("The Total Surface Area Of Cube is : "+ans);
    }
}
