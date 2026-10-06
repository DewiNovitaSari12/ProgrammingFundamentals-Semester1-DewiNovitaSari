package week5.assignments.task3.case1;

import java.util.Scanner;

public class AssignmentParking08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hours;
        int parkingFee = 2000;
        int moreHours;

        System.out.println( "---  Malang Mall Parking Fee System ---" );
        System.out.println("Input parkir hours");
        hours = input.nextInt();

        //parking fee <2 hours
        moreHours = parkingFee+(hours-2)*1000;

        if (hours<2) {
            System.out.println("Thank you for comming stay safe and see you next time" );
            System.out.println("Parking fee Rp."+parkingFee );
        }

        else {
            System.out.println("Thank you for comming stay safe and see you next time");
            System.out.println("Parking fee Rp."+ moreHours);
        }
        input.close();

        

    }
    
}
