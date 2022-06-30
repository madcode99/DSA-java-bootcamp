import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        //Calculate Discount Of Product
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a listPrice : ");
        int listPrice=input.nextInt();
        System.out.print("Enter a selling price : ");
        int sellingPrice = input.nextInt();
        int Discount =listPrice-sellingPrice;
        System.out.println("the discount will be : "+Discount);
    }
}
