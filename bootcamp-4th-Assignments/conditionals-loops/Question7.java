import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        // Find if a number is palindrome or not
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num= input.nextInt();
        System.out.println(IsPalindrome(num));
    }
    public static boolean IsPalindrome(int n){
        int check = n;
        int rev = 0;
        while(n != 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        if(rev == check){
            return true;
        }else {
            return false;
        }
    }
}
