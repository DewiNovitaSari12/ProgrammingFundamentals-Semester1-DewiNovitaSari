package learn;
import java.util.Scanner;
public class Looping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sugar;
        System.out.println("How many sugars do you want in your coffee? (0-5)");
        sugar = input.nextInt();

        for(sugar=0; sugar<=5; sugar++){
           
            System.out.println("The sugar in your coffee is not enough, please add more sugar.");
        }
        input.close();
    }
}