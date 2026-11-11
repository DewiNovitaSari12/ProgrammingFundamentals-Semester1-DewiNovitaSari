package learn.quiz2;
import java.util.Scanner;

public class ATMKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pinBenar = 1234;
        int pin;

        do {
            System.out.print("Masukkan PIN: ");
            pin = sc.nextInt();

            if (pin != pinBenar) {
                System.out.println("PIN salah!");
            }
        } while (pin != pinBenar);

        System.out.println("Selamat datang!");
    }
}