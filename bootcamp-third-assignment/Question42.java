import java.util.Scanner;

public class Question42 {
    public static void main(String[] args) {
        // Reverse A String In Java
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a String to reverse : ");
        String txt= input.next();
        String rev="";
        for(int i=txt.length()-1;i>=0;i--){
            rev=rev+txt.charAt(i);
        }
        System.out.println("Reverse : "+rev);

    }
}
