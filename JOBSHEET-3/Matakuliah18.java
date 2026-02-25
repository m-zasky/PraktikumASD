import java.util.Scanner;

public class Matakuliah18 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah18(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // // konstruktor tanpa parameter (default)
    // public Matakuliah18() {}

    // tambah method, tambahData
    public void tambahData(Scanner sc) {
        System.out.print("Kode          : ");
        this.kode = sc.nextLine();
        System.out.print("Nama          : ");
        this.nama = sc.nextLine();
        System.out.print("SKS           :");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam    :");
        this.jumlahJam = Integer.parseInt(sc.nextLine());
        System.out.println("----------------------------------------");
    }

       // tambah method, cetakInfo
    public void cetakInfo() {
        System.out.println("Kode        :" + this.kode);
        System.out.println("Nama        :" + this.nama);
        System.out.println("SKS         :" + this.sks);
        System.out.println("Jumlah Jam  :" + this.jumlahJam);
        System.out.println("---------------------------------------");
    }

}
