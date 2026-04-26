public class StackTugasMahasiswa18 {
    // Deklarasi
    Mahasiswa18[] stack;
    int size, top;

    // Konstruktor
    public StackTugasMahasiswa18(int size) {
        this.size = size;
        stack = new Mahasiswa18[size];
        top = -1;
    }

    // Method isFull
    public boolean isFull() {
        return top == size - 1;
    }

    // Method isEmpty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method push
    public void push(Mahasiswa18 mhs) {
        // PERBAIKAN: Gunakan tanda seru (!) untuk mengecek jika TIDAK penuh
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambah tugas lagi.");
        }
    }

    // Method pop
    public Mahasiswa18 pop() {
        // PERBAIKAN: Gunakan tanda seru (!) untuk mengecek jika TIDAK kosong
        if (!isEmpty()) {
            Mahasiswa18 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    // Method peek
    public Mahasiswa18 peek() {
        // PERBAIKAN: Gunakan tanda seru (!) untuk mengecek jika TIDAK kosong
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    // Method Print
    public void print() {
        // PERBAIKAN SOAL-1: Sudah benar menggunakan iterasi mundur
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    // Perbaikan soal no-4
    public Mahasiswa18 peekBottom() {
        if (!isEmpty()) {
            return stack[0]; // Indeks 0 adalah data pertama yang dimasukkan (paling bawah)
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    // Perbaikan soal no-5
    public int count() {
        return top + 1; // Karena top dimulai dari -1, maka jumlah data adalah top + 1
    }

    // Method KonversiDesimalKeBiner
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi18 stack = new StackKonversi18(); // Memanggil Stack khusus biner

        // Alur kerja: Mencari sisa bagi dengan 2 dan memasukkannya ke Stack
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }

        String biner = "";
        // Mengambil data dari Stack sehingga urutan biner benar
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

}