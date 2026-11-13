package week12.assignment;
import java.util.Scanner;

public class ManagingStudentScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int student = 5;
        double sum = 0;
        double highest = 0;
        double lowest = 100;

        double scores[] = new double[student];

        System.out.println("==========================================");
        System.out.println("        MANAGING STUDENT SCORE");
        System.out.println("==========================================");

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score of student " + (i + 1) + " : ");
            scores[i] = input.nextDouble();
            sum = sum + scores[i];

            if (scores[i] > highest)
                highest = scores[i];
            if (scores[i] < lowest)
                lowest = scores[i];
        }

        System.out.println("\n==========================================");
        System.out.println("              SCORE RESULT");
        System.out.println("==========================================");
        System.out.printf("%-10s | %-8s | %-6s%n", "Student", "Score", "Status");
        System.out.println("------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            String status;
            if (scores[i] < 70)
                status = "Fail";
            else
                status = "Pass";
            System.out.printf("%-10s | %-8.2f | %-6s%n", "Student " + (i + 1), scores[i], status);
        }

        double avg = sum / scores.length;

        System.out.println("==========================================");
        System.out.println("               SUMMARY");
        System.out.println("==========================================");
        System.out.printf("Average : %.2f%n", avg);
        System.out.printf("Highest : %.2f%n", highest);
        System.out.printf("Lowest  : %.2f%n", lowest);
        System.out.println("==========================================");

        input.close();
    }
}