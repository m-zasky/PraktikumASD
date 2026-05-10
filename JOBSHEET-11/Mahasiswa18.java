public class Mahasiswa18 {

    // Deklarasi
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa18() {

    }

    public Mahasiswa18(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    // Mencetak informasi mahasiswa dalam satu baris dengan format rata kiri
    public void tampilInformasi() {
        System.out.printf("%-10s %-15s %-5s %.1f%n", nama, nim, kelas, ipk);
    }

}