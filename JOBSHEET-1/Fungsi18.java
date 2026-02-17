public class Fungsi18 {
    // tabelcabang dan stock bunga
    static int[][] stock = {
        {10, 5, 15, 7}, // Aglonema, Keladi, Alocasia, Mawar
        {11, 6, 9, 12},
        {10, 2, 10, 5},
        {5, 7, 12, 9}
    };

    // rincian harga
    static int[] harga = {75000, 50000, 60000, 10000};

    // fungsi untuk menampilkan pendapatan
    public static void hitungPendapatan() {
        for (int i = 0; i < stock.length; i++) {
            int total = 0;
            for (int j = 0; j < stock[i].length; j++) {
                total += stock[i][j] * harga[j];
            }

            // status pendapatan
            String status = (total > 1500000) ? "Sangat Baik" : "Perlu Evaluasi";
            System.out.println("RoyalGarden " + (i+1) + ": Rp." + total + " (" + status + ")");
        }
    }

    public static void main(String[] args) {
        System.out.println("Status Pendapatan Cabang:");
        hitungPendapatan();
    }
}
