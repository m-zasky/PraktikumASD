import java.util.Scanner;

//  CLASS ROYALDELISH18 - MAIN CLASS
public class RoyalDelish18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inisialisasi dua struktur data utama
        AntrianDLL18 antrian = new AntrianDLL18(); // DLL untuk antrian pembeli
        PesananDLL18 pesanan = new PesananDLL18(); // DLL untuk daftar pesanan

        // DATA AWAL (via konstruktor)
        // Catatan Data 1-3 langsung dibuat pakai objek konstruktor
        antrian.tambahAntrian(new Pembeli18("Ainra", "08224500000"));
        antrian.tambahAntrian(new Pembeli18("Danra", "08224511111"));
        antrian.tambahAntrian(new Pembeli18("Sanri", "08224522222"));

        int pilihan;

        do {
            // ===== TAMPILKAN MENU UTAMA =====
            System.out.println("==============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {

                // MENU 1 - TAMBAH ANTRIAN
                // Kasir menginput data pembeli baru lalu disimpan ke DLL
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String inputNama = sc.nextLine(); // nama pembeli

                    System.out.print("No HP        : ");
                    String inputNoHp = sc.nextLine(); // nomor HP

                    // Buat objek Pembeli18 menggunakan konstruktor (catatan)
                    Pembeli18 pembeliBaru = new Pembeli18(inputNama, inputNoHp);

                    // Tambahkan ke antrian DLL, dapatkan nomor antrian otomatis
                    int nomorAntrian = antrian.tambahAntrian(pembeliBaru);
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + nomorAntrian);
                    break;

                // MENU 2 - CETAK ANTRIAN
                // Tampilkan seluruh isi antrian dari DLL (head ke tail)
                case 2:
                    antrian.cetakAntrian(); // traversal DLL dari head ke tail
                    break;

                // MENU 3 - HAPUS ANTRIAN & INPUT PESANAN
                // Pembeli dipanggil maka hapus dari antrian DLL
                case 3:
                    // Pastikan antrian tidak kosong sebelum melanjutkan
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian saat ini kosong, tidak ada yang perlu dilayani.");
                        break;
                    }

                    // Ambil pembeli paling depan (head) tanpa input nomor antrian
                    // lanjut ke input pesanan
                    NodeAntrian18 nodeDilayani = antrian.head;

                    // Kasir menginput detail pesanan makanan/minuman
                    System.out.print("Kode Pesanan : ");
                    int inputKode = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nama Pesanan : ");
                    String inputNamaPesanan = sc.nextLine();

                    System.out.print("Harga        : ");
                    int inputHarga = sc.nextInt();
                    sc.nextLine();

                    // Hapus head dari antrian DLL (FIFO: yang pertama masuk, pertama dilayani)
                    NodeAntrian18 nodeDihapus = antrian.hapusAntrian(nodeDilayani.noAntrian);

                    // Buat objek Pesanan18 menggunakan konstruktor, lalu simpan ke DLL pesanan
                    Pesanan18 pesananBaru = new Pesanan18(
                            inputKode,
                            inputNamaPesanan,
                            inputHarga,
                            nodeDihapus.pembeli.namaPembeli);
                    pesanan.tambahPesanan(pesananBaru);

                    // Konfirmasi pesanan berhasil dicatat
                    System.out.println(nodeDihapus.pembeli.namaPembeli
                            + " telah memesan " + inputNamaPesanan);
                    break;

                // MENU 4 - LAPORAN PESANAN
                // Tampilkan semua pesanan, diurutkan berdasarkan
                case 4:
                    pesanan.cetakLaporan();
                    break;

                // MENU 0 - KELUAR
                case 0:
                    System.out.println("Terima kasih telah menggunakan Sistem Antrian Royal Delish!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan masukkan angka 0-4.");
            }

            System.out.println(); // baris kosong sebagai pemisah antar sesi menu

        } while (pilihan != 0);

        sc.close();
    }
}