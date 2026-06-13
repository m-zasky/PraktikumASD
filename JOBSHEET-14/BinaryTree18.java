public class BinaryTree18 {
    Node18 root;

    public BinaryTree18() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa18 mahasiswa) {
        Node18 newNode = new Node18(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node18 current = root;
            Node18 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node18 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node18 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node18 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node18 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node18 getSuccessor(Node18 del) {
        Node18 successor = del.right;
        Node18 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        // Cari node (current) yang akan dihapus
        Node18 parent = root;
        Node18 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        // Penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            // jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { // Jika hanya punya 1 anak (kanan)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { // Jika hanya punya 1 anak (kiri)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { // Jika punya 2 anak
                Node18 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    // 1. Menambahkan Method addRekrusif
    public void addRekursif(Mahasiswa18 mahasiswa) {
        root = addRekursif(root, mahasiswa);
    }

    Node18 addRekursif(Node18 current, Mahasiswa18 mahasiswa) {
        if (current == null) {
            return new Node18(mahasiswa); // Jika tempat kosong, buat node baru
        }

        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, mahasiswa);
        } else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            current.right = addRekursif(current.right, mahasiswa);
        }
        
        return current;
    }

    // 2. Tambah Method MinMax
    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node18 current = root;
        // Terus bergerak ke kiri sampai mentok
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("\nMahasiswa dengan IPK Terkecil:");
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node18 current = root;
        // Terus bergerak ke kanan sampai mentok
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("\nMahasiswa dengan IPK Terbesar:");
        current.mahasiswa.tampilInformasi();
    }
    
    // 3. Tambah Method IPK diatas batas tertentu
    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("\nDaftar Mahasiswa dengan IPK > " + ipkBatas + ":");
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }

    void tampilMahasiswaIPKdiAtas(Node18 node, double ipkBatas) {
        if (node != null) {
            // Traverse InOrder supaya tampil urut dari IPK terkecil
            tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
            
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            
            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }
}
