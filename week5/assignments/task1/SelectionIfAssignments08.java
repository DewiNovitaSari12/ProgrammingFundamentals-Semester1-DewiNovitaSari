package week5.assignments.task1;

import java.util.Scanner;

public class SelectionIfAssignments08 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println( "---Print KRS SIOAKAD---" );
        System.out.println("Has the UKT been paid? (true/false)" );
        boolean uktPaid = sc.nextBoolean();
    
        String massage= (uktPaid) ? "UKT payment verified.Please print your KRS and ask your DPA to sign it" : "Registration rejected.Please pay your UKT first";
        
        System.out.println(massage);
    }
}
