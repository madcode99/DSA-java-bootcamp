import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // Take a number as input and print the multiplication table for it.
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int n = input.nextInt();
        Table(n);
    }
    public static void Table(int n){
        for(int i=1 ; i<=10 ; i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
