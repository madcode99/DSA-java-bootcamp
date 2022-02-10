import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Take name as input and print a greeting message for that particular name.
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name =input.next();
        Greeting(name);
    }
    public static void Greeting(String name){
        System.out.println("Hello "+name+" how are you ?");
    }
}
