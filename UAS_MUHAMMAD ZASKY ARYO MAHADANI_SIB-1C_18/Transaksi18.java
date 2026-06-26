public class Transaksi18 {
    int kodeTransaksi18;
    Barang18 barang18;
    int jumlahBarang18;
    double totalHarga18;

    // Konstruktor
    public Transaksi18(int kodeTransaksi18, Barang18 barang18, int jumlahBarang18, double totalHarga18) {
        this.kodeTransaksi18 = kodeTransaksi18;
        this.barang18 = barang18;
        this.jumlahBarang18 = jumlahBarang18;
        this.totalHarga18 = totalHarga18;
    }

    // mengambil kode transaksi
    public int getKodeTransaksi18 () {
        return kodeTransaksi18;
    }

    // barang yang dibeli dalam transaksi
    public Barang18 getBarang18() {
        return barang18;
    }

    // mengambil jumlah barang yang dibeli
    public int getJumlahBarang18() {
        return jumlahBarang18;
    }

    // nominal akhir yang dibayarkan setelah diskon
    public double getTotalHarga18() {
        return totalHarga18;
    }
}
