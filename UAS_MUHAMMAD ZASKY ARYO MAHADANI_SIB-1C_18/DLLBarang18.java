public class DLLBarang18 {
    NodeBarang18 head18;
    NodeBarang18 tail18; 

    // Cek apakah list kosong
    public boolean isEmpty18() {
        return head18 == null;
    }

    // Tambah data barang di posisi paling depan
    public void addFirst18(Barang18 brg18) {
        if (isEmpty18()) {
            head18 = new NodeBarang18(null, brg18, null);
            tail18 = head18;
        } else {
            NodeBarang18 newNode18 = new NodeBarang18(null, brg18, head18);
            head18.prev18 = newNode18;
            head18 = newNode18;
        }
    }

    // Tambah data barang di posisi paling belakang
    public void addLast18(Barang18 brg18) {
        if (isEmpty18()) {
            addFirst18(brg18); 
        } else {
            NodeBarang18 newNode18 = new NodeBarang18(tail18, brg18, null);
            tail18.next18 = newNode18;
            tail18 = newNode18;
        }
    }

    // Menghapus data barang di posisi paling depan
    public void removeFirst18() {
        if (isEmpty18()) {
            System.out.println("Data Barang Kosong!");
            return;
        }
        if (head18 == tail18) { // Jika hanya ada 1 data
            head18 = tail18 = null;
        } else {
            head18 = head18.next18;
            head18.prev18 = null;
        }
    }

    // Menghapus data barang di posisi paling belakang
    public void removeLast18() {
        if (isEmpty18()) {
            System.out.println("Data Barang Kosong!");
            return;
        }
        if (head18 == tail18) {
            head18 = tail18 = null;
        } else {
            tail18 = tail18.prev18;
            tail18.next18 = null;
        }
    }

    // Mencari barang berdasarkan kode
    public Barang18 cariBarang18(String kode18) {
        NodeBarang18 current18 = head18;
        while (current18 != null) {
            if (current18.data18.getKode18().equalsIgnoreCase(kode18)) {
                return current18.data18;
            }
            current18 = current18.next18;
        }
        return null;
    }

    // Menampilkan seluruh isi list dari depan ke belakang
    public void tampilkanBarang18() {
        System.out.println("              DAFTAR BARANG               ");
        System.out.println("==========================================");
        System.out.printf("%-10s %-20s %-10s %-5s\n", "KODE", "NAMA BARANG", "HARGA", "STOK");

        NodeBarang18 current18 = head18;
        while (current18 != null) {
            System.out.printf("%-10s %-20s %-10.0f %-5d\n",
                    current18.data18.getKode18(),
                    current18.data18.getNama18(),
                    current18.data18.getHarga18(),
                    current18.data18.getStok18());
            current18 = current18.next18;
        }
        System.out.println("==========================================");
    }
}