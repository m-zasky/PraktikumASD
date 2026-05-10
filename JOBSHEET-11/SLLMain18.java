// public class SLLMain18 {

//     public static void main(String[] args) {

//         SingleLinkedList18 sll = new SingleLinkedList18();

//         // 4 objek mahasiswa dengan data masing-masing
//         Mahasiswa18 mhs1 = new Mahasiswa18("24212200", "Alvaro", "1A", 4.0);
//         Mahasiswa18 mhs2 = new Mahasiswa18("23212201", "Bimon", "2B", 3.8);
//         Mahasiswa18 mhs3 = new Mahasiswa18("22212202", "Cintia", "3C", 3.5);
//         Mahasiswa18 mhs4 = new Mahasiswa18("21212203", "Dirga", "4D", 3.6);

//         // Cetak sebelum ada data akan tampil "Linked list kosong"
//         sll.print();
//         // Tambah mhs4 (Dirga) di depan,  lalu cetak
//         sll.addFirst(mhs4);
//         sll.print();
//         // Tambah mhs1 (Alvaro) di belakang, lalu cetak
//         sll.addLast(mhs1);
//         sll.print();
//         // sisipkan mhs3
//         sll.InsertAfter("Dirga", mhs3);
//         sll.insertAt(2, mhs2);
//         sll.print();
//     }

// }

// MODIF MENGGUNAKAN SCANNER
import java.util.Scanner;

public class SLLMain18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList18 sll = new SingleLinkedList18();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();
        sc.nextLine(); // Pembersih buffer

        for (int i = 0; i < jml; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // Pembersih buffer

            // Langsung masukkan ke linked list
            sll.addLast(new Mahasiswa18(nim, nama, kelas, ipk));
        }

        System.out.println("\nHasil Input:");
        sll.print();
        sc.close();
    }
}