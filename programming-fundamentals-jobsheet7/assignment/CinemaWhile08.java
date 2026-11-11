
import java.util.Scanner;
public class CinemaWhile08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customerCount, tickets, i=0;
        int ticketPrice = 50000;
        int price, discount,totalPay;
        int totalTickets=0,totalRevenue=0;

        System.out.println("==================================");
        System.out.println("Welcome to Cinema Ticketing System");
        System.out.println("==================================");

        System.out.print("Enter the number of customers: ");
        customerCount = sc.nextInt();

        while (i < customerCount) {
            System.out.print("Enter the number of tickets for customer " + (i + 1) + ": ");
            tickets = sc.nextInt();

            if (tickets<0) {
                System.out.println("Invalid input. Please enter a valid number of tickets.");
                continue;
            }

            price = tickets * ticketPrice;

            if (tickets >10) {
                discount = price * 15 / 100;
                System.out.println("Customer " + (i + 1) + " gets a 15% discount.");
            } else if (tickets > 4) {
                discount = price * 10 / 100;
                System.out.println("Customer " + (i + 1) + " gets a 10% discount.");
            } else {
                discount = 0;
                System.out.println("Customer " + (i + 1) + " does not get any discount.");
            }

            totalPay = price - discount;

            System.out.println("Price:Rp. " + price); 
            System.out.println("Discount: " + discount);
            System.out.println("Total Pay:Rp. " + totalPay);
            System.out.println();

            totalTickets += tickets;
            totalRevenue += totalPay;
            i++;
        }

        System.out.println("=================================");
        System.out.println("Total tickets sold today: " + totalTickets);
        System.out.println("Total ticket revenue today: Rp " + totalRevenue);
        
        sc.close();
    }
    
}

