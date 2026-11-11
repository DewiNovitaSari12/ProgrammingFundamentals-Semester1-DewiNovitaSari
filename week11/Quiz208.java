package week11;
import java.util.Scanner;

public class Quiz208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama = "Dewi Novita Sari";
        int noAbsen = 8;           // nomor absen 
        int k = noAbsen % 5;       // kode personal
        System.out.println("Nama : " + nama);
        System.out.println("Kode personal K = " + k);
        System.out.print("Jumlah tim   : ");
        int jumlahTim = sc.nextInt();
        System.out.print("Jumlah ronde : ");
        int jumlahRonde = sc.nextInt();

        int timTerbaik = 0;
        double rataTertinggi = 0;
        int jumlahUnggulan = -1;

        // Badan inner loop dijalankan 4 kali pada contoh ilustrasi (2 tim x 2 ronde)
        for (int t = 1; t <= jumlahTim; t++) {
            System.out.println("Tim " + t);

            int total = 0;   // reset tiap tim
            int main = 0;    // jumlah ronde yang dimainkan

            for (int r = 1; r <= jumlahRonde; r++) {
                System.out.print("  Skor ronde " + r + ": ");
                int skor = sc.nextInt();
                if (skor != 0) {          // skor 0 = forfeit, tidak dihitung
                    total += skor;main++;
                }
            }

            double rata = 0;
            if (main > 0) {
                rata = (double) total / main;
            }

            String kategori;
            if (main == 0) {
                kategori = "Gugur";
            } else if (rata <= 21 + k) {
                kategori = "Unggulan";
                jumlahUnggulan++;
            } else {
                kategori = "Reguler";
            }

            System.out.printf("  Main: %d | Rata: %.2f | %s%n", main, rata, kategori);

            // pakai ">" supaya kalau seri, tim dengan nomor terkecil tetap menang
            if (rata > rataTertinggi) {
                rataTertinggi = rata;
                timTerbaik = t;
            }
        }

        if (timTerbaik == 0) {
            rataTertinggi = 0;
        }

        System.out.println("=============================");
        System.out.println("Tim terbaik         : " + timTerbaik);
        System.out.printf("Rata-rata tertinggi : %.2f%n", rataTertinggi);
        System.out.println("Jumlah tim Unggulan : " + jumlahUnggulan);
    }
}