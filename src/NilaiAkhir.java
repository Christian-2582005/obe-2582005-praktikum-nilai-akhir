import java.util.Scanner;

public class NilaiAkhir {

    static final double BOBOT_PRAKTIKUM = 0.30;
    static final double BOBOT_TUGAS = 0.20;
    static final double BOBOT_MID = 0.20;
    static final double BOBOT_FINAL = 0.30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
        // lebih dulu daripada + oleh Java (precedence bawaan), jadi urutan
        // perkalian-bobot per komponen otomatis benar tanpa perlu dipaksa pakai ().
        double akhir = praktikum * BOBOT_PRAKTIKUM + tugas * BOBOT_TUGAS + mid * BOBOT_MID;

        // Komponen final ditambahkan pakai augmented assignment
        akhir += finalNilai * BOBOT_FINAL;

        int dibulatkan = (int) akhir;
        double selisih = akhir - dibulatkan;

        boolean lulus = akhir >= 60;
