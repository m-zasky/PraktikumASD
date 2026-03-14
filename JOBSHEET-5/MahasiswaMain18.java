public class MahasiswaMain18 {

    public static void main(String[] args) {
        // Data sesuai tabel yang ada pada jobsheet
        Mahasiswa18[] daftarMhs = {
                new Mahasiswa18("Ahmad", 220101001, 2022, 78, 82),
                new Mahasiswa18("Budi", 220101002, 2022, 85, 88),
                new Mahasiswa18("Cindy", 220101003, 2021, 90, 87),
                new Mahasiswa18("Dian", 220101004, 2021, 76, 79),
                new Mahasiswa18("Eko", 220101005, 2023, 92, 95),
                new Mahasiswa18("Fajar", 220101006, 2020, 88, 85),
                new Mahasiswa18("Gina", 220101007, 2023, 80, 83),
                new Mahasiswa18("Hadi", 220101008, 2020, 82, 84)
        };

        NilaiMahasiswa18 hitung = new NilaiMahasiswa18();

        System.out.println("=========================================");
        System.out.println("HASIL PENGOLAHAN NILAI MAHASISWA");
        System.out.println("=========================================");

        // a. UTS Tertinggi (DC)
        int tertinggi = hitung.utsTertinggi(daftarMhs, 0, daftarMhs.length - 1);
        System.out.println("Nilai UTS Tertinggi (DC) : " + tertinggi);

        // b. UTS Terendah (DC)
        int terendah = hitung.utsTerendah(daftarMhs, 0, daftarMhs.length - 1);
        System.out.println("Nilai UTS Terendah (DC) : " + terendah);

        // c. Rata-rata UAS (BF)
        double rata = hitung.rataUAS(daftarMhs);
        System.out.printf("Rata-rata UAS (BF)   : %.2f\n", rata);
        System.out.println("=========================================");

    }

}
