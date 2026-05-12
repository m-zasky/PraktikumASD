public class DoubleLinkedList18 {
    Node18 head; // Menunjuk ke node pertama
    Node18 tail; // Menunjuk ke node terakhir

    public DoubleLinkedList18() {
        head = null; // Kondisi awal list kosong
        tail = null;
    }

    // Mengecek apakah list masih kosong
    public boolean isEmpty() {
        return head == null;
    }

    // Menambah data di posisi paling depan
    public void addFirst(Mahasiswa18 data) {
        Node18 newNode = new Node18(data);
        if (isEmpty()) {
            head = tail = newNode; // Jika kosong, head dan tail menunjuk node yang sama
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Menambah data di posisi paling belakang
    public void addLast(Mahasiswa18 data) {
        Node18 newNode = new Node18(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Menyisipkan data setelah node, dengan NIM tertentu
    public void insertAfter(String keyNim, Mahasiswa18 data) {
        Node18 current = head;
        // Mencari node yang NIM nya cocok
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + "tidak ditemukan");
            return;
        }

        Node18 newNode = new Node18(data);
        if (current == tail) {
            addLast(data); // Jika ketemu di akhir
        } else {
            // Proses penyisipan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    // Menampilkan semua data dari depan ke belakang
    public void print() {
        if (isEmpty()) {
            // modif menampilkan pesan ketika data kosong
            System.out.println("Linked List masih kosong.  ");
            return;
        }
        Node18 current = head;
        while (current != null) {
            current.data.tampil(); // Memanggil method tampil
            System.out.println("---------------------------");
            current = current.next;
        }
    }

    // Penambahan Method Print Reverse
    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node18 current = tail; // Mulai dari ekor
        while (current != null) {
            current.data.tampil();
            System.out.println("-----------------------------------");
            current = current.prev; // Bergerak mundur ke node sebelumnya
        }
    }

    // Method removeFirst dengan tampilan data yang dihapus
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong.");
            return;
        }

        // --- Menampilkan data yang dihapus ---
        System.out.println("Data yang berhasil dihapus:");
        tail.data.tampil();
        System.out.println("--------------------");

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Method removeLast dengan tampilan data yang dihapus
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong.");
            return;
        }

        // --- Menampilkan data yang dihapus ---
        System.out.println("Data yang berhasil dihapus:");
        head.data.tampil();
        System.out.println("--------------------");

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

}
