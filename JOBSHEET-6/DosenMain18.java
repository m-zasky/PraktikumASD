import java.util.Scanner;

public class DosenMain18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen18 repo = new DataDosen18();
        int pilih;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble Sort - Usia)");
            System.out.println("4. Sorting DSC (Insertion Sort - Usia)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kd = sc.nextLine();
                    System.out.print("Nama: ");
                    String nm = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String inputJK = sc.nextLine().toUpperCase();
                    boolean jk = inputJK.equals("L"); // Jika input "L", bernilai true. Selain itu false (P).
                    System.out.print("Usia: ");
                    int us = sc.nextInt();
                    repo.tambah(new Dosen18(kd, nm, jk, us));
                    break;
                case 2:
                    repo.tampil();
                    break;
                case 3:
                    repo.sortingASC();
                    repo.tampil();
                    break;
                case 4:
                    repo.sortingDSC();
                    repo.tampil();
                    break;
            }
        } while (pilih != 5);

        sc.close();
    }
}