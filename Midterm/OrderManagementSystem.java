package Midterm;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class OrderManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input customer request
        System.out.print("Enter request type (NEW_ORDER, CANCELLATION, REFUND): ");
        String requestType = input.nextLine().toUpperCase();

        System.out.print("Enter order status (NEW, PROCESSING, SHIPPED, DELIVERED, INVALID): ");
        String orderStatus = input.nextLine().toUpperCase();

        System.out.print("Has payment been confirmed? (yes/no): ");
        String payment = input.nextLine().toLowerCase();

        System.out.print("Enter product category (PHYSICAL, DIGITAL): ");
        String category = input.nextLine().toUpperCase();

        System.out.print("Enter product condition (UNOPENED, DEFECTIVE, DAMAGED, OPENED): ");
        String condition = input.nextLine().toUpperCase();

        System.out.print("Enter purchase date (YYYY-MM-DD): ");
        String purchaseDate = input.nextLine();

        System.out.print("Enter delivery date (YYYY-MM-DD, or NONE): ");
        String deliveryDate = input.nextLine();

        System.out.print("Is valid refund evidence provided? (yes/no): ");
        String evidence = input.nextLine().toLowerCase();

        System.out.print("Is the customer a Premium member? (yes/no): ");
        String premium = input.nextLine().toLowerCase();

        // Validate dates
        LocalDate purchase = null;
        LocalDate delivery = null;
        boolean validDates = true;

        try {
            purchase = LocalDate.parse(purchaseDate);

            if (!deliveryDate.equalsIgnoreCase("NONE")) {
                delivery = LocalDate.parse(deliveryDate);

                if (delivery.isBefore(purchase)
                        || delivery.isAfter(LocalDate.now())) {
                    validDates = false;
                }
            }
        } catch (Exception e) {
            validDates = false;
        }

        // Process one customer request
        if (!orderStatus.equals("NEW")
                && !orderStatus.equals("PROCESSING")
                && !orderStatus.equals("SHIPPED")
                && !orderStatus.equals("DELIVERED")) {

            System.out.println("Error: Invalid order status.");

        } else if (!validDates) {

            System.out.println("Error: Invalid date.");

        } else {

            switch (requestType) {

                case "NEW_ORDER":
                    if (orderStatus.equals("NEW")) {
                        if (payment.equals("yes")) {
                            System.out.println("Order approved and processed.");
                        } else if (payment.equals("no")) {
                            System.out.println("Order is pending payment.");
                        } else {
                            System.out.println("Error: Invalid payment status.");
                        }
                    } else {
                        System.out.println("Error: Invalid status for a new order.");
                    }
                    break;

                case "CANCELLATION":
                    if (payment.equals("yes") || payment.equals("no")) {
                        if (orderStatus.equals("NEW")
                                || orderStatus.equals("PROCESSING")) {
                            System.out.println("Order cancellation approved.");
                        } else {
                            System.out.println("Cancellation rejected: Order has been shipped or delivered.");
                        }
                    } else {
                        System.out.println("Error: Invalid payment status.");
                    }
                    break;

                case "REFUND":
                    if (payment.equals("yes")) {
                        if (orderStatus.equals("DELIVERED")) {

                            if (category.equals("PHYSICAL")
                                    || category.equals("DIGITAL")) {

                                if (condition.equals("DEFECTIVE")
                                        || condition.equals("DAMAGED")) {

                                    if (evidence.equals("yes")) {
                                        System.out.println("Refund approved: Product is defective or damaged.");
                                    } else if (evidence.equals("no")) {
                                        System.out.println("Further review required: Refund evidence is missing.");
                                    } else {
                                        System.out.println("Error: Invalid evidence status.");
                                    }

                                } else if (condition.equals("UNOPENED")
                                        || condition.equals("OPENED")) {

                                    if (category.equals("DIGITAL")) {
                                        System.out.println("Refund rejected: Digital products are excluded from change-of-mind refunds.");
                                    } else if (condition.equals("UNOPENED")) {

                                        if (premium.equals("yes")) {

                                            if (delivery != null) {
                                                long days = ChronoUnit.DAYS.between(
                                                        delivery, LocalDate.now());

                                                if (days >= 0 && days <= 7) {
                                                    System.out.println("Refund approved: Premium member meets the refund requirements.");
                                                } else {
                                                    System.out.println("Refund rejected: The 7-day refund period has expired.");
                                                }
                                            } else {
                                                System.out.println("Error: Delivery date is required.");
                                            }

                                        } else if (premium.equals("no")) {
                                            System.out.println("Refund rejected: Only Premium members qualify for change-of-mind refunds.");
                                        } else {
                                            System.out.println("Error: Invalid membership status.");
                                        }

                                    } else {
                                        System.out.println("Refund rejected: Product has been opened.");
                                    }

                                } else {
                                    System.out.println("Error: Invalid product condition.");
                                }

                            } else {
                                System.out.println("Error: Invalid product category.");
                            }

                        } else {
                            System.out.println("Refund rejected: Order has not been delivered.");
                        }

                    } else if (payment.equals("no")) {
                        System.out.println("Refund rejected: Order has not been paid for.");
                    } else {
                        System.out.println("Error: Invalid payment status.");
                    }
                    break;

                default:
                    System.out.println("Error: Invalid request type.");
                    break;
            }
        }

        input.close();
    }
}
