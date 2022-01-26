import java.util.Scanner;

public class Question50 {
    public static void main(String[] args) {
        // Sum Of A Digits Of Number
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num= input.nextInt();
        int Sum=0;
        while(num!=0){
            Sum+=num%10;
            num/=10;
        }
        System.out.println("Sum : "+Sum);
    }
}
