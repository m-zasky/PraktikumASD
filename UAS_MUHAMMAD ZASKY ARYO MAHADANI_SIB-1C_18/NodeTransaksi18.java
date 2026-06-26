public class NodeTransaksi18 {
    Transaksi18 data18;
    NodeTransaksi18 prev18;
    NodeTransaksi18 next18;

    // Konstruktor
    public NodeTransaksi18(NodeTransaksi18 prev18, Transaksi18 data18, NodeTransaksi18 next18) {
        this.prev18 = prev18;
        this.data18 = data18;
        this.next18 = next18;
    }
}