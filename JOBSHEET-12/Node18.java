public class Node18 {
    Mahasiswa18 data;   // Data yanng disimpan
    Node18 prev;        // Pointer ke node sebelumnya
    Node18 next;        // Pointer ke node berikutnya

    // Konstruktor Node
    // Next & prev di set null karena node baru belum terhubung di node manapun
    public Node18 (Mahasiswa18 data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
