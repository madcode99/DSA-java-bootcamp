import java.util.Scanner;

public class Question47 {
    public static void main(String[] args) {
        // Java Program Vowel Or Consonant
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a character to find weather it is vowel or consonant : ");
        char ch=input.next().trim().charAt(0);
        if (ch == 'A' || ch =='a'|| ch =='E'|| ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch =='o' || ch=='U'||ch=='u' ){
            System.out.println(ch+" is vowel .");
        }else{
            System.out.println(ch+" is consonant .");
        }

    }
}
