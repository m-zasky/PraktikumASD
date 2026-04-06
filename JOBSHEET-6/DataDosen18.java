public class DataDosen18 {
    public Dosen18[] dataDosen = new Dosen18[10];
    public int idx = 0;

    public void tambah(Dosen18 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
            System.out.println("Data berhasil ditambahkan.");
        } else {
            System.out.println("Kapasitas penuh!");
        }
    }

    public void tampil() {
        if (idx == 0) {
            System.out.println("Data kosong.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    // Bubble Sort - Ascending (Termuda ke Tertua)
    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen18 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan (ASC) via Bubble Sort.");
    }

    // Insertion Sort - Descending (Tertua ke Termuda)
    public void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen18 key = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia < key.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j = j - 1;
            }
            dataDosen[j + 1] = key;
        }
        System.out.println("Data berhasil diurutkan (DSC) via Insertion Sort.");
    }

    // Alias untuk memenuhi diagram
    public void sortingDSC() {
        insertionSort();
    }
}