import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        // Write a function that returns the sum of first n natural numbers.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        System.out.println(SumOfNum(n));
    }
    public static int SumOfNum(int n){
        int sum = 0;
        for(int i=1 ; i<=n ; i++){
            sum += i;
        }
        return sum;
    }
}
