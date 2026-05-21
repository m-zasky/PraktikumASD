import java.util.Scanner;

public class RoyalDelish18 {

    // Titik awal berjalannya program utama
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Fasilitas pembaca input dari keyboard

        // Menyiapkan struktur data untuk antrian dan pesanan
        AntrianDLL18 antrian = new AntrianDLL18();
        PesananDLL18 pesanan = new PesananDLL18();

        // Memasukkan data awal (Dummy Data) agar antrian tidak langsung kosong saat
        // dijalankan
        antrian.addLast(new Pembeli18("Ainra", "08224500000"));
        antrian.addLast(new Pembeli18("Danra", "08224511111"));
        antrian.addLast(new Pembeli18("Sanri", "08224522222"));

        int pilihan; // Variabel penyimpan pilihan menu

        // Lakukan perulangan untuk menampilkan menu terus-menerus
        do {
            System.out.println("==============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");

            pilihan = sc.nextInt(); // Baca input menu
            sc.nextLine();

            // Menu yang dipilih pengguna
            switch (pilihan) {

                case 1: // MENU 1: Pendaftaran Antrian Baru
                    System.out.print("Nama Pembeli : ");
                    String inputNama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String inputNoHp = sc.nextLine();

                    // Bungkus input pengguna ke dalam objek Pembeli
                    Pembeli18 pembeliBaru = new Pembeli18(inputNama, inputNoHp);

                    // Masukkan pembeli tersebut ke posisi belakang antrian
                    int nomorAntrian = antrian.addLast(pembeliBaru);
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + nomorAntrian);
                    break;

                case 2: // MENU 2: Melihat Daftar Antrian
                    antrian.print();
                    break;

                // case 3: // MENU 3: Memanggil Antrian Terdepan dan Mencatat Pesanan
                //     // Pastikan ada orang yang mengantri sebelum melayani
                //     if (antrian.isEmpty()) {
                //         System.out.println("Antrian saat ini kosong, tidak ada yang perlu dilayani.");
                //         break;
                //     }

                //     // Minta input data pesanan ke kasir
                //     System.out.print("Kode Pesanan : ");
                //     int inputKode = sc.nextInt();
                //     sc.nextLine();

                //     System.out.print("Nama Pesanan : ");
                //     String inputNamaPesanan = sc.nextLine();

                //     System.out.print("Harga        : ");
                //     int inputHarga = sc.nextInt();
                //     sc.nextLine();

                //     // Keluarkan orang paling depan dari antrian untuk dilayani
                //     NodeAntrian18 nodeDihapus = antrian.removeFirst();

                //     // Bungkus data pesanan. Ambil nama pembeli dari data antrian yang baru saja
                //     // dikeluarkan
                //     Pesanan18 pesananBaru = new Pesanan18(
                //             inputKode,
                //             inputNamaPesanan,
                //             inputHarga,
                //             nodeDihapus.pembeli.namaPembeli);

                //     // Simpan pesanan tersebut ke dalam riwayat daftar pesanan
                //     pesanan.addLast(pesananBaru);

                //     System.out.println(nodeDihapus.pembeli.namaPembeli + " telah memesan " + inputNamaPesanan);
                //     break;

                // Modif case 3
                case 3: // MENU 3: Memilih Antrian dan Mencatat Pesanan
                    // Pastikan ada orang yang mengantri sebelum melayani
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian saat ini kosong, tidak ada yang perlu dilayani.");
                        break;
                    }

                    // Minta input nomor antrian yang ingin dipanggil
                    System.out.print("Masukkan Nomor Antrian yang akan diproses: ");
                    int noPilih = sc.nextInt();
                    sc.nextLine();

                    // Keluarkan orang dari antrian berdasarkan nomor yang dipilih
                    NodeAntrian18 nodeDihapus = antrian.removeByNo(noPilih);

                    // Validasi jika nomor antrian tidak ditemukan
                    if (nodeDihapus == null) {
                        System.out.println("Nomor antrian " + noPilih + " tidak ditemukan di dalam antrian!");
                        break;
                    }

                    // Minta input data pesanan ke kasir
                    System.out.print("Kode Pesanan : ");
                    int inputKode = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nama Pesanan : ");
                    String inputNamaPesanan = sc.nextLine();

                    System.out.print("Harga        : ");
                    int inputHarga = sc.nextInt();
                    sc.nextLine();

                    // Bungkus data pesanan. Ambil nama pembeli dari data antrian yang baru saja
                    // dikeluarkan
                    Pesanan18 pesananBaru = new Pesanan18(
                            inputKode,
                            inputNamaPesanan,
                            inputHarga,
                            nodeDihapus.pembeli.namaPembeli);

                    // Simpan pesanan tersebut ke dalam riwayat daftar pesanan
                    pesanan.addLast(pesananBaru);

                    System.out.println(nodeDihapus.pembeli.namaPembeli + " (Antrian " + nodeDihapus.noAntrian + ") telah memesan " + inputNamaPesanan);
                    break;

                case 4: // MENU 4: Melihat Laporan Keuangan dan Daftar Pesanan
                    pesanan.print();
                    break;

                case 0: // MENU 0: Mengakhiri program
                    System.out.println("Terima kasih telah menggunakan Sistem Antrian Royal Delish!");
                    break;

                default: // Jika pengguna mengetik angka di luar pilihan menu (misal: angka 7)
                    System.out.println("Pilihan tidak valid! Silakan masukkan angka 0-4.");
            }

            System.out.println(); // Berikan jarak (enter) agar tampilan terminal tetap rapi

        } while (pilihan != 0); // Program berhenti jika pilihan bernilai 0

        sc.close();
    }
}