import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        //Perimeter Of Circle
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the radius : ");
        float r=input.nextFloat();
        double C=2*3.14*r;
        System.out.println("The Perimeter Of Circle is : "+C);
    }
}
