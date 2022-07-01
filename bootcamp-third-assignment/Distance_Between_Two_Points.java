import java.util.Scanner;

public class Distance_Between_Two_Points {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Calculate Distance Between Two Points
        System.out.println("input value of point A (x,y) : ");
        int xa= input.nextInt();
        int ya= input.nextInt();
        System.out.println("input value of point B (x,y) : ");
        int xb= input.nextInt();
        int yb= input.nextInt();
        int a=(xa-xb)*(xa-xb);
        int b=(ya-yb)*(ya-yb);
        int total=a+b;
        java.lang.Math.sqrt(total);
        System.out.println("the distance between the given two points is : "+total);
    }
}
