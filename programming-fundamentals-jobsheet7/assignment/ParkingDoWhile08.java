import java.util.Scanner;

public class ParkingDoWhile08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type;
        int duration;
        int total = 0;
        int carRate = 3000;
        int motorcycleRate = 2000;

        System.out.println("==========================================");
        System.out.println("Welcome to Parking Fee Calculation System");
        System.out.println("==========================================");

        do {
            System.out.print("Enter vehicle type (1 for Car, 2 for Motorcycle, 0 for Exit): ");
            type = sc.nextInt();

            if (type == 1 || type == 2) {
                System.out.print("Enter parking duration (hours): ");
                duration = sc.nextInt();

                if (type == 1) {
                    total += duration * carRate;
                } else {
                    total += duration * motorcycleRate;
                }
            }
        } while (type != 0);

        System.out.println("==========================================");
        System.out.println("Total parking fee: Rp. " + total);
        System.out.println("=========================================="); 
    }
}


