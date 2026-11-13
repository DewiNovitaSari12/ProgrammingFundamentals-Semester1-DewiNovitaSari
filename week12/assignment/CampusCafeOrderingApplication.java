package week12.assignment;
import java.util.Scanner;
public class CampusCafeOrderingApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Fried Rice", "Fried Noodles", "Toast", "French Fries",
                         "Pulled Tea", "Cappuccino", "Chocolate Ice"};
        int[] prices = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("==============================================");
        System.out.println("        CAMPUS CAFE ORDERING APPLICATION");
        System.out.println("==============================================");
        System.out.printf("%-4s %-18s %12s%n", "No", "Menu", "Price");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-4d %-18s Rp %,9d%n", (i + 1), menu[i], prices[i]);
        }
        System.out.println("==============================================");

        String again;
        do {
            System.out.println("\n---------------- MENU SEARCH -----------------");
            System.out.print("Enter menu name to search : ");
            String keyword = input.nextLine();

            int foundIndex = -1;
            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equalsIgnoreCase(keyword)) {
                    foundIndex = i;
                    break;
                }
            }

            if (foundIndex != -1) {
                System.out.printf(">> %s is available. Price: Rp %,d%n",
                                  menu[foundIndex], prices[foundIndex]);
            } else {
                System.out.println(">> Sorry, \"" + keyword + "\" is not available on the menu.");
            }

            System.out.print("Search again? (y/n) : ");
            again = input.nextLine();
        } while (again.equalsIgnoreCase("y"));

        System.out.println("\n=================== ORDER ====================");
        int totalItems;
        do {
            System.out.print("How many items do you want to order? : ");
            totalItems = input.nextInt();
            input.nextLine(); 
            if (totalItems <= 0) {
                System.out.println(">> Number of items must be more than 0.");
            }
        } while (totalItems <= 0);

        String[] orders = new String[totalItems];   
        int[] orderPrices = new int[totalItems];
        int total = 0;

        for (int i = 0; i < totalItems; i++) {
            int index;
            do {
                System.out.print("Item " + (i + 1) + " : ");
                String name = input.nextLine();

                index = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(name)) {
                        index = j;
                        break;
                    }
                }

                if (index == -1) {
                    System.out.println(">> Menu not found. Please enter a name from the menu list.");
                }
            } while (index == -1);

            orders[i] = menu[index];
            orderPrices[i] = prices[index];
            total = total + prices[index];
        }

        System.out.println("\n==============================================");
        System.out.println("                ORDER RECEIPT");
        System.out.println("==============================================");
        System.out.printf("%-4s %-18s %12s%n", "No", "Item", "Price");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < orders.length; i++) {
            System.out.printf("%-4d %-18s Rp %,9d%n", (i + 1), orders[i], orderPrices[i]);
        }
        System.out.println("----------------------------------------------");
        System.out.printf("%-23s Rp %,9d%n", "TOTAL", total);
        System.out.println("==============================================");
        System.out.println("      Thank you for ordering! Enjoy :)");
        System.out.println("==============================================");

        input.close();
    }
}