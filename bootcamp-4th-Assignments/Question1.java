import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int a= input.nextInt();
        System.out.print("Enter a number : ");
        int b= input.nextInt();
        System.out.print("Enter a number : ");
        int c= input.nextInt();
        max(a,b,c);
        min(a,b,c);
    }
    public static void max(int a , int b, int c){
        int ans=0;
        if( ans<a ) ans = a;
        if( ans<b ) ans=b;
        if( ans<c ) ans=c;
        System.out.println("Max : "+ans);
    }
    public static void min(int a ,int b ,int c){
        int ans=a;
        if( ans>b ) ans = b;
        if( ans>c ) ans = c;
        System.out.println("Min : "+ans );
    }
}
