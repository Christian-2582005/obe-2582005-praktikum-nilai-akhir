import java.util.Scanner;

public class NilaiAkhir {

    static final double BOBOT_PRAKTIKUM = 0.30;
    static final double BOBOT_TUGAS = 0.20;
    static final double BOBOT_MID = 0.20;
    static final double BOBOT_FINAL = 0.30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Percobaan pertama menggunakan int, dengan contoh nilai
        // praktikum=80, tugas=75, mid=70, finalNilai=85
        // int akhirInt = 80 * 30 / 100 + 75 * 20 / 100 + 70 * 20 / 100 + 85 * 30 / 100;
        // Hasil: 24 + 15 + 14 + 25 = 78, padahal versi double bisa
        // menghasilkan angka desimal seperti 78.5 atau 79.1 tergantung nilainya.
        // karena pembagian int selalu membuang bagian desimal
        // di SETIAP komponen sebelum sempat dijumlahkan, jadi selisihnya makin
        // menumpuk dan hasil akhirnya jadi tidak akurat. Makanya nilai dan bobot
        // oleh karena itu wajib double, bukan int.

        System.out.print("Nilai praktikum : ");
        double praktikum = scanner.nextDouble();

        System.out.print("Nilai tugas : ");
        double tugas = scanner.nextDouble();

        System.out.print("Nilai mid : ");
        double mid = scanner.nextDouble();

        System.out.print("Nilai final : ");
        double finalNilai = scanner.nextDouble();

        // Satu ekspresi tanpa kurung sama sekali.
        // Tidak perlu kurung karena operator * dan / memang sudah dieksekusi
        // lebih dulu daripada + oleh Java (yaitu precedence bawaan), jadi urutan
        // perkalian-bobot per komponen otomatis benar tanpa perlu dipaksa pakai ().
        double akhir = praktikum * BOBOT_PRAKTIKUM + tugas * BOBOT_TUGAS + mid * BOBOT_MID;

        // Komponen final ditambahkan pakai augmented assignment
        akhir += finalNilai * BOBOT_FINAL;

        int dibulatkan = (int) akhir;
        double selisih = akhir - dibulatkan;

        boolean lulus = akhir >= 60;

        System.out.println();
        System.out.println("Nilai akhir = " + akhir);
        System.out.println("Dibulatkan = " + dibulatkan);
        System.out.println("Selisih = " + selisih);
        System.out.println("Lulus = " + lulus);

        scanner.close();
    }
}
