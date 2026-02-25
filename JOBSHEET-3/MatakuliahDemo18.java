import java.util.Scanner;

public class MatakuliahDemo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Matakuliah18[] arrayOfMatakuliah = new Matakuliah18[3];
        // String kode, nama, dummy;
        // int sks, jumlahJam;
        // for (int i = 0; i < 3; i++) {
        // System.out.println("Masukan Data Matakuliah ke-" + (i + 1));
        // System.out.print("Kode : ");
        // kode = sc.nextLine();
        // System.out.print("Nama : ");
        // nama = sc.nextLine();
        // System.out.print("SKS :");
        // dummy = sc.nextLine();
        // sks = Integer.parseInt(dummy);
        // System.out.print("Jumlah Jam :");
        // dummy = sc.nextLine();
        // jumlahJam = Integer.parseInt(dummy);
        // System.out.println("--------------------------------------");

        // arrayOfMatakuliah[i] = new Matakuliah18(kode, nama, sks, jumlahJam);
        // }

        // // modif langkah no4
        // for (int i = 0; i < 3; i++) {
        // System.out.println("Data Matakuliah ke-" + (i + 1));
        // System.out.println("Kode :" + arrayOfMatakuliah[i].kode);
        // System.out.println("Nama :" + arrayOfMatakuliah[i].nama);
        // System.out.println("Sks :" + arrayOfMatakuliah[i].sks);
        // System.out.println("Jumlah Jam :" + arrayOfMatakuliah[i].jumlahJam);
        // System.out.println("--------------------------------");
        // }

        // Modif jumlah elemen
        System.out.print("Masukkan jumlah matakuliah: ");
        int jml = Integer.parseInt(sc.nextLine());

        Matakuliah18[] arrayOfMatakuliah = new Matakuliah18[jml];

        // Memasukkan data menggunakan method tambahData()
        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            // Inisialisasi objek sebelum memanggil method-nya
            arrayOfMatakuliah[i] = new Matakuliah18("", "", 0, 0);
            arrayOfMatakuliah[i].tambahData(sc);
        }

        // Menampilkan data menggunakan method cetakInfo()
        System.out.println("\n--- DAFTAR MATAKULIAH ---");
        for (int i = 0; i < jml; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }

        sc.close();
    }
}
