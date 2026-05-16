public class NodePesanan18 {
    Pesanan18 pesanan; // data pesanan yang disimpan
    NodePesanan18 prev; // pointer ke node sebelumnya
    NodePesanan18 next; // pointer ke node berikutnya

    public NodePesanan18(Pesanan18 pesanan) {
        this.pesanan = pesanan;
        this.prev = null;
        this.next = null;
    }
}