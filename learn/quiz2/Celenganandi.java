package learn.quiz2;
public class Celenganandi {
    public static void main(String[] args) {
        int hargaSepatu = 300000;
        int tabungan = 0;
        int minggu = 0;

        while (tabungan < hargaSepatu) {
            minggu++;
            tabungan = tabungan + 40000;
            System.out.println("Minggu ke-" + minggu + ": tabungan " + tabungan);
        }

        System.out.println("Tabungan cukup! Butuh " + minggu + " minggu.");
    }
    
}
