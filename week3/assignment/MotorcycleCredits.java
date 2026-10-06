package assignment;

import java.util.Scanner;

public class MotorcycleCredits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int motorcyclePrice;
        int downPayment;
        int monthlyInstallment;
        int months;
        double rate = 0.01;
        int totalmonthlyPayment;
       
        System.out.print("\n--- Total Monthly Payment Calculation ---\n");
        System.out.print("Enter the down payment (Rp): ");
        downPayment = input.nextInt();
        System.out.print("Enter the installment period (months): ");
        months = input.nextInt();
        System.out.print("Enter the motorcycle price (Rp): ");
        motorcyclePrice = input.nextInt();
        motorcyclePrice = motorcyclePrice - downPayment;
        monthlyInstallment = motorcyclePrice / months;
        rate = (double)motorcyclePrice * rate;
        totalmonthlyPayment = (monthlyInstallment + (int)rate );
       
        System.out.println("Total Mounthly Payment: Rp " + totalmonthlyPayment);
        input.close();
    }
}
