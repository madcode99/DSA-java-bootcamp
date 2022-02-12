import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        // To find Armstrong Number between two given number.
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1= input.nextInt();
        System.out.print("Enter another number : ");
        int num2= input.nextInt();
        ArmStrong(num1,num2);
    }
    public static void ArmStrong (int a,int b){
        for(int i =a;i<=b;i++){
            int check , sum =0, rem;
            check =i;
            while (check != 0){
                 rem =check%=10;
                sum += (rem*rem*rem);
                check/=10;
            }
            if(sum == i ){
                System.out.println(i+" is an Arm Strong number .");
            }
        }
    }
}