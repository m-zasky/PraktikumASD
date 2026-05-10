public class SingleLinkedList18 {

    NodeMahasiswa18 head; // Penanda node paling depan
    NodeMahasiswa18 tail; // penanda node paling belakang

    // cek apakah list masih kosong
    boolean isEmpty() {
        return (head == null);
    }

    // menampilkan semua isi list
    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa18 tmp = head;
            System.out.println("Isi Linked List:\t ");
            while (tmp != null) { // selama belum mencapai ujung list
                tmp.data.tampilInformasi(); // cetak data di node saat ini
                tmp = tmp.next; // geser ke node berikutnya
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong"); // jika head == null
        }

    }

    // Menambah node di posisi paling depan
    public void addFirst(Mahasiswa18 input) {
        // buat node baru (null = belum menunjuk siapapun)
        NodeMahasiswa18 ndInput = new NodeMahasiswa18(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }

    }

    // Menambah node di posisi paling belakang
    public void addLast(Mahasiswa18 input) {
        //pointer next bernilai null (karena akan jadi yang terakhir)
        NodeMahasiswa18 ndInput = new NodeMahasiswa18(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    // Method InsertAfter
    public void InsertAfter(String key, Mahasiswa18 input) {
        NodeMahasiswa18 ndInput = new NodeMahasiswa18(input, null);
        NodeMahasiswa18 temp = head;

        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    // Method penambahan node pada indeks tertentu
    public void insertAt(int index, Mahasiswa18 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa18 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa18(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
