import java.util.Scanner;

public class Volume_Of_Prism {
    public static void main(String[] args) {
        // Volume Of Prism
        Scanner input=new Scanner(System.in);
        System.out.print("Enter base : ");
        float base= input.nextFloat();
        System.out.print("Enter height : ");
        float height =input.nextFloat();
        float V=base*height;
        System.out.println("The Volume Of Prism is : "+V);
    }
}
