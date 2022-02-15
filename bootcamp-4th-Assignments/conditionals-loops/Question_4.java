import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        //Addition Of Two Numbers
        Scanner in =new Scanner(System.in);
        System.out.print("Enter two numbers  : ");
        int n1=in.nextInt();
        int n2=in.nextInt();
        System.out.println(Add(n1,n2));

    }
    public static int Add(int n1,int n2){
        return n1+n2;
    }
}
