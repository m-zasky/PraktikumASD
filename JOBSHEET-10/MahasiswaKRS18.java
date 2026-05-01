public class MahasiswaKRS18 {
    // Deklarasi
    String nim;
    String nama;
    String prodi;
    String kelas;

    // konstruktor
    public MahasiswaKRS18(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " | " + nama + " | " + prodi + " | " + kelas + " | ");
    }
}
