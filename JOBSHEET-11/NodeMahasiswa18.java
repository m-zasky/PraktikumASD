public class NodeMahasiswa18 {

    Mahasiswa18 data; // Menyimpan data mahasiswa
    NodeMahasiswa18 next; // Menyimpan alamat node selanjutnya 

    // Konstrukror untuk membuat node baru
    public NodeMahasiswa18(Mahasiswa18 data, NodeMahasiswa18 next) {
        this.data = data; //Isi data mahasiswanya
        this.next = next; //Hubungkan ke node berikutnya
    }
    
}