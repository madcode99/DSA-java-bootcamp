import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        // To calculate Fibonacci Series up to n numbers.
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n =input.nextInt();
        Fabo(n);
    }
    public static void Fabo(int n) {
        int t1 = 0, t2 = 1, nt = 0;

        for(int i =2;i<=n;i++){
            nt =t1+t2;
            t1=t2;
            t2 =nt;
            System.out.print(nt+" , ");
        }
    }
}
