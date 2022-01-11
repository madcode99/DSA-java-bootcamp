public class Question2{
       public static void main(String[] args) {
           //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Principal amount :");
        float P=input.nextFloat();
        System.out.print(" Enter time  :");
        float T= input.nextFloat();
        System.out.print("Enter rate :");
        float  R =input.nextFloat();
        // interest formula (P * R * T)/100 =Interest
        float Interest= (P * R * T)/100;
        System.out.print("your Interest will be  :  "+Interest);



    }
}