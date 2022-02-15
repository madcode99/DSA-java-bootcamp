import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // Take integer inputs till the user enters 0 and print the largest number from all.
        Largest();
    }
    public static void Largest(){
        int Largest = 0;
        Scanner input =new Scanner(System.in);
        while(true){
            System.out.print("Enter a number  : ");
            int n = input.nextInt();
            if(Largest < n){
                Largest = n;
            }
            if( n == 0){
                System.out.println("Largest : "+Largest);
                break;
            }
        }
    }
}
