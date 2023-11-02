package TugasAI.greedybfs;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private String nilai; // Menyimpan nilai dari node

    private List<Node> tetangga; // Menyimpan daftar tetangga (node-node terhubung)

    public Node(String nilai) {
        tetangga = new ArrayList<>(); // Menginisialisasi daftar tetangga sebagai ArrayList kosong
        this.nilai = nilai; // Mengatur nilai dari node saat objek Node dibuat
    }

    public void setNilai(String nilai) {
        this.nilai = nilai; // Mengatur nilai dari node
    }

    public String getNilai() {
        return nilai; // Mengambil nilai dari node
    }

    public void setTetangga(List<Node> tetangga) {
        this.tetangga = tetangga; // Mengatur daftar tetangga
    }

    public List<Node> getTetangga() {
        return tetangga; // Mengambil daftar tetangga
    }

    public void addTetangga(Node node) {
        tetangga.add(node); // Menambahkan node tetangga ke dalam daftar tetangga
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Node) {
            // Memeriksa apakah objek yang dibandingkan adalah instance dari Node
            return ((Node) obj).nilai.equals(this.nilai); // Membandingkan nilai node
        }
        return false; // Mengembalikan false jika objek yang dibandingkan bukan instance dari Node
    }
}
