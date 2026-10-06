    import java.util.Scanner;

public class Task2AssistantSelection08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String status;
        String sanction;
        String certificate;
        double programmingGrade;
        double interviewScore;
        String message;

        System.out.print("Enter student status (Active/Inactive): ");
        status = input.nextLine();
        System.out.print("Is the student under academic sanction? (Yes/No): ");
        sanction = input.nextLine();
        System.out.print("Enter Basic Programming grade: ");
        programmingGrade = input.nextDouble();
        input.nextLine();
        System.out.print("Does the student have a programming competency certificate? (Yes/No): ");
        certificate = input.nextLine();

        // First requirement
        if (status.equalsIgnoreCase("Active") && sanction.equalsIgnoreCase("No")) {
            // Second requirement
            if (programmingGrade >= 80 || certificate.equalsIgnoreCase("Yes")) {
                System.out.print("Enter interview score: ");
                interviewScore = input.nextDouble();
                // Third requirement
                if (interviewScore >= 75) {
                    message = "Accepted! The student is selected as a lab assistant.";
                } else {
                    message = "Failed! The interview score is below 75.";
                }
            } else {
                message = "Failed! The student must have a Basic Programming grade " + "of at least 80 or a programming competency certificate.";
            }

        } else {

            if (!status.equalsIgnoreCase("Active") && sanction.equalsIgnoreCase("Yes")) {
                message = "Failed! The student's status is inactive " + "and they are under academic sanction.";
            } else if (!status.equalsIgnoreCase("Active")) {
                message = "Failed! The student's status is not active.";
            } else {
                message = "Failed! The student is currently under academic sanction.";
            }
        }

        System.out.println("\n--- SELECTION RESULT ---");
        System.out.println(message);

        input.close();
    }
}

