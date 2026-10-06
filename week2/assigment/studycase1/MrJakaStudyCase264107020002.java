package assigment.studycase1;
import java.util.Scanner;

public class MrJakaStudyCase264107020002 {
    public static void main(String[] args) {

        // Declare variables
        double land_width, land_length;
        double diameter, side;
        double land_area, circle_area, square_area, grass_area;
        double pi = 3.14;

        // Input values
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the width of the land: ");
        land_width = sc.nextDouble();

        System.out.print("Enter the length of the land: ");
        land_length = sc.nextDouble();

        System.out.print("Enter the diameter of the circular pond: ");
        diameter = sc.nextDouble();

        System.out.print("Enter the side length of the square pond: ");
        side = sc.nextDouble();

        sc.close();

        // Calculate the total land area
        land_area = land_width * land_length;

        // Calculate the area of the circular pond
        circle_area = pi * (diameter / 2) * (diameter / 2);

        // Calculate the area of the square pond
        square_area = side * side;

        // Calculate the remaining area for grass
        grass_area = land_area - circle_area - square_area;

        // Show the output
        System.out.println("The total area of land is: " + land_area + " m2");
        System.out.println("The area of the circular pond is: " + circle_area + " m2");
        System.out.println("The area of the square pond is: " + square_area + " m2");
        System.out.println("The area planted with grass is: " + grass_area + " m2");
    }
}