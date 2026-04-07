import java.util.Scanner;

public class MahasiswaDemo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // MahasiswaBerprestasi18 list = new MahasiswaBerprestasi18();
        // Modif agar user bisa menginputkan jumlah mahasiswa
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jml = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi18 list = new MahasiswaBerprestasi18(jml);

        // // Sesuai gambar: variabel int jumMhs = 5
        // int jumMhs = 5;

        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM : ");
            String nim = sc.nextLine();

            System.out.print("Nama : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK : ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);

            System.out.println("-------------------------------------------");
            list.tambah(new Mahasiswa18(nim, nama, kelas, ipk));
        }

        // Menampilkan semua data
        list.tampil();

        // Melakukan pencarian data sequential search
        // System.out.println("-------------------------------------------");
        // System.out.println("Pencarian data");
        // System.out.println("-------------------------------------------");
        // System.out.println("masukkan ipk mahasiswa yang dicari: ");
        // System.out.print("IPK : ");
        // double cari = sc.nextDouble();

        // System.out.println("menggunakan sequential searching");
        // // Memanggil method pencarian
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int) posisi;

        // // Menampilkan posisi dan detail data hasil pencarian
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        // Melakukan pencarian data binary search
        System.out.println("-------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-------------------------------------------");
        System.out.println("Masukan ipk mahasiswa yang dicari: ");
        System.out.println("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("-------------------------------------------");
        System.out.println("Menggunakan Binary Search");
        System.out.println("-------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jml - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        sc.close();
    }
}