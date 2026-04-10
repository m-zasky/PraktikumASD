public class Buku18 {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    // Konstruktor Buku18
    public Buku18(String kodeBuku, String judul, int tahun) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahun;
    }

    // Menampilkan data buku
    public void tampilBuku() {
        System.out.println("Kode: " + kodeBuku + "| Judul: " + judul + "| Tahun terbit: " + tahunTerbit);
    }
}
