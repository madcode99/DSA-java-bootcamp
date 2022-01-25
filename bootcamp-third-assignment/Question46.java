import java.util.Scanner;

public class Question46 {
    public static void main(String[] args) {
        //  LCM Of Two Numbers
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n1= input.nextInt();
        System.out.print("Enter another value : ");
        int n2= input.nextInt();
        int max=n1>n2?n1:n2;
        while(1==1){
            if(max%n1==0 && max%n2==0){
                System.out.println(" LCM : "+max);
                break;
            }
            max++;
        }
    }
}
