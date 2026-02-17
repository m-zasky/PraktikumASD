import java.util.Scanner;

public class KodePlat18 {
    public static void main(String[] args) {

        // deklarasi array 1 & 2 dimensi
        char[] KODE = { 'A', 'S', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char[][] KOTA = {
                { 'B', 'A', 'N', 'T', 'E', 'N' }, { 'J', 'O', 'M', 'B', 'A', 'N', 'G' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' }, { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' }, { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' }, { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' }, { 'T', 'E', 'G', 'A', 'L' }
        };

        // user menginputkan kode plat
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kode Plat: ");
        char input = sc.next().toUpperCase().charAt(0);

        // Kota berdasarkan kode plat
        System.out.print("Kota Berdasarkan Kode Plat Adalah : ");

        boolean ditemukan = false;
        for (int i = 0; i < KODE.length; i++) {

            if (KODE[i] == input) {
                for (char c : KOTA[i])
                    System.out.print(c);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Kode tidak ditemukan");

        }

        sc.close();
    }
}
