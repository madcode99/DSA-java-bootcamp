import java.util.Scanner;

public class Question45 {
    public static void main(String[] args) {
        // HCF Of Two Numbers Program
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n1= input.nextInt();
        System.out.print("Enter another value :");
        int n2= input.nextInt();
        int HCF=1;
        for(int i=n1;i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                HCF=i;
            }else{
                i=i+1;
            }
        }
        System.out.print("The HCF : "+HCF);
    }
}
