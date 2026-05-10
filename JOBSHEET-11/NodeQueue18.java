public class NodeQueue18 {
    MahasiswaaQ18 data; // isi node: objek mahasiswa
    NodeQueue18 next; // pointer ke node berikutnya (null jika node terakhir)

    // Constructor: buat node baru dengan data dan pointer next
    public NodeQueue18(MahasiswaaQ18 data, NodeQueue18 next) {
        this.data = data;
        this.next = next;
    }
}
