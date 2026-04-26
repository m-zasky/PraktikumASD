public class StackTugasMahasiswa18 {
    // Deklarrasi
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
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    // Method isEmpty
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    // Method push
    public void push(Mahasiswa18 mhs) {
        if (isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambah tugas lagi.");
        }
    }

    // Method pop
    public Mahasiswa18 pop() {
        if (isEmpty()) {
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
        if (isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    // Method Print
    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

}
