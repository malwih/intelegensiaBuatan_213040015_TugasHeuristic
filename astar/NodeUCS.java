package TugasAI.astar;

import TugasAI.astar.Node; // Mengimpor kelas Node dari paket yang sama
import java.util.ArrayList;
import java.util.List;

public class NodeUCS {
   
    private String nilai;
    private int cost;
    public boolean isVisited; // Menandai apakah simpul sudah dikunjungi
    
    private List<NodeUCS> tetangga; // Daftar tetangga simpul
    private List<Integer> tetanggaCost; // Daftar biaya ke tetangga

    public NodeUCS(Node node, int cost) {
        // Konstruktor NodeUCS untuk inisialisasi objek NodeUCS dengan nilai dan biaya yang diberikan.
        this.nilai = node.getNilai(); // Mengambil nilai dari objek Node yang diberikan
        this.cost = cost; // Mengatur biaya simpul

        tetangga = new ArrayList<>(); // Inisialisasi daftar tetangga sebagai ArrayList kosong
        tetanggaCost = new ArrayList<>(); // Inisialisasi daftar biaya tetangga sebagai ArrayList kosong
    }

    public String getNilai() {
        // Metode untuk mendapatkan nilai simpul.
        return nilai;
    }

    public void setNilai(String nilai) {
        // Metode untuk mengatur nilai simpul.
        this.nilai = nilai;
    }

    public void setCost(int cost) {
        // Metode untuk mengatur biaya simpul.
        this.cost = cost;
    }

    public int getCost() {
        // Metode untuk mendapatkan biaya simpul.
        return cost;
    }

    public void setTetangga(List<NodeUCS> tetangga, List<Integer> tetanggaCost) {
        // Metode untuk mengatur daftar tetangga simpul beserta daftar biaya ke tetangga tersebut.
        this.tetangga = tetangga;
        this.tetanggaCost = tetanggaCost;
    }

    public List<NodeUCS> getTetangga() {
        // Metode untuk mendapatkan daftar tetangga simpul.
        return tetangga;
    }

    public List<Integer> getTetanggaCost() {
        // Metode untuk mendapatkan daftar biaya ke tetangga simpul.
        return tetanggaCost;
    }

    public void addTetangga(NodeUCS node, int cost) {
        // Metode untuk menambahkan simpul sebagai tetangga simpul ini dengan biaya yang diberikan.
        tetangga.add(node);
        tetanggaCost.add(cost);
    }

    @Override
    public boolean equals(Object obj) {
        // Metode override untuk memeriksa apakah dua objek NodeUCS sama berdasarkan nilai.
        if (obj instanceof NodeUCS) {
            return ((NodeUCS) obj).nilai.equals(this.nilai);
        }
        return false;
    }
}
