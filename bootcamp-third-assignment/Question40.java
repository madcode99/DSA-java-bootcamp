import java.util.Scanner;

public  class Question40 {
    public static void main(String[] args) {
        // Arm Strong number in java
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number= input.nextInt();
        int  originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}