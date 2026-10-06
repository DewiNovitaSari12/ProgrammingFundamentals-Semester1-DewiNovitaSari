package week6.experiment2;

import java.util.Scanner;

public class LogicalOperatorWifi08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declare Variables
        boolean isStudent;
        boolean isLecturer;
        boolean isBlocked;

        System.out.print("Is the user a student? (true/false):");
        isStudent = sc.nextBoolean();
        System.out.print("Is the user a lecturer?(true/false)");
        isLecturer = sc.nextBoolean();
        System.out.print("Is the account currently bloked(true/false)");
        isBlocked=sc.nextBoolean();

        //if-else
        if ((isStudent||isLecturer)&& !isBlocked){
            System.out.println("Wifi access granted");
        } else {
            System.out.println("Wifi access denied");
        }

    }
}
