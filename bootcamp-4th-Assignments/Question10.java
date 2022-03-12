import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        // Pythagorean Triplet in an array
        Scanner input =new Scanner(System.in);
        int[] arr = new int[3];
        arr[0]=input.nextInt();
        arr[1]= input.nextInt();
        arr[2]= input.nextInt();
        System.out.println(IsPythgoreanTriplet(arr));
    }
    public static boolean IsPythgoreanTriplet(int ...num){
        if(num[0] * num[0] + num[1] * num[1] == num[2] * num[2]){
            return true;
        }else {
            return false;
        }
    }
}
