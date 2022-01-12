public class Question6{
     public static void main(String[] args) {
         //Input currency in rupees and output in USD
        Scanner input=new Scanner(System.in);
        System.out.println("Enter rupee : ");
        float Rupees = input.nextFloat();
        float USD = (float)(0.014);
        for(int i=2;i<=Rupees;i++){
           USD += 0.014;
        }
        System.out.println("The USD will be :"+USD);
    }
}