public class StackSurat18 {
    Surat18[] tumpukan;
    int size, top;

    public StackSurat18(int size) {
        this.size = size;
        this.tumpukan = new Surat18[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat18 s) {
        if (!isFull()) {
            top++;
            tumpukan[top] = s;
        } else {
            System.out.println("Stack Penuh! Tidak bisa menerima surat lagi.");
        }
    }

    public Surat18 pop() {
        if (!isEmpty()) {
            Surat18 s = tumpukan[top];
            top--;
            return s;
        } else {
            System.out.println("Stack Kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat18 peek() {
        return !isEmpty() ? tumpukan[top] : null;
    }

    //  Cari Surat berdasarkan nama 
    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (tumpukan[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan pada posisi tumpukan ke-" + (top - i + 1));
                System.out.println("ID: " + tumpukan[i].idSurat + ", Nama: " + tumpukan[i].namaMahasiswa);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama '" + nama + "' tidak ditemukan.");
        }
    }
}