public class Surat18 {
    String idSurat, namaMahasiswa, kelas;
    char jenisIzin; // 'S' untuk Sakit, 'I' untuk Izin
    int durasi;

    public Surat18() {
    }

    public Surat18(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
}