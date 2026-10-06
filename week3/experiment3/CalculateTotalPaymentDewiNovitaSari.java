package experiment3;

import java.util.Scanner;

public class CalculateTotalPaymentDewiNovitaSari {
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        double price;
        double discount;
        double DiscountCode = 0.15;
        double totalPayment;

        System.out.print("Enter the price of the clothes (Rp):");
        price = input.nextDouble();

        discount = price * DiscountCode;
        totalPayment = price - discount;
       
        //Display the result
        System.out.println("Original Price: Rp"+ price);
        System.out.println("Discount 15%: Rp"+ discount);
        System.out.println("Total Payment: Rp"+ totalPayment);

        input.close();
    }
    
}
