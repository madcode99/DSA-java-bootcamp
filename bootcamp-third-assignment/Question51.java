
public class Question51 {
    public static void main(String[] args) {
        // Kunal is allowed to go out with his friends only on the even days of a given month.
        // Write a program to count the number of days he can go out in the month of August.
        int August=31;
        System.out.println("kunal is allowed to got out with his friends in the following days .");
        for(int i=1;i<=August;i++){
            if (i%2==0){
                System.out.print(i+" , ");
            }
        }
    }
}
