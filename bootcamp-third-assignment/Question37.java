import java.util.Scanner;

public class Question37 {
    public static void main(String[] args) {
        // Calculate Average Marks
        Scanner input=new Scanner(System.in);
        int n;
        int sum=0;
        int count =0;
        while (true){
            System.out.print("Enter a number  : " );
            n= input.nextInt();
            sum+=n;
            count++;
            if(n==0){
                count--;
                System.out.println("the average of the following values will be "+sum/count);
                break;
            }
        }

    }
}
