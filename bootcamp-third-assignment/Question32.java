import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {
        //Power In Java
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a base : ");
        int base =input.nextInt();
        System.out.print("Enter power : ");
        int power = input.nextInt();
        int result=1;
        for(power =power;power!=0;power--){
            result*=base;
        }
        System.out.println("result : "+result);
    }
}
