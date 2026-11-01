package week7.experiment3;
import java.util.Scanner;
public class CafeDoWhile08 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int coffeePrice=12000;
        int teaPrice=7000;
        int breadPrice=20000;
        String customerName;
        double totalPrice;

        do{
            System.out.print("Enter customer name(type `cancel` to exit): ");
            customerName = scanner.nextLine();
            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction cancelled.");
                break;
            }
            System.out.print("Enter coffee quantity: ");
            int coffeeQuantity = scanner.nextInt();
            System.out.print("Enter tea quantity: ");
            int teaQuantity = scanner.nextInt();    
            System.out.print("Enter bread quantity: ");
            int breadQuantity = scanner.nextInt();
            totalPrice = (coffeePrice * coffeeQuantity) + (teaPrice * teaQuantity) + (breadPrice * breadQuantity);
            System .out.println("total amount to pay:Rp " + totalPrice);
            scanner.nextLine();
        }while (true);
        System.out.println("Thank you for visiting our cafe! All transactions are completed.");
    }
}
