import java.util.Scanner;

public class Question39 {
    public static void main(String[] args) {
        // Sum Of N Numbers
        Scanner input=new Scanner(System.in);
        int n;
        int sum=0;
        while(1==1){
            System.out.print("Enter a value  : ");
             n= input.nextInt();
             sum+=n;
            if(n==0){
                System.out.print("the sum of values will be "+sum);
                break;
            }
        }
    }
}
