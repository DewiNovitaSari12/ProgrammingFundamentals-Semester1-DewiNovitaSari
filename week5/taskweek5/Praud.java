package week5.taskweek5;

import java.util.Scanner;

public class Praud {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare Variable
        String accountStatus;
        double balance;
        double amount;
        boolean isBedaNegara;
        int transactionHour;
        int transactionMinute;
        String transactionStatus;

        // Input Data
        System.out.print("Enter Account Status (NORMAL / SUSPICIOUS / BLACK-LISTED): ");
        accountStatus = input.nextLine();

        System.out.print("Enter Available Balance: ");
        balance = input.nextDouble();

        System.out.print("Enter Transaction Amount: ");
        amount = input.nextDouble();

        System.out.print("Transaction From Abroad? (true/false): ");
        isBedaNegara = input.nextBoolean();

        System.out.print("Enter Transaction Hour (0-23): ");
        transactionHour = input.nextInt();

        System.out.print("Enter Transaction Minute (0-59): ");
        transactionMinute = input.nextInt();

        // Transaction Security Evaluation
        if (accountStatus.equalsIgnoreCase("BLACK-LISTED")) {
            transactionStatus = "REJECTED_BLACKLIST";
        } else if (amount > balance) {
            transactionStatus = "REJECTED_SALDO";
        } else if (amount > 10000) {
            transactionStatus = "REJECTED_LIMIT";
        } else if (isBedaNegara && amount > 2000) {
            transactionStatus = "FLAGGED_FRAUD";
        } else if (((transactionHour >= 0 && transactionHour < 4) || (transactionHour == 4 && transactionMinute == 0)) && amount > 1000) {
            transactionStatus = "REQUIRE_OTP_NIGHT";
        } else if (accountStatus.equalsIgnoreCase("SUSPICIOUS") && amount > 500) {
            transactionStatus = "REQUIRE_OTP_SUSPICIOUS";
        } else {
            transactionStatus = "APPROVED";
        }

        // Display Output
        System.out.println();
        System.out.println("==================================================");
        System.out.println("              NUSANTARA PAY");
        System.out.println("        Transaction Security System");
        System.out.println("==================================================");
        System.out.println();

        System.out.println("TRANSACTION INFORMATION");
        System.out.println("  Account Status              : " + accountStatus);
        System.out.println("  Available Balance           : " + balance);
        System.out.println("  Transaction Amount          : " + amount);
        System.out.println("  Transaction From Abroad     : " + isBedaNegara);
        System.out.println("  Transaction Time            : "
                + transactionHour + ":" + transactionMinute);
        System.out.println();

        System.out.println("TRANSACTION SECURITY RESULT");
        System.out.println("  Final Transaction Status    : " + transactionStatus);
        System.out.println();

        System.out.println("==================================================");

        input.close();
    }
}