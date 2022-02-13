import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Subtract the Product and Sum of Digits of an Integer
        Scanner in =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        ProSum(n);
    }
    public static void  ProSum(int n){
        int pro = 1;
        int sum = 0;
        while (n > 0){
            int rem = n%10;
            pro *= rem;
            sum += rem;
            n/=10;
        }
        int result = pro - sum;
        System.out.println(result);
    }
}
