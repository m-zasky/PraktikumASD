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
}