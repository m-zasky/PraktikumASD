public class DataDosen18 {

    // a. Menampilkan semua data
    public static void dataSemuaDosen(Dosen18[] arrayOfDosen18) {
        System.out.println("\n===== DATA SEMUA DOSEN =====");
        for (Dosen18 d : arrayOfDosen18) {
            System.out.println("Kode: " + d.kode + " | Nama: " + d.nama);
        }
    }

    // b. Jumlah dosen per jenis kelamin
    public static void jumlahDosenPerJenisKelamin(Dosen18[] arrayOfDosen18) {
        int pria = 0, wanita = 0;
        for (Dosen18 d : arrayOfDosen18) {
            if (d.jenisKelamin)
                pria++; // Pria diasumsikan true
            else
                wanita++;
        }
        System.out.println("Jumlah Pria: " + pria + ", Wanita: " + wanita);
    }

    // c. Rerata usia per jenis kelamin
    public static void rerataUsiaDosenPerJenisKelamin(Dosen18[] arrayOfDosen18) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jmlP = 0, jmlW = 0;
        for (Dosen18 d : arrayOfDosen18) {
            if (d.jenisKelamin) {
                totalUsiaPria += d.usia;
                jmlP++;
            } else {
                totalUsiaWanita += d.usia;
                jmlW++;
            }
        }
        // Menghindari pembagian dengan nol
        System.out.println("Rerata Usia Pria: " + (jmlP > 0 ? (double) totalUsiaPria / jmlP : 0));
        System.out.println("Rerata Usia Wanita: " + (jmlW > 0 ? (double) totalUsiaWanita / jmlW : 0));
    }

    // d. Dosen Paling Tua
    public static void infoDosenPalingTua(Dosen18[] arrayOfDosen18) {
        Dosen18 tertua = arrayOfDosen18[0];
        for (Dosen18 d : arrayOfDosen18) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }
        System.out.println("Dosen Tertua: " + tertua.nama + " (" + tertua.usia + " tahun)");
    }

    // e. Dosen Paling Muda
    public static void infoDosenPalingMuda(Dosen18[] arrayOfDosen18) {
        Dosen18 termuda = arrayOfDosen18[0];
        for (Dosen18 d : arrayOfDosen18) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }
        System.out.println("Dosen Termuda: " + termuda.nama + " (" + termuda.usia + " tahun)");
    }
}