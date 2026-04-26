import java.util.Scanner;

public class SuratDemo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat18 stack = new StackSurat18(10); // Kapasitas 10 surat
        int pilih;

        do {
            System.out.println("\n--- MENU LAYANAN SURAT IZIN ---");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat (Berdasarkan Nama)");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kls = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jns = sc.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int dur = sc.nextInt();
                    stack.push(new Surat18(id, nama, kls, jns, dur));
                    break;

                case 2:
                    Surat18 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat " + diproses.idSurat + " milik " + diproses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat18 teratas = stack.peek();
                    if (teratas != null) {
                        System.out.println(
                                "Surat terakhir masuk: " + teratas.namaMahasiswa + " (" + teratas.idSurat + ")");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan Nama Mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    stack.cariSurat(cariNama);
                    break;
            }
        } while (pilih != 5);

        sc.close();
    }
}