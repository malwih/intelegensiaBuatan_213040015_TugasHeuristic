package TugasAI.astar;

import java.util.ArrayList;
import java.util.List;

public class Node {
  
    private String nilai;
    private List<Node> tetangga;

    public Node(String nilai) {
        // Konstruktor Node untuk inisialisasi objek Node dengan nilai yang diberikan.
        // Inisialisasi daftar tetangga sebagai ArrayList kosong.
        this.nilai = nilai;
        tetangga = new ArrayList<>();
    }

    public void setNilai(String nilai) {
        // Metode untuk mengatur nilai Node.
        this.nilai = nilai;
    }

    public String getNilai() {
        // Metode untuk mendapatkan nilai Node.
        return nilai;
    }

    public void setTetangga(List<Node> tetangga) {
        // Metode untuk mengatur daftar tetangga Node.
        this.tetangga = tetangga;
    }

    public List<Node> getTetangga() {
        // Metode untuk mendapatkan daftar tetangga Node.
        return tetangga;
    }

    public void addTetangga(Node node) {
        // Metode untuk menambahkan Node sebagai tetangga Node saat ini.
        tetangga.add(node);
    }

    @Override
    public boolean equals(Object obj) {
        // Metode override untuk memeriksa apakah dua objek Node sama.
        if (obj instanceof Node) {
            // Jika objek yang dibandingkan adalah Node, maka memeriksa kesamaan nilai.
            return ((Node) obj).nilai.equals(this.nilai);
        }
        // Jika objek yang dibandingkan bukan Node, maka mengembalikan false.
        return false;
    }
}
