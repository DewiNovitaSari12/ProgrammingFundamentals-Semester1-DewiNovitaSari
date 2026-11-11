package learn.quiz2;

import java.util.Scanner;

public class ATMBlokir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pinBenar = 1234;
        int pin;
        int kesempatan = 0;

        do {
            System.out.print("Masukkan PIN: ");
            pin = sc.nextInt();
            kesempatan++;

            if (pin != pinBenar) {
                System.out.println("PIN salah!");
            }
        } while (pin != pinBenar && kesempatan < 3);

        if (pin == pinBenar) {
            System.out.println("Selamat datang!");
        } else {
            System.out.println("Kartu diblokir!");
        }
    }
}