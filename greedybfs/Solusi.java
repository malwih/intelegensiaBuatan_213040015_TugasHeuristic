package TugasAI.greedybfs;

import TugasAI.greedybfs.NodeUCS; // Import kelas NodeUCS yang digunakan dalam kelas ini
import TugasAI.greedybfs.NodeUCS;
import java.util.ArrayList;
import java.util.List;

public class Solusi {

    private List<NodeUCS> nodes; // Menyimpan daftar simpul (nodes) dalam solusi

    private NodeUCS node; // Menyimpan simpul (node) dalam solusi

    public Solusi() {
        nodes = new ArrayList<>(); // Menginisialisasi daftar simpul sebagai ArrayList kosong
    }

    public void setNode(NodeUCS node) {
        this.node = node; // Mengatur simpul (node) dalam solusi
    }

    public NodeUCS getNode() {
        return node; // Mengambil simpul (node) dalam solusi
    }

    public void setNodes(List<NodeUCS> nodes) {
        this.nodes = new ArrayList<>(nodes); // Mengatur daftar simpul dalam solusi dengan mengkopi dari daftar yang diberikan
    }

    public List<NodeUCS> getNodes() {
        return nodes; // Mengambil daftar simpul dalam solusi
    }
}
