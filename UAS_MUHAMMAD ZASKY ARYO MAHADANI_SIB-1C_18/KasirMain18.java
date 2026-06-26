import java.util.Scanner;

public class KasirMain18 {

    public static void main(String[] args) {
        DLLBarang18 listBarang18 = new DLLBarang18();
        DLLTransaksi18 listTransaksi18 = new DLLTransaksi18();
        int kodeTrxOtomatis18 = 1;

        // Inisialisasi Data Barang
        listBarang18.addLast18(new Barang18("B01", "Sabun Mandi lux      ", 5000, 20));
        listBarang18.addLast18(new Barang18("B02", "Minyak Goreng Fortune", 15000, 10));
        listBarang18.addLast18(new Barang18("B03", "Beras 5Kg raja lele  ", 65000, 20));
        listBarang18.addLast18(new Barang18("B04", "Gula Pasir           ", 12000, 0));
        listBarang18.addLast18(new Barang18("B05", "Kopi Hitam           ", 25000, 15));

        Scanner sc = new Scanner(System.in);
        int menu18;

        do {
            System.out.println("\n==================================");
            System.out.println("   PROGRAM KASIR SUPERMARKET 18   ");
            System.out.println("==================================");
            System.out.println("1. Tampilkan Daftar Barang");
            System.out.println("2. Input Transaksi Pembelian");
            System.out.println("3. Tampilkan Seluruh Transaksi & Total Pendapatan");
            System.out.println("4. Urutkan Transaksi berdasarkan Nama (Ascending)");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            menu18 = sc.nextInt();
            sc.nextLine();

            switch (menu18) {
                case 1:
                    listBarang18.tampilkanBarang18();
                    break;

                case 2:
                    System.out.println("\n--- PROSES TRANSAKSI ---");
                    System.out.print("Masukkan Kode Barang: ");
                    String cariKode18 = sc.nextLine();

                    // Memanggil method cariBarang18 untuk mencari data barang di Linked List
                    Barang18 barangDitemukan18 = listBarang18.cariBarang18(cariKode18);

                    // Jika barang tidak ada di daftar
                    if (barangDitemukan18 == null) {
                        System.out.println("Barang tidak ditemukan!");
                        break;
                    }

                    System.out.println("Nama Barang: " + barangDitemukan18.getNama18());
                    System.out.println("Stok Tersedia: " + barangDitemukan18.getStok18());

                    // Jika stok barang kosong (0), pembelian dibatalkan
                    if (barangDitemukan18.getStok18() <= 0) {
                        System.out.println("Maaf, stok habis. Tidak dapat melakukan pembelian!");
                        break;
                    }

                    System.out.print("Masukkan Jumlah Pembelian: ");
                    int jumlahBeli18 = sc.nextInt();
                    sc.nextLine(); 

                    // Jika jumlah beli lebih banyak dari sisa stok
                    if (jumlahBeli18 > barangDitemukan18.getStok18()) {
                        System.out.println("Stok tidak mencukupi!");
                        break;
                    }

                    // Hitung harga awal sebelum diskon
                    double totalAwal18 = jumlahBeli18 * barangDitemukan18.getHarga18();
                    double diskon18 = 0;

                    System.out.print("Apakah pembeli adalah Member? (y/n): ");
                    String isMember18 = sc.nextLine();

                    // Potongan 5% jika total belanja di atas Rp 500.000
                    if (totalAwal18 > 500000) {
                        diskon18 += totalAwal18 * 0.05;
                        System.out.println("Selamat! Anda mendapat diskon nominal belanja 5%");
                    }

                    // Potongan tambahan 2% jika pembeli punya kartu Member
                    if (isMember18.equalsIgnoreCase("y")) {
                        diskon18 += totalAwal18 * 0.02;
                        System.out.println("Selamat! Anda mendapat diskon member 2%");
                    }

                    // hitung total harga yang harus dibayar
                    double totalBayar18 = totalAwal18 - diskon18;

                    // Memperbarui sisa stok barang (Stok lama dikurangi jumlah beli)
                    barangDitemukan18.setStok18(barangDitemukan18.getStok18() - jumlahBeli18);

                    // Membuat objek struk transaksi baru dengan data yang sudah dihitung
                    Transaksi18 trxBaru18 = new Transaksi18(kodeTrxOtomatis18, barangDitemukan18, jumlahBeli18,
                            totalBayar18);

                    // Tambah data transaksi ke histori DLL (ke posisi paling akhir)
                    listTransaksi18.addLast18(trxBaru18);

                    // Menampilkan struk
                    System.out.println("\n--- STRUK PEMBELIAN ---");
                    System.out.println("Kode Transaksi : " + kodeTrxOtomatis18);
                    System.out.println("Nama Barang    : " + barangDitemukan18.getNama18());
                    System.out.println("Harga Satuan   : Rp " + (int) barangDitemukan18.getHarga18());
                    System.out.println("Jumlah Beli    : " + jumlahBeli18);
                    System.out.println("Total Diskon   : Rp " + (int) diskon18);
                    System.out.println("Total Bayar    : Rp " + (int) totalBayar18);
                    System.out.println("-----------------------");

                    kodeTrxOtomatis18++;
                    break;

                case 3:
                    listTransaksi18.tampilkanTransaksi18();
                    break;

                case 4:
                    // Panggil sorting
                    listTransaksi18.urutkanNamaAscending18();
                    listTransaksi18.tampilkanTransaksi18();
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        } while (menu18 != 5);

        sc.close();
    }
}