public class Barang18 {
    String kode18;
    String nama18;
    double harga18;
    int stok18;

    // Konstruktor
    public Barang18(String kode18, String nama18, double harga18, int stok18) {
        this.kode18 = kode18;
        this.nama18 = nama18;
        this.harga18 = harga18;
        this.stok18 = stok18;
    }

    // mengambil kode barang
    public String getKode18() {
        return kode18;
    }

    // mengambil nama barang
    public String getNama18() {
        return nama18;
    }

    // mengambil harga barang
    public double getHarga18() {
        return harga18;
    }

    // mengambil stok barang saat ini
    public int getStok18() {
        return stok18;
    }

    // memperbarui stok barang setelah pembelian
    public void setStok18(int stok18) {
        this.stok18 = stok18;
    }

}
