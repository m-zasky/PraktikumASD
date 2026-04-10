public class Peminjaman18 {
    Mahasiswa18 mhs; // Terhubung dengan class Mahasiswa18
    Buku18 buku; // Terhubung dengan class Buku18
    int lamaPinjam;
    int batasPinjam = 5; // Batas peminjaman adalah 5 hari
    int terlambat;
    int denda;

    // Konstruktor Peminjaman
    public Peminjaman18(Mahasiswa18 mhs, Buku18 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda(); // Memanggil perhitungan otomatis

    }

    // Menghitung hari keterlambatan dan total denda
    public void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000; // Denda per hari 2000
        } else {
            terlambat = 0;
            denda = 0; // Jika tidak terlambat, denda = 0
        }
    }

    // Menampilkan data peminjaman
    public void tampilPeminjaman() {
        System.out.printf("%-7s | %-12s | Lama: %d | Terlambat: %d | Denda: %d\n",
                mhs.nama, buku.judul, lamaPinjam, terlambat, denda);
    }
}
