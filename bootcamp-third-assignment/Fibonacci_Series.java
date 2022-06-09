import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        //Fibonacci Series In Java Programs
        Scanner input=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= input.nextInt();
        int a=0;
        int b=1;
        int count =2;
        while (count<=n){
            int temp=b;
            b=a+b;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}
