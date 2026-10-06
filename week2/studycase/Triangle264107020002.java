import java.util.Scanner;

public class Triangle264107020002 {
    public static void main(String[] args) {
        // Declare variables
        byte base, height;
        float area;

        // Input values for base and height
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: " );
        base = sc.nextByte();
        System.out.print("Enter the height of the triangle: " );
        height = sc.nextByte();
        sc.close();

        // Calculate the area of the triangle
        area = base * height / 2.0f;

        // show the output
        System.out.println("The area of the triangle is: " + area);

      

        }
    }

