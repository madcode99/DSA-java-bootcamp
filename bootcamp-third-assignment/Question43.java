import java.util.Scanner;

public class Question43 {
    public static void main(String[] args) {
        // Find if a number is palindrome or not
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= input.nextInt();
        int num=n;
        int rev=0;
        while (n>0){
            int rem=n%10;
            n/=10;
            rev=rev*10+rem;
        }
        System.out.println(rev);
      if(num==rev){
          System.out.print(num+" is a palindrome number .");
      }else {
          System.out.print(num+" is not a palindrome number .");
      }

    }
}
