package LatihanPraktikum;

public class MataKuliahMain18 {
    public static void main(String[] args) {
        // Objek 1: Menggunakan Konstruktor Default
        MataKuliah18 mk1 = new MataKuliah18();
        mk1.kodeMK = "DP";
        mk1.nama = "Dasar Pemrograman";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        System.out.println("=== Data Mata Kuliah 1 ===");
        mk1.tampilInformasi(); // Memanggil method tampilkan informasi
        mk1.ubahSKS(3); // Memanggil method ubah SKS
        mk1.tambahJam(2); // Memanggil method tambah jam
        mk1.kurangiJam(1); // Memanggil method kurangi jam
        mk1.tampilInformasi();
        System.out.println();

        // Objek 2: Menggunakan Konstruktor Berparameter
        MataKuliah18 mk2 = new MataKuliah18("ASD", "Algoritma Struktur Data", 3, 6);

        System.out.println("=== Data Mata Kuliah 2 ===");
        mk2.tampilInformasi();
        mk2.kurangiJam(10); // Menguji validasi jika jam tidak mencukupi
    }
}