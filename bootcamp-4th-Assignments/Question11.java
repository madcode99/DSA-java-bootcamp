import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        // Write a function that returns all prime numbers between two given numbers.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first value : ");
        int n1 = input.nextInt();
        System.out.print("Enter the second value : ");
        int n2 = input.nextInt();
        Prime(n1 , n2);
    }
    public static void Prime(int a ,int b){
        int count ;
        for(int i=a ; i<=b ; i++){
            if(i==1 || i==0){
                continue;
            }
            count = 1;
            for(int j=2 ; j<=i/2 ; j++){
                if(i%j == 0){
                    count = 0;
                    break;
                }
            }
            if(count == 1){
                System.out.println(i);
            }
        }
    }
}