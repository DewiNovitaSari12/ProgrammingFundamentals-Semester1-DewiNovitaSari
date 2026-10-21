package Midterm;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class PassengerAuthorization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input passenger information
        System.out.print("Enter flight type (DOMESTIC/INTERNATIONAL): ");
        String flightType = input.nextLine().toUpperCase();

        System.out.print("Has check-in been completed? (yes/no): ");
        String checkIn = input.nextLine().toLowerCase();

        System.out.print("Enter identification status (VALID/MISSING/EXPIRED): ");
        String identification = input.nextLine().toUpperCase();

        System.out.print("Enter travel document status (VALID/MISSING/EXPIRED/NA): ");
        String document = input.nextLine().toUpperCase();

        System.out.print("Is a visa required? (yes/no): ");
        String visaRequired = input.nextLine().toLowerCase();

        System.out.print("Is the required visa valid? (yes/no/NA): ");
        String visaValid = input.nextLine().toLowerCase();

        System.out.print("Enter baggage status (NORMAL/EXCESS/PROHIBITED): ");
        String baggage = input.nextLine().toUpperCase();

        System.out.print("Has the extra baggage fee been paid? (yes/no/NA): ");
        String baggageFee = input.nextLine().toLowerCase();

        System.out.print("Enter security screening result (PASS/FAIL): ");
        String security = input.nextLine().toUpperCase();

        System.out.print("Enter current gate arrival time (HH:MM): ");
        String arrivalTime = input.nextLine();

        System.out.print("Enter boarding deadline (HH:MM): ");
        String deadline = input.nextLine();

        System.out.print("Does the passenger require special assistance? (yes/no): ");
        String assistance = input.nextLine().toLowerCase();

        System.out.print("Are special assistance arrangements confirmed? (yes/no/NA): ");
        String assistanceConfirmed = input.nextLine().toLowerCase();

        // Validate time inputs
        LocalTime arrival = null;
        LocalTime boardingDeadline = null;
        boolean validTime = true;

        try {
            arrival = LocalTime.parse(arrivalTime);
            boardingDeadline = LocalTime.parse(deadline);
        } catch (DateTimeParseException e) {
            validTime = false;
        }

        // Validate flight type and check-in status
        if (!flightType.equals("DOMESTIC")
                && !flightType.equals("INTERNATIONAL")) {

            System.out.println("Error: Invalid flight type.");

        } else if (!checkIn.equals("yes") && !checkIn.equals("no")) {

            System.out.println("Error: Invalid check-in status.");

        } else if (!checkIn.equals("yes")) {

            System.out.println("Boarding denied: Check-in has not been completed.");

        } else if (!validTime) {

            System.out.println("Error: Invalid time format. Use HH:MM.");

        } else if (!identification.equals("VALID")
                && !identification.equals("MISSING")
                && !identification.equals("EXPIRED")) {

            System.out.println("Error: Invalid identification status.");

        } else if (!document.equals("VALID")
                && !document.equals("MISSING")
                && !document.equals("EXPIRED")
                && !document.equals("NA")) {

            System.out.println("Error: Invalid travel document status.");

        } else if (!visaRequired.equals("yes")
                && !visaRequired.equals("no")) {

            System.out.println("Error: Invalid visa requirement.");

        } else if (!visaValid.equals("yes")
                && !visaValid.equals("no")
                && !visaValid.equals("NA")) {

            System.out.println("Error: Invalid visa status.");

        } else if (!baggage.equals("NORMAL")
                && !baggage.equals("EXCESS")
                && !baggage.equals("PROHIBITED")) {

            System.out.println("Error: Invalid baggage status.");

        } else if (!baggageFee.equals("yes")
                && !baggageFee.equals("no")
                && !baggageFee.equals("NA")) {

            System.out.println("Error: Invalid baggage fee status.");

        } else if (!security.equals("PASS")
                && !security.equals("FAIL")) {

            System.out.println("Error: Invalid security screening result.");

        } else if (!assistance.equals("yes")
                && !assistance.equals("no")) {

            System.out.println("Error: Invalid assistance requirement.");

        } else if (!assistanceConfirmed.equals("yes")
                && !assistanceConfirmed.equals("no")
                && !assistanceConfirmed.equals("NA")) {

            System.out.println("Error: Invalid assistance confirmation status.");

        } else {

            // Process passenger authorization
            switch (flightType) {

                case "DOMESTIC":
                    if (identification.equals("VALID")) {
                        if (security.equals("PASS")) {
                            if (baggage.equals("PROHIBITED")) {
                                System.out.println("Further inspection required: Baggage contains prohibited items.");
                            } else if (baggage.equals("EXCESS")
                                    && !baggageFee.equals("yes")) {
                                System.out.println("Boarding pending: Pay the additional baggage fee.");
                            } else if (arrival.isAfter(boardingDeadline)) {
                                System.out.println("Boarding denied: Passenger arrived after the boarding deadline.");
                            } else if (assistance.equals("yes")
                                    && !assistanceConfirmed.equals("yes")) {
                                System.out.println("Boarding pending: Special assistance arrangements must be confirmed.");
                            } else if (assistance.equals("no")
                                    || assistanceConfirmed.equals("yes")
                                    || assistanceConfirmed.equals("NA")) {
                                System.out.println("Passenger is authorized to board.");
                            } else {
                                System.out.println("Error: Invalid assistance information.");
                            }
                        } else {
                            System.out.println("Boarding denied: Security screening failed.");
                        }
                    } else {
                        System.out.println("Boarding denied: Valid identification is required.");
                    }
                    break;

                case "INTERNATIONAL":
                    if (document.equals("VALID")) {
                        if (visaRequired.equals("no")
                                || (visaRequired.equals("yes")
                                && visaValid.equals("yes"))) {

                            if (security.equals("PASS")) {
                                if (baggage.equals("PROHIBITED")) {
                                    System.out.println("Further inspection required: Baggage contains prohibited items.");
                                } else if (baggage.equals("EXCESS")
                                        && !baggageFee.equals("yes")) {
                                    System.out.println("Boarding pending: Pay the additional baggage fee.");
                                } else if (arrival.isAfter(boardingDeadline)) {
                                    System.out.println("Boarding denied: Passenger arrived after the boarding deadline.");
                                } else if (assistance.equals("yes")
                                        && !assistanceConfirmed.equals("yes")) {
                                    System.out.println("Boarding pending: Special assistance arrangements must be confirmed.");
                                } else if (assistance.equals("no")
                                        || assistanceConfirmed.equals("yes")
                                        || assistanceConfirmed.equals("NA")) {
                                    System.out.println("Passenger is authorized to board.");
                                } else {
                                    System.out.println("Error: Invalid assistance information.");
                                }
                            } else {
                                System.out.println("Boarding denied: Security screening failed.");
                            }

                        } else {
                            System.out.println("Boarding denied: A valid required visa is missing.");
                        }
                    } else {
                        System.out.println("Boarding denied: Valid travel documents are required.");
                    }
                    break;

                default:
                    System.out.println("Error: Unsupported flight type.");
                    break;
            }
        }

        input.close();
    }

}
