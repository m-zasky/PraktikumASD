public class Mahasiswa18 {
    String nim;
    String nama;
    String prodi;

    // Konstruktor Mahasiswa18
    public Mahasiswa18(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;

    }

    // Method Menampilkan data Mahasiswa
    public void tampilMahasiswa() {
        System.out.println("NIM: " + nim + "| Nama: " + nama + "| Prodi: " + prodi);
    }
}
