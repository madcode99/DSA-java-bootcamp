import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        // Keep taking numbers as inputs till the user enters 0 , after that print sum of all.
        SUMofNum();
    }
    public static void SUMofNum(){
        Scanner input =new Scanner(System.in);
        int sum =0;
        while(true){
            System.out.print("Enter a number : ");
            int num = input.nextInt();
             sum +=num;
            if(num == 0){
                System.out.println("the Sum  = "+sum);
                break;
            }
        }
    }
}
