package week5.taskweek5;

import java.util.Scanner;

public class Tax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double income;
        double tax;

        // Input Income
        System.out.print("Write your income: ");
        income = input.nextDouble();

        // Tax Calculation
        if (income <= 0) {

            tax = 0;

        } else if (income > 0 && income <= 60000000) {

            tax = 0.05 * income;

        } else if (income > 60000000 && income <= 25000000) {

            tax = (0.05 * 60000000) + (0.15 * (income - 60000000));

        } else if (income > 25000000 && income <= 50000000) {

            tax = (0.05 * 60000000) + (0.15 * 25000000) + (0.25 * (income - 25000000 - 60000000));

        } else {

            tax = (0.05 * 60000000) + (0.15 * 25000000) + (0.25 * 50000000) + (0.30 * (income - 500000000));
        }

        // Output Display
        System.out.println();
        System.out.println("==========================================");
        System.out.println("             TAX CALCULATOR");
        System.out.println("==========================================");
        System.out.println();

        System.out.println("Write your income : " + income);
        System.out.println("This is your tax  : " + tax);

        System.out.println();
        System.out.println("==========================================");

        input.close();
    }
}