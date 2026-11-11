package learn.quiz2;
import java.util.Scanner;

public class tokokue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Harga kue ke-" + i + ": ");
            int harga = sc.nextInt();
            total = total + harga;
        }

        System.out.println("Total belanja: " + total);
    }
}