
import java.util.Scanner;

public class Question35 {
    public static void main(String[] args) {
        // Calculate CGPA Java Program
        Scanner input=new Scanner(System.in);
        int subject ;
        int total=0;
        int count=0;
        while(true){
            System.out.print("Enter a subject grade points : ");
            subject= input.nextInt();
            if (subject == 0){
                break;
            }
            count++;
            total+=subject;
        }
        System.out.print("the cgpa will be : "+total/count);
    }
}
