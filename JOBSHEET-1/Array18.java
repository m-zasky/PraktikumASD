import java.util.Scanner;

public class Array18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mk = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman", "K3" };
        int[] sks = { 2, 2, 2, 3, 2, 2, 3, 2 }; // Contoh bobot SKS
        double[] nilaiAngka = new double[mk.length];
        String[] nilaiHuruf = new String[mk.length];
        double[] bobotNilai = new double[mk.length];

        System.out.println("Program Menghitung IP Semester");
        for (int i = 0; i < mk.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mk[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            // Konversi ke Nilai Setara & Huruf
            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
        }

        // Hitung IP
        double totalBobot = 0, totalSKS = 0;
        System.out.println("\nhasil Konversi Nilai");
        System.out.printf("%-40s %-12s %-12s %-12s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < mk.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n", mk[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            totalBobot += (bobotNilai[i] * sks[i]);
            totalSKS += sks[i];
        }
        System.out.printf("\nIP: %.2f\n", (totalBobot / totalSKS));

        sc.close();
    }
}
