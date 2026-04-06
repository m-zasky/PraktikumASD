public class Dosen18 {
    public String kode;
    public String nama;
    public boolean jenisKelamin; // true: Laki-laki, false: Perempuan
    public int usia;

    public Dosen18(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    public void tampil() {
        String jkStr = (jenisKelamin) ? "Laki-laki" : "Perempuan";
        System.out.println("Kode: " + kode + " | Nama: " + nama +
                " | JK: " + jkStr + " | Usia: " + usia);
    }
}