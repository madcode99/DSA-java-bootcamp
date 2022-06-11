import java.util.Scanner;

public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public static void main(String[] args) {
        //Subtract the Product and Sum of Digits of an Integer
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n=input.nextInt();
        int pro=1;
        int sum=0;
        while(n>0){
            int rem=n%10;
            pro=pro*rem;
            sum=sum+rem;
            n/=10;
        }
        int result=pro-sum;
        System.out.println(" the answer is : "+result);

    }
}
