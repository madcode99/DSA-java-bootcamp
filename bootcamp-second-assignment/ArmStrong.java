import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //To find Armstrong Number between two given number.
        int a=input.nextInt();
        int b=input.nextInt();
        for(int i=a;i<=b;i++){
            int num=i;
            int sum=0;
            while(num>0){
                int rem=num%10;
                sum=sum+(rem*rem*rem);
                num=num/10;
            }
            if (sum == i){
                System.out.println(sum);
            }
        }
    }
}
