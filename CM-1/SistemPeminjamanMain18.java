import java.util.Scanner;

public class SistemPeminjamanMain18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Data awal mahasiswa
        Mahasiswa18[] daftarMhs = {
                new Mahasiswa18("22001", "Andi", "Teknik Informatika"),
                new Mahasiswa18("22002", "Budi", "Teknik Informatika"),
                new Mahasiswa18("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // Data awal buku
        Buku18[] daftarBuku = {
                new Buku18("B001", "Algoritma", 2020),
                new Buku18("B002", "Basis Data", 2019),
                new Buku18("B003", "Pemrograman", 2021),
                new Buku18("B004", "Fisika", 2024),
        };

        // Data awal peminjaman menggunakan array of object
        Peminjaman18[] daftarPinjam = {
                new Peminjaman18(daftarMhs[0], daftarBuku[0], 7),
                new Peminjaman18(daftarMhs[1], daftarBuku[1], 3),
                new Peminjaman18(daftarMhs[2], daftarBuku[2], 10),
                new Peminjaman18(daftarMhs[2], daftarBuku[3], 6),
                new Peminjaman18(daftarMhs[0], daftarBuku[1], 4),
        };

        int pilihan;
        do {
            // Pilih Menu
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda (Insertion Sort)");
            System.out.println("5. Cari Berdasarkan NIM (Sequential Search)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Mahasiswa: ");
                    for (Mahasiswa18 m : daftarMhs)
                        m.tampilMahasiswa();
                    break;

                case 2:
                    System.out.println("Daftar Buku: ");
                    for (Buku18 b : daftarBuku)
                        b.tampilBuku();
                    break;

                case 3:
                    System.out.println("Data Peminjaman: ");
                    for (Peminjaman18 p : daftarPinjam)
                        p.tampilPeminjaman();
                    break;

                case 4: // Sorting Menggunakan Metode INSERTION SORT
                    for (int i = 1; i < daftarPinjam.length; i++) {
                        Peminjaman18 temp = daftarPinjam[i];
                        int j = i - 1;

                        while (j >= 0 && daftarPinjam[j].denda < temp.denda) {
                            daftarPinjam[j + 1] = daftarPinjam[j];
                            j--;
                        }
                        daftarPinjam[j + 1] = temp;
                    }

                    System.out.println("Setelah diurutkan (Denda terbesar): ");
                    for (Peminjaman18 p : daftarPinjam)
                        p.tampilPeminjaman();
                    break;

                case 5:
                    System.out.print("Masukan NIM: ");
                    String cariNim = sc.nextLine();

                    // Searching Menggunakan Metode SEQUENTIAL SEARCH
                    boolean ditemukan = false;
                    for (Peminjaman18 p : daftarPinjam) {
                        if (p.mhs.nim.equals(cariNim)) {
                            p.tampilPeminjaman();
                            ditemukan = true;
                        }
                    }
                    if (!ditemukan)
                        System.out.println("Data tidak ditemukan. ");
                    break;
            }
        } while (pilihan != 0);

        sc.close();
    }
}
