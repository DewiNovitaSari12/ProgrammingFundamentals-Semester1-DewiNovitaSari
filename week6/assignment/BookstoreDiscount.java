import java.util.Scanner;

public class BookstoreDiscount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String type;
        int quantity;
        double price;
        double discountRate = 0;
        double discountAmount;
        double totalAmount;

        //declare variables and get user input
        System.out.print("Enter book type (dictionary/novel/other): ");
        type = input.nextLine();
        System.out.print("Enter number of books: ");
        quantity = input.nextInt();
        System.out.print("Enter price per book: ");
        price = input.nextDouble();
        double subtotal = price * quantity;

        // Nested IF for discount
        if (type.equalsIgnoreCase("dictionary")) {
            discountRate = 0.10;
            if (quantity > 2) {
                discountRate = discountRate + 0.02;
            }
        } else if (type.equalsIgnoreCase("novel")) {
            discountRate = 0.07;
            if (quantity > 3) {
                discountRate = discountRate + 0.02;
            } else if (quantity <= 3) {
                discountRate = discountRate + 0.01;
            }
        } else {
            if (quantity > 3) {
                discountRate = 0.05;
            } else {
                discountRate = 0;
            }
        }

        //calculate discount amount and total amount

        discountAmount = subtotal * discountRate;
        totalAmount = subtotal - discountAmount;

        //output receipt
        System.out.println("================================");
        System.out.println("\n--- Bookstore Receipt ---");
        System.out.println("================================");
        System.out.println("Book Type       : " + type);
        System.out.println("Quantity        : " + quantity);
        System.out.println("Price per Book  : " + price);
        System.out.println("Subtotal        : " + subtotal);
        System.out.println("Discount Rate   : " + (discountRate * 100) + "%");
        System.out.println("Discount Amount : " + discountAmount);
        System.out.println("Total to Pay    : " + totalAmount);
        System.out.println("================================");

        input.close();
    }
}