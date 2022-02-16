import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        // Factorial Program In Java
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        Fact(num);
    }
    public static void Fact(int n){
        int fact = 1;
        for(int i = 1;i<= n;i++){
            fact*=i;
        }
        System.out.println("factorial of value "+n+" is "+fact);
    }
}
