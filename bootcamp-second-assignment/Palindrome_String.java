import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //To find out whether the given String is Palindrome or not.
        System.out.print("Enter a string : ");
        String text = input.next();
        String Rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            Rev = Rev + text.charAt(i);
        }
        System.out.println(Rev);
        if (text.equals(Rev)) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("it is not a palindrome");
        }
    }
}