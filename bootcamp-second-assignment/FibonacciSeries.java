import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //To calculate Fibonacci Series up to n numbers.
        System.out.print("Enter the value of n: ");
        int n=input.nextInt();
        int t1=0,t2=1,NextT=0;
        for(int i=1;i<=n;i++){
            if(n==0){
                System.out.print(t1+" , ");
                continue;
            }else if(n==1){
                System.out.print(t2+" , ");
                continue;
            }
            NextT=t1+t2;
            t1=t2;
            t2=NextT;
            System.out.print(NextT+" , ");
        }

    }
}
