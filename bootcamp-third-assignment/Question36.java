import java.util.Scanner;

public class Question36 {
    public static void main(String[] args) {
        // Compound Interest Java Program
        Scanner input =new Scanner(System.in);
        System.out.print("Enter principal amount : ");
        int P= input.nextInt();
        System.out.print("Enter annual interest rate : ");
        float R= input.nextFloat();
        System.out.print("Enter time : ");
        int time= input.nextInt();
        System.out.print("Enter number of times that interest is compounded per unit : ");
        int n=input.nextInt();
        float Result = (float) (P*Math.pow(1+R/n,n*time));
        float C=  Result-P;
        System.out.println(" the Compound  interest will be : "+C);


    }


}
