package LatihanPraktikum;
// MataKuliah<NoAbsen>.java
public class MataKuliah18 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    // Konstruktor Default
    public MataKuliah18() {
    }

    // Konstruktor Berparameter
    public MataKuliah18(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK    : " + kodeMK);
        System.out.println("Nama MK    : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }

    void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jam bertambah. Total jam sekarang: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println("Jam berhasil dikurangi. Sisa jam: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jam tidak mencukupi!");
        }
    }
}