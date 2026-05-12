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
        DoubleLinkedList18 list = new DoubleLinkedList18();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1.  Tambah data di awal");
            System.out.println("2.  Tambah data di akhir");
            System.out.println("3.  Tambah data pada indeks tertentu");
            System.out.println("4.  Sisipkan data setelah NIM tertentu");
            System.out.println("5.  Hapus data di awal");
            System.out.println("6.  Hapus data di akhir");
            System.out.println("7.  Hapus data setelah NIM tertentu");
            System.out.println("8.  Hapus data pada indeks tertentu");
            System.out.println("9.  Tampilkan data pertama");
            System.out.println("10. Tampilkan data terakhir");
            System.out.println("11. Tampilkan data pada indeks tertentu");
            System.out.println("12. Tampilkan jumlah data (size)");
            System.out.println("13. Tampilkan semua data");
            System.out.println("14. Tampilkan data mundur");
            System.out.println("0.  Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa18 mhsAwal = inputMahasiswa(sc);
                    list.addFirst(mhsAwal);
                    System.out.println("Data berhasil ditambahkan di awal.");
                    break;

                case 2:
                    Mahasiswa18 mhsAkhir = inputMahasiswa(sc);
                    list.addLast(mhsAkhir);
                    System.out.println("Data berhasil ditambahkan di akhir.");
                    break;

                // Tugas No. 1 - add(int index, Mahasiswa data)
                case 3:
                    System.out.print("Masukkan indeks: ");
                    int indeksTambah = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Masukkan data baru:");
                    Mahasiswa18 mhsIndeks = inputMahasiswa(sc);
                    list.add(indeksTambah, mhsIndeks);
                    System.out.println("Data berhasil ditambahkan pada indeks " + indeksTambah + ".");
                    break;

                case 4:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNim = sc.nextLine();
                    System.out.println("Masukkan data baru:");
                    Mahasiswa18 dataBaru = inputMahasiswa(sc);
                    list.insertAfter(keyNim, dataBaru);
                    break;

                case 5:
                    list.removeFirst();
                    break;

                case 6:
                    list.removeLast();
                    break;

                // Tugas No. 2 - removeAfter(String keyNim)
                case 7:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nimHapusSetelah = sc.nextLine();
                    list.removeAfter(nimHapusSetelah);
                    break;

                // Tugas No. 3 - remove(int index)
                case 8:
                    System.out.print("Masukkan indeks yang ingin dihapus: ");
                    int indeksHapus = sc.nextInt();
                    sc.nextLine();
                    list.remove(indeksHapus);
                    break;

                // Tugas No. 4a - getFirst()
                case 9:
                    Mahasiswa18 datapertama = list.getFirst();
                    if (datapertama != null) {
                        System.out.println("Data pertama:");
                        System.out.println("---------------------------");
                        datapertama.tampil();
                        System.out.println("---------------------------");
                    }
                    break;

                // Tugas No. 4b - getLast()
                case 10:
                    Mahasiswa18 dataTerakhir = list.getLast();
                    if (dataTerakhir != null) {
                        System.out.println("Data terakhir:");
                        System.out.println("---------------------------");
                        dataTerakhir.tampil();
                        System.out.println("---------------------------");
                    }
                    break;

                // Tugas No. 4c - getIndex(int index)
                case 11:
                    System.out.print("Masukkan indeks yang ingin ditampilkan: ");
                    int indeksGet = sc.nextInt();
                    sc.nextLine();
                    Mahasiswa18 dataIndeks = list.getIndex(indeksGet);
                    if (dataIndeks != null) {
                        System.out.println("Data pada indeks " + indeksGet + ":");
                        System.out.println("---------------------------");
                        dataIndeks.tampil();
                        System.out.println("---------------------------");
                    }
                    break;

                // Tugas No. 5 - size()
                case 12:
                    System.out.println("Jumlah data dalam list: " + list.size());
                    break;

                case 13:
                    list.print();
                    break;

                case 14:
                    list.printReverse();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}