public class SortingMain18 {
    public static void main(String[] args) {
        int a[] = { 20, 10, 2, 7, 12 };
        int b[] = { 30, 20, 2, 8, 14 };
        int c[] = { 40, 10, 4, 9, 3 };

        Sorting18 dataurut1 = new Sorting18(a, a.length);
        Sorting18 dataurut2 = new Sorting18(b, b.length);
        Sorting18 dataurut3 = new Sorting18(c, c.length);

        // Data1 sebelum diurutkan
        System.out.println("Data awal 1");
        dataurut1.tampil();
        // Data1 setelah diurutkan dengan Bubble sort (ascending)
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASCENDING)");
        dataurut1.tampil();

        System.out.println("===============================");
        System.out.println("===============================");

        // Data2 sebelum diurutkan
        System.out.println("Data awal 2");
        dataurut2.tampil();
        // Data2 setelah diurutkan dengan Selection Sort (ascending)
        dataurut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASCENDING)");
        dataurut2.tampil();

        System.out.println("===============================");
        System.out.println("===============================");

        // Data3 sebelum diurutkan
        System.out.println("Data awal 3");
        dataurut3.tampil();
        // Data3 setelah diurutkan
        dataurut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASCENDING)");
        dataurut3.tampil();
    }

}
