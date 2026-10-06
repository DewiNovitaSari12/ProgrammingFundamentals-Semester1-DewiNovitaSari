package week5.taskweek5;

import java.util.Scanner;

public class ProgressiveIncomeTax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declare Variable

        double taxableIncome;
        double tax;

        double firstTax;
        double secondTax;
        double thirdTax;


        //Input Taxable Income

        System.out.println("Please Write Down Your Tax Information");

        System.out.print("Enter Your Taxable Income (PKP): Rp ");
        taxableIncome = input.nextDouble();


        //Calculate Progressive Income Tax

        if (taxableIncome <= 0) {

            tax = 0;

        } else if (taxableIncome <= 60000000) {

            tax = taxableIncome * 0.05;

        } else if (taxableIncome <= 250000000) {

            firstTax = 60000000 * 0.05;

            tax = firstTax + (taxableIncome - 60000000) * 0.15;

        } else if (taxableIncome <= 500000000) {

            firstTax = 60000000 * 0.05;

            secondTax = (250000000 - 60000000) * 0.15;

            tax = firstTax + secondTax + (taxableIncome - 250000000) * 0.25;

        } else {

            firstTax = 60000000 * 0.05;

            secondTax = (250000000 - 60000000) * 0.15;

            thirdTax = (500000000 - 250000000) * 0.25;

            tax = firstTax + secondTax + thirdTax + (taxableIncome - 500000000) * 0.30;

        }


        //Display Output

        System.out.println();

        System.out.println("==================================================");
        System.out.println("        PROGRESSIVE INCOME TAX CALCULATOR");
        System.out.println("                  PPh 21");
        System.out.println("==================================================");

        System.out.println();

        System.out.println("TAX INFORMATION");

        System.out.println("  Taxable Income (PKP)        : Rp " + taxableIncome);

        System.out.println();

        System.out.println("TAX CALCULATION");

        System.out.println("  Total Income Tax            : Rp " + tax);

        System.out.println();

        System.out.println("==================================================");

        input.close();

    }  
}
