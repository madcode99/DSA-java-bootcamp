import java.util.Scanner;

public class Question49 {
    public static void main(String[] args) {
        // Check Leap Year Or Not
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year=input.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.print(year +" is leap year .");
                }else {
                    System.out.print(year+" is not leap year .");
                }
            }
        }
    }
}
