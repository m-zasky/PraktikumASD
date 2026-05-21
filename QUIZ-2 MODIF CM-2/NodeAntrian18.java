public class NodeAntrian18 {
    // Atribut untuk menyimpan data di dalam Node
    int noAntrian; // Menyimpan nomor urut antrian
    Pembeli18 pembeli; // Menyimpan data pembeli dari class Pembeli18

    // Atribut pointer
    NodeAntrian18 next;
    NodeAntrian18 prev;

    // Konstruktor
    public NodeAntrian18 (int noAntrian, Pembeli18 pembeli) {
        this.noAntrian = noAntrian; 
        this.pembeli = pembeli;
        this.prev = null;
        this.next = null;
    }

    
}
