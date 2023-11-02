package TugasAI.astar;

import TugasAI.astar.NodeUCS; // Mengimpor kelas NodeUCS dari paket yang sama
import java.util.ArrayList;
import java.util.List;

public class Solusi {

    private List<NodeUCS> nodes; // Daftar simpul dalam solusi
    private NodeUCS node; // Simpul tujuan solusi

    public Solusi() {
        // Konstruktor Solusi untuk inisialisasi objek Solusi dengan daftar simpul kosong.
        nodes = new ArrayList<>();
    }

    public void setNode(NodeUCS node) {
        // Metode untuk mengatur simpul tujuan solusi.
        this.node = node;
    }

    public NodeUCS getNode() {
        // Metode untuk mendapatkan simpul tujuan solusi.
        return node;
    }

    public void setNodes(List<NodeUCS> nodes) {
        // Metode untuk mengatur daftar simpul dalam solusi.
        this.nodes = new ArrayList<>(nodes); // Membuat salinan daftar simpul yang diberikan.
    }

    public List<NodeUCS> getNodes() {
        // Metode untuk mendapatkan daftar simpul dalam solusi.
        return nodes;
    }
}
