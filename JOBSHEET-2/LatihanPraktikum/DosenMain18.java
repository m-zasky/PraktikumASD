package LatihanPraktikum;

public class DosenMain18 {
    public static void main(String[] args) {
        // Objek 1: Menggunakan Konstruktor Default
        Dosen18 d1 = new Dosen18();
        d1.idDosen = "DSN001";
        d1.nama = "Muhammad Zasky Aryo Mahadani S.Tr.S.I.B";
        d1.statusAktif = true;
        d1.tahunBergabung = 2020;
        d1.bidangKeahlian = "Basis Data";

        System.out.println("=== Data Dosen 1 ===");
        d1.tampilInformasi(); // Memanggil method tampilkan informasi
        d1.setStatusAktif(false); // Mengubah status menjadi tidak aktif
        d1.ubahKeahlian("Data Science"); // Mengubah bidang keahlian
        System.out.println("Masa Kerja: " + d1.hitungMasaKerja(2026) + " tahun"); //
        System.out.println();

        // Objek 2: Menggunakan Konstruktor Berparameter
        Dosen18 d2 = new Dosen18("DSN002", "Vesakha Gothama", true, 2015, "Sistem Operasi");

        System.out.println("=== Data Dosen 2 ===");
        d2.tampilInformasi();
        // Menghitung masa kerja berdasarkan parameter tahun sekarang (2026)
        int masaKerja = d2.hitungMasaKerja(2026);
        System.out.println("Dosen " + d2.nama + " telah bekerja selama " + masaKerja + " tahun.");
    }
}