package assignment;

import java.util.Scanner;

public class TotalFuelCostToTrip {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Declare variables
        double distance;
        double fuelNeeded;
        double fuelPrice = 10000;
        double totalCost;
        // Input values
        System.out.print("Enter the distance from Malang to Surabaya (km): ");
        distance = input.nextDouble();
        fuelNeeded = distance / 2;
        totalCost = fuelNeeded * fuelPrice;

        // Display the result
        System.out.println("\n--- Fuel Cost Calculation ---");
        System.out.println("Distance              : " + distance + " km");
        System.out.println("Fuel needed           : " + fuelNeeded + " liters");
        System.out.println("Fuel price per liter  : Rp " + fuelPrice);
        System.out.println("Total fuel cost       : Rp " + totalCost);

        input.close();
    }
}

