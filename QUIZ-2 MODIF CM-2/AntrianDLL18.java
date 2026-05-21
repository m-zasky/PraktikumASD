public class AntrianDLL18 {
    // Referensi ke node awal
    NodeAntrian18 head;
    // Referensi ke node akhir
    NodeAntrian18 tail;

    // Mencatat nomor urut paling akhir
    int nomorUrutTerakhir;

    // Awal list kosong
    public AntrianDLL18() {
        head = null;
        tail = null;
        nomorUrutTerakhir = 0;
    }

    // Memeriksa apakah antrian sedang kosong
    public boolean isEmpty() {
        return head == null;
    }

    // Menambah pembeli baru ke barisan paling belakang
    public int addLast(Pembeli18 pembeli) {
        nomorUrutTerakhir++;
        NodeAntrian18 newNode = new NodeAntrian18(nomorUrutTerakhir, pembeli);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail; // Sambungkan node baru ke node lama
            tail.next = newNode; // Sambungkan node lama ke node baru
            tail = newNode; // Perbarui tail ke node baru
        }
        return nomorUrutTerakhir;
    }

    // Mengambil dan Menghapus data pembeli dari posisi awal prinsip FIFO
    public NodeAntrian18 removeFirst() {
        if (isEmpty()) {
            return null; // Jika tidak ada data
        }

        NodeAntrian18 nodeDihapus = head; // Simpan referensi node yang akan dihapus

        if (head == tail) { // Jika hanya 1 elemen
            head = null;
            tail = null;
        } else {
            head = head.next; // Geser head ke elemen selanjutnya
            head.prev = null; // Putuskan sambungan ke node lama
        }

        nodeDihapus.next = null;
        return nodeDihapus;
    }

    // Tambah Method
    // Mengambil dan menghapus data pembeli berdasarkan nomor antrian
    public NodeAntrian18 removeByNo(int noAntrian) {
        if (isEmpty()) {
            return null; 
        }

        NodeAntrian18 current = head;
        while (current != null) {
            // Jika nomor antrian ditemukan
            if (current.noAntrian == noAntrian) {
                // Kondisi 1: Jika node yang dihapus adalah head
                if (current == head) {
                    return removeFirst();
                } 
                // Kondisi 2: Jika node yang dihapus adalah tail
                else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } 
                // Kondisi 3: Jika node yang dihapus ada di tengah
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                
                // Putuskan koneksi pointer node yang sudah dihapus
                current.next = null;
                current.prev = null;
                return current;
            }
            current = current.next;
        }
        return null; // Kembalikan null jika nomor antrian tidak ditemukan
    }

    // Menampilkan seluruh isi list
    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian saat ini kosong, ");
            return;
        }

        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");
        System.out.printf("%-12s %-15s %-15s%n", "No Antrian", "Nama", "No HP");

        NodeAntrian18 current = head;
        while (current != null) {
            System.out.printf("%-12d %-15s %-15s%n",
                    current.noAntrian,
                    current.pembeli.namaPembeli,
                    current.pembeli.noHp);
            current = current.next;
        }
    }

    // Mencari referensi node berdasarkan parameter nomor antrian
    public NodeAntrian18 search(int noAntrian) {
        // Pencarian dari node paling awal
        NodeAntrian18 current = head;

        // Pencarian selama pointer saat ini tidak kosong
        while (current != null) {
            if (current.noAntrian == noAntrian)
                return current;
            current = current.next;
        }
        // Kembalikan nilai null jika data tidak ditemukan sampai akhir antrian
        return null;
    }

}
