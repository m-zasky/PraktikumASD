public class NodeAntrian18 {
    int noAntrian; // nomor urut antrian
    Pembeli18 pembeli; // data pembeli yang mengantri
    NodeAntrian18 prev; // pointer ke node sebelumnya (ciri khas DLL)
    NodeAntrian18 next; // pointer ke node berikutnya

    public NodeAntrian18(int noAntrian, Pembeli18 pembeli) {
        this.noAntrian = noAntrian;
        this.pembeli = pembeli;
        this.prev = null; // awalnya belum terhubung ke node manapun
        this.next = null;
    }
}