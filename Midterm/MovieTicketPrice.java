package Midterm;
import java.util.Scanner;
public class MovieTicketPrice {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // declaire variables
    int age;
    String dayType;
    double basePrice;
    double discount;
    double discountAmount;
    double totalAmount;

    // input variables
    System.out.print("Enter your age: ");
    age = input.nextInt();
    System.out.print("Enter day type (WEEKDAY/WEEKEND): ");
    dayType = input.next();
    System.out.print("Enter base price: ");
    basePrice = input.nextDouble();
    

    //Calculate discount based on age and day type
    if (dayType.equalsIgnoreCase("WEEKDAY")){
        if(age <=12){
            discount = 0.5;
        } else if (age >= 13 && age <= 59){
            discount = 0.0;
        } else {
            discount = 0.3;
        }
    }
    else if (dayType.equalsIgnoreCase("WEEKEND")){
        if(age <=12){
            discount = 0.3;
        } else if (age >= 13 && age <= 59){
            discount = 0.0;
        } else if (age >= 18 && age <= 25){
            discount = 0.5;
        }
        else {
            discount = 0.1;
        }
    } else {
        System.out.println("Invalid input! Please check your entries");
        return;
    }

    //Calculate final price
    //calculate discount amount and total amount

        discountAmount = basePrice * discount;
        totalAmount = basePrice - discountAmount;

        //output receipt
        System.out.println("================================");
        System.out.println("\n--- Movie Ticket Receipt ---");
        System.out.println("================================");
        System.out.println("Day Type          : " + dayType);
        System.out.println("age               : " + age);
        System.out.println("Price per Ticket  : " + basePrice);
        System.out.println("Discount Rate     : " + (discount * 100) + "%");
        System.out.println("Discount Amount   : " + discountAmount);
        System.out.println("Total to Pay      : " + totalAmount);
        System.out.println("================================");

        input.close();
}
}