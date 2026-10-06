package learn;

import java.util.Scanner;

public class CarRentalSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare variables
        String name;
        int tenantId;
        int age;
        String licensePlate;
        int rentalDuration;

        double rentalPricePerDay;
        double distance;
        double fuelUsed;
        double carTemperature;
        double rating;

        int temperatureInteger;

        double rentalSubtotal;
        double discount;
        double administrationFee = 10000;
        double transportation;
        double transportationRate = 2000;
        double fuelCost;
        double fuelPrice = 13000;
        double finalPayment;

        int installment;
        int remainingAmount;
        int finalInstallment;

        boolean ageValid;
        boolean ageBelow60;
        boolean ratingValid;
        boolean ratingNotPerfect;
        boolean safeTemperature;
        boolean carAvailable = true;
        boolean validDistance;
        boolean ageAndRating;
        boolean ageOrRating;

        int systemYear = 2026;
        int transactionNumber = 10001;
        int rewardPoints;
        int updatedPoints;
        int verificationCode = 9985;

        // Input tenant information
        System.out.print("Enter tenant name: ");
        name = input.nextLine();

        System.out.print("Enter tenant ID: ");
        tenantId = input.nextInt();

        System.out.print("Enter age: ");
        age = input.nextInt();

        input.nextLine();

        System.out.print("Enter license plate: ");
        licensePlate = input.nextLine();

        System.out.print("Enter rental duration (days): ");
        rentalDuration = input.nextInt();

        System.out.print("Enter rental price per day (Rp): ");
        rentalPricePerDay = input.nextDouble();

        System.out.print("Enter distance (km): ");
        distance = input.nextDouble();

        System.out.print("Enter fuel used (liter): ");
        fuelUsed = input.nextDouble();

        System.out.print("Enter car temperature: ");
        carTemperature = input.nextDouble();

        System.out.print("Enter tenant rating: ");
        rating = input.nextDouble();

        // Convert car temperature to integer
        temperatureInteger = (int) carTemperature;

        // Calculate payment
        rentalSubtotal = rentalPricePerDay * rentalDuration;

        discount = rentalSubtotal * 0.05;

        transportation = distance * transportationRate;

        fuelCost = fuelUsed * fuelPrice;

        finalPayment = rentalSubtotal
                - discount
                + administrationFee
                + transportation
                + fuelCost;

        // Calculate installments
        installment = (int) finalPayment / 3;

        remainingAmount = (int) finalPayment % 3;

        finalInstallment = installment + remainingAmount;

        // Rental verification
        ageValid = age >= 17;
        ageBelow60 = age < 60;
        ratingValid = rating >= 3.00;
        ratingNotPerfect = rating != 5.00;
        safeTemperature = carTemperature <= 60;
        validDistance = distance > 0;

        ageAndRating = ageValid && ratingValid;
        ageOrRating = ageValid || ratingValid;

        // Reward points
        rewardPoints = rentalDuration * 10;
        updatedPoints = rewardPoints;

        // Display output
        System.out.println();
        System.out.println("==================================================");
        System.out.println("               CAR RENTAL SYSTEM");
        System.out.println("==================================================");

        System.out.println();
        System.out.println("TENANT INFORMATION");
        System.out.println("Name                : " + name);
        System.out.println("Tenant ID           : " + tenantId);
        System.out.println("Age                 : " + age);
        System.out.println("License Plate       : " + licensePlate);
        System.out.println("Rental Duration     : " + rentalDuration + " day(s)");
        System.out.println("Rental Price/Day    : Rp " + rentalPricePerDay);
        System.out.println("Distance            : " + distance + " km");
        System.out.println("Fuel Used           : " + fuelUsed + " liter");
        System.out.println("Car Temperature     : " + carTemperature);
        System.out.println("Temperature Integer : " + temperatureInteger);
        System.out.println("Tenant Rating       : " + rating);

        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println("PAYMENT INFORMATION");
        System.out.println("--------------------------------------------------");
        System.out.println("Rental Subtotal     : Rp " + rentalSubtotal);
        System.out.println("Discount            : Rp " + discount);
        System.out.println("Administration Fee  : Rp " + administrationFee);
        System.out.println("Transportation      : Rp " + transportation);
        System.out.println("Fuel Cost           : Rp " + fuelCost);
        System.out.println("Final Payment       : Rp " + finalPayment);
        System.out.println("Installment 1       : Rp " + installment);
        System.out.println("Installment 2       : Rp " + installment);
        System.out.println("Remaining Amount    : Rp " + remainingAmount);
        System.out.println("Final Installment   : Rp " + finalInstallment);

        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println("RENTAL VERIFICATION");
        System.out.println("--------------------------------------------------");
        System.out.println("Age >= 17           : " + ageValid);
        System.out.println("Age < 60            : " + ageBelow60);
        System.out.println("Rating >= 3.00      : " + ratingValid);
        System.out.println("Rating != 5.00      : " + ratingNotPerfect);
        System.out.println("Safe Temperature    : " + safeTemperature);
        System.out.println("Car Available       : " + carAvailable);
        System.out.println("Distance > 0        : " + validDistance);
        System.out.println("Age & Rating        : " + ageAndRating);
        System.out.println("Age OR Rating       : " + ageOrRating);

        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println("TRANSACTION");
        System.out.println("--------------------------------------------------");
        System.out.println("System Year         : " + systemYear);
        System.out.println("Transaction Number  : " + transactionNumber);
        System.out.println("Reward Points       : " + rewardPoints);
        System.out.println("Updated Points      : " + updatedPoints);
        System.out.println("Verification Code   : " + verificationCode);

        System.out.println();
        System.out.println("==================================================");
        System.out.println("Transaction " + transactionNumber
                + " for " + name
                + " lasted " + rentalDuration
                + " day(s) with a total payment of Rp "
                + finalPayment + ".");
        System.out.println();
        System.out.println("Transaction completed successfully.");
        System.out.println("Next Transaction    : " + (transactionNumber + 1));
        System.out.println("==================================================");

        input.close();
    }
}