import java.util.Scanner;

public class calculateElectricityBill {
    public static void main(String[] args) {
        // Calculate Electricity Bill
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the device’s wattage : ");
        float watt= input.nextFloat();
        System.out.print("Enter the number of hours the appliance is used per day : ");
        float hours= input.nextFloat();
        float result=watt*hours/1000;
        //  If your electricity rate is 12 cents per kWh
        result*=0.12;
        // your monthly electric bill
        float monthly_bill=result*30;
        System.out.print(" your monthly electric bill  : "+monthly_bill);
    }
}
