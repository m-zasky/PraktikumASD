import java.util.Scanner;

public class DosenDemo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen18[] arrayOfDosen18 = new Dosen18[3];
        String kode, nama, jkInput, dummy;
        int usia;
        boolean jk;

        // Input Data menggunakan FOR
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode                       : ");
            kode = sc.nextLine();
            System.out.print("Nama                       : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            jkInput = sc.nextLine();
            jk = jkInput.equalsIgnoreCase("Pria");
            System.out.print("Usia                       : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("-----------------------------");

            arrayOfDosen18[i] = new Dosen18(kode, nama, jk, usia);
        }

        // Menampilkan Data menggunakan FOREACH
        int counter = 1;
        for (Dosen18 d : arrayOfDosen18) {
            System.out.println("Data Dosen ke-" + counter);
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + (d.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + d.usia);
            System.out.println("-----------------------------");
            counter++;
        }

        // Memanggil SEMUA method dari class DataDosen18
        // a. Menampilkan semua data
        DataDosen18.dataSemuaDosen(arrayOfDosen18);

        // b. Menampilkan jumlah dosen per jenis kelamin
        DataDosen18.jumlahDosenPerJenisKelamin(arrayOfDosen18);

        // c. Menampilkan rata-rata usia per jenis kelamin
        DataDosen18.rerataUsiaDosenPerJenisKelamin(arrayOfDosen18);

        // d. Menampilkan info dosen paling tua
        DataDosen18.infoDosenPalingTua(arrayOfDosen18);

        // e. Menampilkan info dosen paling muda
        DataDosen18.infoDosenPalingMuda(arrayOfDosen18);

        sc.close();
    }
}
