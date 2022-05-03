import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num1 = input.nextInt();
        System.out.print("Enter any of the following (+, -, *, /) operators :");
        char op = input.next().charAt(0);
        System.out.print("Enter another number :");
        int num2 =input.nextInt();
        if (op == '+'){
            System.out.println(num1 +" + "+num2+" = "+num1+num2);
        }else if(op == '-'){
            System.out.println(num1 +" - "+num2+" = " +(num1 - num2));
        }else if(op == '*'){
            System.out.println(num1 +" * "+num2+" = "+num1*num2);
        }else if(op == '/'){
            System.out.println(num1 +" / "+num2+" = "+num1/num2);
        }else{
            System.out.println(" invalid operator ");
        }
    }
}
