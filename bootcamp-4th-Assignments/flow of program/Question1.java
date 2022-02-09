import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        //Input a year and find whether it is a leap year or not.
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a year : ");
        int n = input.nextInt();
        Leap(n);
    }
    public static void Leap(int n){
        if(n%4 == 0){
            System.out.println(n +" is leap year ");
            if(n%100 == 0){
                if(n%400 == 0){
                    System.out.println(n+" is leap year .");
                }
            }
        }else {
            System.out.println(n+" is not leap year .");
        }
    }
}
