public class DLLTransaksi18 {
    NodeTransaksi18 head18;
    NodeTransaksi18 tail18;

    // cek apakah list transaksi kosong
    public boolean isEmpty18() {
        return head18 == null;
    }

    // tambah riwayat transaksi di posisi depan
    public void addFirst18(Transaksi18 trx18) {
        if (isEmpty18()) {
            head18 = new NodeTransaksi18(null, trx18, null);
            tail18 = head18;
        } else {
            NodeTransaksi18 newNode18 = new NodeTransaksi18(null, trx18, head18);
            head18.prev18 = newNode18;
            head18 = newNode18;
        }
    }

    // tambah riwayat transaksi di posisi belakang
    public void addLast18(Transaksi18 trx18) {
        if (isEmpty18()) {
            addFirst18(trx18);
        } else {
            NodeTransaksi18 newNode18 = new NodeTransaksi18(tail18, trx18, null);
            tail18.next18 = newNode18;
            tail18 = newNode18;
        }
    }

    // Hapus histori transaksi paling depan
    public void removeFirst18() {
        if (isEmpty18())
            return;
        if (head18 == tail18) {
            head18 = tail18 = null;
        } else {
            head18 = head18.next18;
            head18.prev18 = null;
        }
    }

    // Hapus histori transaksi paling belakang
    public void removeLast18() {
        if (isEmpty18())
            return;
        if (head18 == tail18) {
            head18 = tail18 = null;
        } else {
            tail18 = tail18.prev18;
            tail18.next18 = null;
        }
    }

    // Menampilkan histori transaksi dan menghitung total pendapatan
    public void tampilkanTransaksi18() {
        System.out.println("                      HISTORI TRANSAKSI                        ");
        System.out.println("===============================================================");
        System.out.printf("%-10s %-20s %-10s %-10s %-10s\n", "KODE TRX", "NAMA BARANG", "HARGA/Pcs", "JUMLAH", "TOTAL");

        NodeTransaksi18 current18 = head18;
        double totalPendapatan18 = 0;

        while (current18 != null) {
            System.out.printf("%-10d %-20s %-10.0f %-10d %-10.0f\n",
                    current18.data18.getKodeTransaksi18(),
                    current18.data18.getBarang18().getNama18(),
                    current18.data18.getBarang18().getHarga18(),
                    current18.data18.getJumlahBarang18(),
                    current18.data18.getTotalHarga18());

            totalPendapatan18 += current18.data18.getTotalHarga18();
            current18 = current18.next18;
        }
        System.out.println("---------------------------------------------------------------");

        System.out.println("TOTAL PENDAPATAN : Rp " + (int) totalPendapatan18);
        System.out.println("===============================================================");
    }

    // Algoritma Bubble Sort (urutkan dengan ascending )
    public void urutkanNamaAscending18() {
        if (isEmpty18() || head18.next18 == null) {
            return;
        }
        boolean ditukar18;
        do {
            ditukar18 = false;
            NodeTransaksi18 current18 = head18;

            while (current18.next18 != null) {
                String nama1_18 = current18.data18.getBarang18().getNama18();
                String nama2_18 = current18.next18.data18.getBarang18().getNama18();

                if (nama1_18.compareToIgnoreCase(nama2_18) > 0) {
                    Transaksi18 temp18 = current18.data18;
                    current18.data18 = current18.next18.data18;
                    current18.next18.data18 = temp18;
                    ditukar18 = true;
                }
                current18 = current18.next18;
            }
        } while (ditukar18);

        System.out.println("Data transaksi berhasil diurutkan berdasarkan Nama Barang (Ascending)!");
    }
}