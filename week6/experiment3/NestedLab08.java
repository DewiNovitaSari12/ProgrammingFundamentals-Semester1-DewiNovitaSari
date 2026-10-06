package week6.experiment3;

import java.util.Scanner;

public class NestedLab08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // declare variables
        boolean isActiveStudent;
        boolean isSanctioned;
        boolean hasLecturerPermit;
        boolean isLabAssistant;

        System.out.print("Is Student active?(true/false):");
        isActiveStudent = sc.nextBoolean();
        System.out.print("Is Sanctioned?(true/false):");
        isSanctioned = sc.nextBoolean();
        System.out.print("Has Lecturer Permit(true/false):");
        hasLecturerPermit = sc.nextBoolean();
        System.out.print("is lab assistant?(true/false):");
        isLabAssistant = sc.nextBoolean();

        if (isActiveStudent && !isSanctioned) {
            if (hasLecturerPermit || isLabAssistant) {
                System.out.println("Labotary access granted");
            } else {
                System.out.println("Access denied: lecturer permission or lab assistant status required");
            }
        } else {
            System.out.println("Access denied: student status does not meet the requirmnet");
        }

    }
}
