public class DoubleLinkedList18 {
    Node18 head; // Menunjuk ke node pertama
    Node18 tail; // Menunjuk ke node terakhir
    int size; // Atribut untuk menyimpan jumlah data (Tugas No. 5)

    public DoubleLinkedList18() {
        head = null;
        tail = null;
        size = 0; // Inisialisasi size
    }

    // Mengecek apakah list masih kosong
    public boolean isEmpty() {
        return head == null;
    }

    // ===================== METHOD SIZE (Tugas No. 5) =====================
    // Mengembalikan jumlah data dalam Double Linked List
    public int size() {
        return size;
    }

    // Menambah data di posisi paling depan
    public void addFirst(Mahasiswa18 data) {
        Node18 newNode = new Node18(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++; // Tambah size setiap kali node ditambahkan
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
        size++; // Tambah size setiap kali node ditambahkan
    }

    // ===================== TUGAS NO. 1 =====================
    // Menambahkan node pada indeks tertentu
    public void add(int index, Mahasiswa18 data) {
        // Validasi indeks
        if (index < 0 || index > size) {
            System.out.println("Indeks " + index + " tidak valid. Ukuran list saat ini: " + size);
            return;
        }

        // Jika indeks 0, tambahkan di depan
        if (index == 0) {
            addFirst(data);
            return;
        }

        // Jika indeks sama dengan size, tambahkan di belakang
        if (index == size) {
            addLast(data);
            return;
        }

        // Sisipkan di tengah: cari node pada posisi index-1
        Node18 current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        // Lakukan penyisipan setelah node 'current'
        Node18 newNode = new Node18(data);
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        size++; // Tambah size
    }

    // Menyisipkan data setelah node dengan NIM tertentu
    public void insertAfter(String keyNim, Mahasiswa18 data) {
        Node18 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }

        if (current == tail) {
            addLast(data);
        } else {
            Node18 newNode = new Node18(data);
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
            size++; // Tambah size
        }
    }

    // ===================== TUGAS NO. 2 =====================
    // Menghapus node setelah node yang memiliki data key (NIM) tertentu
    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        // Cari node dengan NIM yang cocok
        Node18 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        // Jika NIM tidak ditemukan
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        // Jika node ditemukan adalah tail, tidak ada node setelahnya
        if (current == tail || current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim + ".");
            return;
        }

        // Node yang akan dihapus adalah node setelah 'current'
        Node18 toDelete = current.next;
        System.out.println("Data yang berhasil dihapus:");
        toDelete.data.tampil();
        System.out.println("--------------------");

        // Jika node yang dihapus adalah tail
        if (toDelete == tail) {
            current.next = null;
            tail = current;
        } else {
            current.next = toDelete.next;
            toDelete.next.prev = current;
        }

        toDelete.next = null;
        toDelete.prev = null;
        size--; // Kurangi size
    }

    // ===================== TUGAS NO. 3 =====================
    // Menghapus node pada indeks tertentu
    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        // Validasi indeks
        if (index < 0 || index >= size) {
            System.out.println("Indeks " + index + " tidak valid. Ukuran list saat ini: " + size);
            return;
        }

        // Jika menghapus node pertama
        if (index == 0) {
            System.out.println("Data yang berhasil dihapus:");
            head.data.tampil();
            System.out.println("--------------------");
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
            return;
        }

        // Jika menghapus node terakhir
        if (index == size - 1) {
            System.out.println("Data yang berhasil dihapus:");
            tail.data.tampil();
            System.out.println("--------------------");
            tail = tail.prev;
            tail.next = null;
            size--;
            return;
        }

        // Menghapus node di tengah: traversal ke indeks yang dituju
        Node18 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        System.out.println("Data yang berhasil dihapus:");
        current.data.tampil();
        System.out.println("--------------------");

        current.prev.next = current.next;
        current.next.prev = current.prev;
        current.next = null;
        current.prev = null;
        size--; // Kurangi size
    }

    // ===================== TUGAS NO. 4 =====================
    // a. Menampilkan data pada node pertama
    public Mahasiswa18 getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak ada data pertama.");
            return null;
        }
        return head.data;
    }

    // b. Menampilkan data pada node terakhir
    public Mahasiswa18 getLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak ada data terakhir.");
            return null;
        }
        return tail.data;
    }

    // c. Menampilkan data pada node di indeks tertentu
    public Mahasiswa18 getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return null;
        }

        if (index < 0 || index >= size) {
            System.out.println("Indeks " + index + " tidak valid. Ukuran list saat ini: " + size);
            return null;
        }

        Node18 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Menampilkan semua data dari depan ke belakang
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node18 current = head;
        while (current != null) {
            current.data.tampil();
            System.out.println("---------------------------");
            current = current.next;
        }
    }

    // Menampilkan semua data dari belakang ke depan
    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node18 current = tail;
        while (current != null) {
            current.data.tampil();
            System.out.println("-----------------------------------");
            current = current.prev;
        }
    }

    // Method removeFirst
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong.");
            return;
        }
        System.out.println("Data yang berhasil dihapus:");
        head.data.tampil();
        System.out.println("--------------------");
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--; // Kurangi size
    }

    // Method removeLast
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong.");
            return;
        }
        System.out.println("Data yang berhasil dihapus:");
        tail.data.tampil();
        System.out.println("--------------------");
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--; // Kurangi size
    }
}