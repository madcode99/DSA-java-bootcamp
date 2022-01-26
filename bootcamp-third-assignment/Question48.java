import java.util.Scanner;

public class Question48 {
    public static void main(String[] args) {
        // Perfect Number In Java
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num= input.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            if(i%num==0){
                 sum=sum+i;
            }
        }
        if(num==sum){
            System.out.println(num+" is perfect number .");
        }else{
            System.out.println(num+" is not perfect number .");
        }
    }
}
