public class PesananDLL18 {
    // Titik awal daftar pesanan
    NodePesanan18 head;
    // Titik akhir daftar pesanan
    NodePesanan18 tail;

    // Konstruktor: Menyiapkan daftar pesanan yang masih kosong
    public PesananDLL18() {
        head = null;
        tail = null;
    }

    // Memeriksa apakah daftar pesanan masih kosong
    public boolean isEmpty() {
        return head == null;
    }

    // Menambahkan pesanan baru ke dalam daftar riwayat pencatatan
    public void addLast(Pesanan18 pesanan) {
        NodePesanan18 newNode = new NodePesanan18(pesanan);

        // Jika daftar kosong, pesanan ini menjadi yang pertama dan terakhir
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            // Kaitkan pesanan baru ke urutan paling akhir
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Mengurutkan daftar pesanan secara alfabetis (A-Z) berdasarkan nama pesanan
    // (Metode Bubble Sort)
    void sortByNamaPesanan() {
        if (isEmpty() || head.next == null)
            return; // Hentikan jika data kosong atau hanya ada 1 data (sudah pasti urut)

        boolean swapped;
        do {
            swapped = false;
            NodePesanan18 current = head; // Mulai dari pesanan pertama

            // Lakukan pengecekan hingga pesanan sebelum terakhir
            while (current.next != null) {
                // Bandingkan huruf awal nama pesanan dengan pesanan di sebelahnya
                if (current.pesanan.namaPesanan.compareToIgnoreCase(current.next.pesanan.namaPesanan) > 0) {

                    // Jika urutan abjad terbalik, tukar isi data pesanannya
                    Pesanan18 temp = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = temp;

                    swapped = true; // Tandai bahwa ada proses pertukaran
                }
                current = current.next; // Lanjut periksa ke pasangan berikutnya
            }
        } while (swapped); // Ulangi terus dari awal selama masih ada data yang tertukar posisinya
    }

    // Menampilkan laporan seluruh pesanan dan menghitung total pendapatan
    public void print() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan yang masuk.");
            return;
        }

        sortByNamaPesanan(); // Pastikan data diurutkan terlebih dahulu sebelum dicetak

        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
        System.out.printf("%-14s %-20s %-10s%n", "Kode Pesanan", "Nama Pesanan", "Harga");

        NodePesanan18 current = head;
        int total = 0; // Variabel penyimpan total uang

        // Telusuri seluruh riwayat pesanan
        while (current != null) {
            System.out.printf("%-14d %-20s %-10d%n",
                    current.pesanan.kodePesanan,
                    current.pesanan.namaPesanan,
                    current.pesanan.harga);

            total += current.pesanan.harga; // Tambahkan harga pesanan ini ke total
            current = current.next;
        }

        System.out.println("--------------------------------------");
        System.out.printf("Total Pendapatan: Rp %,d%n", total);
    }
}