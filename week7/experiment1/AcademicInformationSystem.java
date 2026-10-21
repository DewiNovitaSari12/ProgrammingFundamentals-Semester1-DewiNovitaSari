package week7.experiment1;
import java.util.Scanner;
public class AcademicInformationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declare varible
        double score, highest =0,lowest = 100;
        System.out.print("Enter your score: ");
        score = sc.nextDouble();
        //Check score
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter your score: "+i+": ");
            score = sc.nextDouble();
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        
    }   
}
