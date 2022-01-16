import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        // Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        Scanner input=new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.print("Enter a number : ");
            int n=input.nextInt();
            sum+=n;
            if(n==0){
                System.out.println("the sum of these values "+sum);
                break;
            }
        }

    }
}
