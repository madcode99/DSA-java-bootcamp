import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Fibonacci Series In Java Programs
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        System.out.println(Fibonacci(num));
    }
    public static int Fibonacci(int  n){
        int t1=0,t2=1,nextT=0;
        for(int i=2 ; i <= n ; i++){
            nextT=t1+t2;
            t1=t2;
            t2=nextT;
        }
        return nextT;
    }
}
