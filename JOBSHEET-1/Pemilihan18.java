import java.util.Scanner;

public class Pemilihan18 {
    public static void main(String[] args) {

        // input nilai
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.println("==============================");
        System.out.print("Masukan Nilai Tugas : ");
        double tugas = sc.nextDouble();
        System.out.print("Masukan Nilai Kuis : ");
        double kuis = sc.nextDouble();
        System.out.print("Masukan Nilai UTS : ");
        double uts = sc.nextDouble();
        System.out.print("Masukan Nilai UAS : ");
        double uas = sc.nextDouble();
        System.out.println("==============================");

        // validasi input nilai
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("NILAI TIDAK VALID");
            System.out.println("===========================");
        } else {
            // hitung nilai akhir
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);
            String nilaiHuruf = "";

            // konversi nilai
            if (nilaiAkhir > 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39) {
                nilaiHuruf = "D";
            } else
                nilaiHuruf = "E";

            System.out.println("nilai akhir : " + nilaiAkhir);
            System.out.println("nilai huruf : " + nilaiHuruf);
            System.out.println("=========================");

            // cek kelulusan output
            if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
                System.out.println("ANDA TIDAK LULUS");
            } else {
                System.out.println("SELAMAT ANDA LULUS");
            }
        }

        sc.close();
    }
}
