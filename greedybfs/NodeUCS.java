package TugasAI.greedybfs;

import TugasAI.greedybfs.Node; // Import kelas Node yang digunakan dalam kelas ini
import java.util.ArrayList;
import java.util.List;

public class NodeUCS {

    private String nilai; // Menyimpan nilai dari node

    private int cost; // Menyimpan biaya (cost) yang terkait dengan node ini

    private List<NodeUCS> tetangga; // Menyimpan daftar tetangga (node-node terhubung)

    public NodeUCS(Node node, int cost) {
        this.nilai = node.getNilai(); // Mengambil nilai dari node yang diberikan
        this.cost = cost; // Mengatur biaya (cost) dari node ini
        tetangga = new ArrayList<>(); // Menginisialisasi daftar tetangga sebagai ArrayList kosong
    }

    public String getNilai() {
        return nilai; // Mengambil nilai dari node
    }

    public void setNilai(String nilai) {
        this.nilai = nilai; // Mengatur nilai dari node
    }

    public void setCost(int cost) {
        this.cost = cost; // Mengatur biaya (cost) dari node
    }

    public int getCost() {
        return cost; // Mengambil biaya (cost) dari node
    }

    public void setTetangga(List<NodeUCS> tetangga) {
        this.tetangga = tetangga; // Mengatur daftar tetangga
    }

    public List<NodeUCS> getTetangga() {
        return tetangga; // Mengambil daftar tetangga
    }

    public void addTetangga(NodeUCS node) {
        tetangga.add(node); // Menambahkan node tetangga ke dalam daftar tetangga
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NodeUCS) {
            // Memeriksa apakah objek yang dibandingkan adalah instance dari NodeUCS
            return ((NodeUCS) obj).nilai.equals(this.nilai); // Membandingkan nilai node
        }
        return false; // Mengembalikan false jika objek yang dibandingkan bukan instance dari NodeUCS
    }
}
