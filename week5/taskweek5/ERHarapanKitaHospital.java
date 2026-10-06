package week5.taskweek5;
import java.util.Scanner;

public class ERHarapanKitaHospital {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declare Variable

        double spo2;
        double systolicBloodPressure;
        double bodyTemperature;

        int sisaBedICU;
        int age;
        int respiratoryRate;

        boolean isFullyConscious;
        boolean hasComorbidities;

        String destinationRoom;


        //Input Patient Information

        System.out.println("Please Write Down Patient Information");
        System.out.print("Enter Patient SpO2 (%): ");
        spo2 = input.nextDouble();
        System.out.print("Enter Systolic Blood Pressure (mmHg): ");
        systolicBloodPressure = input.nextDouble();
        System.out.print("Enter Body Temperature (C): ");
        bodyTemperature = input.nextDouble();
        System.out.print("Enter Remaining ICU Beds: ");
        sisaBedICU = input.nextInt();
        System.out.print("Enter Patient Age: ");
        age = input.nextInt();
        System.out.print("Enter Respiratory Rate (breaths/min): ");
        respiratoryRate = input.nextInt();
        System.out.print("Is The Patient Fully Conscious? (true/false): ");
        isFullyConscious = input.nextBoolean();
        System.out.print("Does The Patient Have Comorbidities? (true/false): ");
        hasComorbidities = input.nextBoolean();

        //Emergency Room Allocation

        if (spo2 < 85 && sisaBedICU > 0) {
            destinationRoom = "ICU";
        } else if (spo2 < 85 && sisaBedICU == 0) {
            destinationRoom = "UGD_VENTILATOR_MOBIL";
        } else if ((spo2 >= 85 && spo2 <= 89) || systolicBloodPressure < 90 || systolicBloodPressure > 180 || isFullyConscious == false) {
            destinationRoom = "RESUSITASI_UGD";
        } else if (((spo2 >= 90 && spo2 <= 94) || bodyTemperature > 39) && hasComorbidities == true && age >= 65) {
            destinationRoom = "HCU_ISOLASI";
        } else if ((spo2 >= 90 && spo2 <= 94) || respiratoryRate > 24) {
            destinationRoom = "RAWAT_INAP_UMUM";
        } else {
            destinationRoom = "RAWAT_JALAN";
        }


        //Output Display

        System.out.println();

        System.out.println("==================================================");

        System.out.println("          HARAPAN KITA HOSPITAL");

        System.out.println("        Emergency Room Allocation");

        System.out.println("==================================================");

        System.out.println();

        System.out.println("PATIENT INFORMATION");

        System.out.println("  SpO2                         : " + spo2 + "%");

        System.out.println("  Systolic Blood Pressure     : "
                + systolicBloodPressure + " mmHg");

        System.out.println("  Body Temperature            : "
                + bodyTemperature + " C");

        System.out.println("  Remaining ICU Beds          : " + sisaBedICU);

        System.out.println("  Patient Age                : " + age);

        System.out.println("  Respiratory Rate            : "
                + respiratoryRate + " breaths/min");

        System.out.println("  Fully Conscious             : " + isFullyConscious);

        System.out.println("  Has Comorbidities           : " + hasComorbidities);

        System.out.println();

        System.out.println("EMERGENCY ROOM RESULT");

        System.out.println("  Destination Room            : " + destinationRoom);

        System.out.println();

        System.out.println("==================================================");

        input.close();

    }

}