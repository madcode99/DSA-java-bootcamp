import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        // Calculate Depreciation of Value
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a cost : ");
        int cost= input.nextInt();
        System.out.print("Enter a salvage and residual value : ");
        int Rv= input.nextInt();
        System.out.print("now Enter useful years : ");
        int year=input.nextInt();
        int Depreciation = cost-Rv/year;
        System.out.println("The Depreciation will be : "+Depreciation);

    }
}
