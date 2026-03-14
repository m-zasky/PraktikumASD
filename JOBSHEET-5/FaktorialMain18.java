import java.util.Scanner;

public class FaktorialMain18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================");
        System.out.print("Masukan nilai: ");
        int nilai = sc.nextInt();
        System.out.println("===============");

        // Membuat objek dari class faktorial
        Faktorial18 fk = new Faktorial18();

        // Menampilkan Hasil Brute Force
        System.out.println("Nilai faktorial " + nilai + " Menggunakan BF: " + fk.faktorialBF(nilai));

        // Menampilkan Divide and Conquer
        System.out.println("Nilai faktorial " + nilai + " Menggunakan DC: " + fk.faktorialDC(nilai));

        System.out.println("===============");

        sc.close();
    }
}
