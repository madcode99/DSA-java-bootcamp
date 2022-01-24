import java.util.Scanner;

public class Question41 {
    public static void main(String[] args) {
        // Find Ncr & Npr
        Scanner input=new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n= input.nextInt();
        System.out.print("Enter value of r : ");
        int r= input.nextInt();
        int result=ncr(n)/(ncr(n-r)*ncr(r));
        System.out.println(" NCR : "+result);
        int result2=npr(n)/npr(n-r);
        System.out.println("NPR : "+result2);

    }
    private static int ncr(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    private  static int npr(int n){
        int f=1;
        for(int i=n;i>=1;i--){
            f*=i;
        }
        return f;
    }
}
