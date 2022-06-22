import java.util.Scanner;

public class largestInput {
    public static void main(String[] args) {
        // Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner input=new Scanner(System.in);
        int max=0;
        while(true){
            System.out.print("Enter a number : ");
            int n=input.nextInt();
            if(n>max){
                max=n;
            }
            if(n==0){
                System.out.println("The largest number is : "+max);
                break;
            }
        }
    }
}
