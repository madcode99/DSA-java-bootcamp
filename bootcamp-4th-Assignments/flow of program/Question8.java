import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        // To find out whether the given String is Palindrome or not.
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = input.next().trim();
        System.out.println(IsPalindrome(str));
    }
    public static boolean IsPalindrome(String p){
        String rev="";
        for(int i = p.length()-1;i>=0;i--){
            rev +=p.charAt(i);
        }
        System.out.println(rev);
        if(p.equals(rev)){
            return true;
        }else {
            return false;
        }
    }
}