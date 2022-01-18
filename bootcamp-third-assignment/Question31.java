import java.util.Scanner;

public class Question31 {
    public static void main(String[] args) {
        // Calculate Commission Percentage
        Scanner input=new Scanner(System.in);
        System.out.print("Enter commission :");
        int commissionRate=input.nextInt();
        System.out.print("Enter sale price : ");
        int salePrice=input.nextInt();
        System.out.println(" the commission will be "+commissionRate*salePrice);
    }
}
