import java.util.Scanner;

public class NilaiAkhir {

    static final double BOBOT_PRAKTIKUM = 0.30;
    static final double BOBOT_TUGAS = 0.20;
    static final double BOBOT_MID = 0.20;
    static final double BOBOT_FINAL = 0.30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nilai praktikum : ");
        int praktikum = scanner.nextInt();

        System.out.print("Nilai tugas : ");
        int tugas = scanner.nextInt();

        System.out.print("Nilai mid : ");
        int mid = scanner.nextInt();

        System.out.print("Nilai final : ");
        int finalNilai = scanner.nextInt();