import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        // Take 2 numbers as inputs and find their HCF and LCM.
        Scanner input=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        HCF_LCM(a,b);
    }
    public static void HCF_LCM(int a ,int b){
        int temp ,temp1,temp2;
        temp1 = a;
        temp2 = b;
        while(temp2 !=0 ){
            temp=temp2;
            temp2=temp1%temp2;
            temp1 =temp;
        }
        int hcf =temp1;
        int lcm =a*b/hcf;
        System.out.println("hcf  = "+hcf);
        System.out.println("lcm  = "+lcm);
    }
}
