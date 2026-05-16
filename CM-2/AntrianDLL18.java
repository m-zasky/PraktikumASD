public class AntrianDLL18 {
    NodeAntrian18 head; // pointer ke node pertama (depan antrian)
    NodeAntrian18 tail; // pointer ke node terakhir (belakang antrian)
    int counterAntrian; // penghitung otomatis nomor antrian

    public AntrianDLL18() {
        head = null;
        tail = null;
        counterAntrian = 0;
    }

    public int tambahAntrian(Pembeli18 pembeli) {
        counterAntrian++; // nomor antrian otomatis naik
        NodeAntrian18 newNode = new NodeAntrian18(counterAntrian, pembeli); // buat node baru

        if (head == null) {
            // Jika antrian masih kosong, head dan tail menunjuk ke node baru
            head = newNode;
            tail = newNode;
        } else {
            // Sambungkan node baru di belakang tail saat ini
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode; // update tail ke node baru
        }
        return counterAntrian; // kembalikan nomor antrian yang baru dibuat
    }

    public NodeAntrian18 hapusAntrian(int noAntrian) {
        NodeAntrian18 current = head;

        // Traversal dari head untuk mencari node dengan noAntrian yang sesuai
        while (current != null) {
            if (current.noAntrian == noAntrian) {

                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }

                current.prev = null;
                current.next = null;

                return current; // kembalikan node yang berhasil dihapus
            }
            current = current.next; // lanjut ke node berikutnya
        }
        return null; // nomor antrian tidak ditemukan
    }

    public void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian saat ini kosong.");
            return;
        }

        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");
        System.out.printf("%-12s %-15s %-15s%n", "No Antrian", "Nama", "No HP");

        NodeAntrian18 current = head; // mulai traversal dari depan antrian
        while (current != null) {
            System.out.printf("%-12d %-15s %-15s%n",
                    current.noAntrian,
                    current.pembeli.namaPembeli,
                    current.pembeli.noHp);
            current = current.next; // geser ke node berikutnya
        }
    }

    public NodeAntrian18 cariAntrian(int noAntrian) {
        NodeAntrian18 current = head;
        while (current != null) {
            if (current.noAntrian == noAntrian)
                return current; // node ditemukan
            current = current.next;
        }
        return null; // tidak ditemukan
    }

    public boolean isEmpty() {
        return head == null;
    }
}