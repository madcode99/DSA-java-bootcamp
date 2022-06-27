import java.util.Scanner;

public class Average_Of_N_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Calculate Average Of N Numbers
        int n=0;
        int sum=0;
        int count =0;
        float Average=0;
        while(true){
            System.out.print("Enter a number : ");
            n=input.nextInt();
            sum+=n;
            count++;
            if(n==0){
                count--;
                break;
            }
        }
        Average=sum/count;
        System.out.print("The average of given values is : "+Average);
    }
}
