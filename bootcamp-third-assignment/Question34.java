import java.util.Scanner;

public class Question34 {
    public static void main(String[] args) {
        // Calculate Batting Average
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Total number of hits : ");
        int hits=input.nextInt();
        System.out.print("Enter Total number of at bats : ");
        int bats=input.nextInt();
        float battingAverage=hits/bats;
        System.out.println(" the batting average will be : "+battingAverage);
    }
}
