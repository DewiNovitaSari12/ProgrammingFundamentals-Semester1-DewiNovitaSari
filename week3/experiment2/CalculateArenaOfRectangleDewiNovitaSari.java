package experiment2;
import java.util.Scanner;

public class CalculateArenaOfRectangleDewiNovitaSari {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int legth;
        int width;
        int area;

        System.out.print("Enter the lenght of the rectangle: ");
        legth = input.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        width = input.nextInt();
        area = legth * width;
        System.out.println("The area of the rectangle is: " + area);
        input.close();
    }
}
