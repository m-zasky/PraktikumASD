public class NodePesanan18 {
    // Atribut untuk menyimpan data pesanan
    Pesanan18 pesanan;

    // Atribut pointer
    NodePesanan18 next;
    NodePesanan18 prev;

    // Konstruktor
    public NodePesanan18 (Pesanan18 pesanan) {
        this.pesanan = pesanan;
        this.next = null;
        this.prev = null;
    }
}
