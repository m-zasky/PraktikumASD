import java.util.Scanner;

public class Jadwal18 {
    static Scanner sc = new Scanner(System.in);
    static String[][] jadwal;
    static int n;

    // a. Fungsi Menginput data jadwal kuliah
    public static void inputData() {
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        n = sc.nextInt();
        sc.nextLine(); // membersihkan buffer
        jadwal = new String[n][4];

        for (int i = 0; i < n; i++) {
            System.out.println("\nData Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari             : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam              : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    // b. Fungsi Menampilkan seluruh jadwal kuliah
    public static void tampilSemua() {
        System.out.println("\n" + "=".repeat(75));
        System.out.printf("%-25s | %-15s | %-10s | %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("-".repeat(75));
        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s | %-15s | %-10s | %-15s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
        System.out.println("=".repeat(75));
    }

    // c. Fungsi Menampilkan jadwal kuliah berdasarkan hari tertentu
    public static void cariHari() {
        System.out.print("\nMasukkan hari yang dicari: ");
        String hari = sc.nextLine();
        boolean ditemukan = false;

        System.out.println("\nJadwal pada hari " + hari + ":");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("- %s (%s) di %s\n", jadwal[i][0], jadwal[i][3], jadwal[i][1]);
                ditemukan = true;
            }
        }
        if (!ditemukan)
            System.out.println("Tidak ada jadwal pada hari tersebut.");
    }

    // d. Fungsi Menampilkan jadwal kuliah berdasarkan nama mata kuliah
    public static void cariMatkul() {
        System.out.print("\nMasukkan nama mata kuliah yang dicari: ");
        String nama = sc.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(nama)) {
                System.out.println("\nDetail Mata Kuliah:");
                System.out.println("Nama  : " + jadwal[i][0]);
                System.out.println("Ruang : " + jadwal[i][1]);
                System.out.println("Hari  : " + jadwal[i][2]);
                System.out.println("Jam   : " + jadwal[i][3]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan)
            System.out.println("Mata kuliah tidak ditemukan.");
    }

    public static void main(String[] args) {
        inputData();
        int menu;
        do {
            System.out.println("\n--- MENU JADWAL KULIAH ---");
            System.out.println("1. Tampilkan Semua Jadwal");
            System.out.println("2. Cari Jadwal Berdasarkan Hari");
            System.out.println("3. Cari Mata Kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1 -> tampilSemua();
                case 2 -> cariHari();
                case 3 -> cariMatkul();
            }
        } while (menu != 4);
    }
}
