import java.util.Scanner;

public class Perulangan18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        long nim = sc.nextLong();
        int n = (int) (nim % 100); // Ambil 2 digit terakhir

        if (n < 10)
            n += 10; // Ketentuan jika n < 10
        System.out.println("n adalah " + n);

        for (int i = 1; i <= n; i++) {
            // Abaikan angka 10 dan 15
            if (i == 10 || i == 15)
                continue;

            if (i % 3 == 0) {
                System.out.print("# "); // Kelipatan 3
            } else if (i % 2 == 0) {
                System.out.print(i + " "); // Genap selain kelipatan 3
            } else {
                System.out.print("* "); // Ganjil
            }
        }

        sc.close();
    }
}
