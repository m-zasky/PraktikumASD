public class PesananDLL18 {
    NodePesanan18 head; // pointer ke node pertama
    NodePesanan18 tail; // pointer ke node terakhir (tambahan DLL)

    public PesananDLL18() {
        head = null;
        tail = null;
    }

    public void tambahPesanan(Pesanan18 pesanan) {
        NodePesanan18 newNode = new NodePesanan18(pesanan);

        if (head == null) {
            // List kosong: head dan tail sama-sama ke node baru
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    void sortByNamaPesanan() {
        if (head == null || head.next == null)
            return; // sudah terurut

        boolean swapped;
        do {
            swapped = false;
            NodePesanan18 current = head;

            while (current.next != null) {
                // Bandingkan nama pesanan (abaikan kapital)
                if (current.pesanan.namaPesanan
                        .compareToIgnoreCase(current.next.pesanan.namaPesanan) > 0) {
                    // Tukar data antar dua node bersebelahan
                    Pesanan18 temp = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped); // ulangi sampai tidak ada pertukaran
    }

    public void cetakLaporan() {
        if (head == null) {
            System.out.println("Belum ada pesanan yang masuk.");
            return;
        }

        sortByNamaPesanan(); // urutkan dulu

        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
        System.out.printf("%-14s %-20s %-10s%n", "Kode Pesanan", "Nama Pesanan", "Harga");

        NodePesanan18 current = head;
        int total = 0;

        while (current != null) {
            System.out.printf("%-14d %-20s %-10d%n",
                    current.pesanan.kodePesanan,
                    current.pesanan.namaPesanan,
                    current.pesanan.harga);
            total += current.pesanan.harga;
            current = current.next;
        }

        System.out.println("--------------------------------------");
        System.out.printf("Total Pendapatan: Rp %,d%n", total);
    }

    // Cek apakah list pesanan masih kosong
    public boolean isEmpty() {
        return head == null;
    }
}