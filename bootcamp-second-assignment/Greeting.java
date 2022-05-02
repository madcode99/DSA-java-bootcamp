import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Take name as input and print a greeting message for that name.
        System.out.println("Enter your name :");
        String name=input.next();
        System.out.println(" Hello "+name+" how are you ?");

    }
}
