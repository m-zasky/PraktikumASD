public class Mahasiswa18 {
    // Deklarasi
    String nama, nim, kelas;
    int nilai;

    // Konstruktor Berparameter
    Mahasiswa18(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    // Method Tugas Dinilai
    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }

}