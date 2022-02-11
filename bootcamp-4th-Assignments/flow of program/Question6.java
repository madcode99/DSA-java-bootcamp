import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        // Input currency in rupees and output in USD.
        Scanner input =new Scanner(System.in);
        System.out.print("Enter rupees :");
        float rupees = input.nextFloat();
        System.out.print(Currency(rupees));
    }
    public static float Currency(float rupees){
        float USD = (float) 0.013;
        for(int i =2;i<=rupees;i++){
            USD +=USD;
        }
        return USD;
    }
}
