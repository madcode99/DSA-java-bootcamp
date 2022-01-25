import java.util.Scanner;

public class Question44 {
    public static void main(String[] args) {
        // Future Investment Value
        Scanner input =new Scanner(System.in);
        System.out.print("Enter present value : ");
        int pv=input.nextInt();
        System.out.print("Enter interest rate : ");
        float r= input.nextFloat();
        System.out.print("Enter time : ");
        int t= input.nextInt();
       float pow= (float) Math.pow(1+r,t);
       float fv=pv*pow;
        System.out.print("The Future Investment Value will be : "+fv);
    }
}
