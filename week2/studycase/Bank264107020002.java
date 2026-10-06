package studycase;

import java.util.Scanner;

public class Bank264107020002 {

    public static void main(String[] args) {

        // Declare variables

        int init_sav_amount, sav_period;
        double final_sav_amount, interest, interest_percent = 0.02;

        // Input values for initial savings amount and savings period

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial savings amount: "); init_sav_amount = sc.nextInt();
        System.out.print("Enter the savings period (years): "); sav_period = sc.nextInt();
        sc.close();

        // Calculate the interest

        interest = sav_period * interest_percent * init_sav_amount;

        // Calculate the final savings amount

        final_sav_amount = interest + init_sav_amount;

        // show the output

        System.out.println("The interest is: Rp " + interest);
        System.out.println("The final savings amount is : Rp " + final_sav_amount);

    }
}