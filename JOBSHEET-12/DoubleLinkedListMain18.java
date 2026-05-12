import java.util.Scanner;

public class DoubleLinkedListMain18 {

    // Method helper untuk mempermudah input data mahasiswa
    public static Mahasiswa18 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM   : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine(); // Membersihkan buffer scanner
        return new Mahasiswa18(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList18 list = new DoubleLinkedList18(); // Instansiasi
        int pilihan;

        // Struktur perulangan agar program terus berjalan sampai memilih keluar
        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Tampilkan data mundur");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer setelah nextInt() 

            // Menjalankan operasi berdasarkan menu yang dipilih
            switch (pilihan) {
                case 1:
                    Mahasiswa18 mhsAwal = inputMahasiswa(sc);
                    list.addFirst(mhsAwal); // Menambah di awal
                    break;
                case 2:
                    Mahasiswa18 mhsAkhir = inputMahasiswa(sc);
                    list.addLast(mhsAkhir); // Menambah di akhir
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNim = sc.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa18 dataBaru = inputMahasiswa(sc);
                    list.insertAfter(keyNim, dataBaru); // Sisip setelah NIM tertentu
                    break;
                case 4:
                    list.removeFirst(); // Menghapus data pertama
                    break;
                case 5:
                    list.removeLast(); // Menghapus data terakhir
                    break;
                case 6:
                    list.print(); // Menampilkan seluruh isi list
                    break;
                case 7:
                    list.printReverse(); // Memanggil method hitung mundur
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0); // Loop berhenti jika pengguna menginput 0

        sc.close();
    }
}