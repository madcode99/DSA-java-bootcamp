import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        // Reverse A String In Java
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a String : ");
        String text = input.next();
        RevString(text);
    }
    public static void RevString(String str){
        String rev="";
        for(int i = str.length()-1;i>=0;i--){
            rev +=str.charAt(i);
        }
        System.out.println(rev);
    }
}
