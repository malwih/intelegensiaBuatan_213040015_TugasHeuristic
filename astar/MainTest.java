package TugasAI.astar;

import TugasAI.astar.AStar;
import TugasAI.astar.AStar;

public class MainTest {
    public static void main(String[] args) {
        // Inisialisasi node-node dalam graf
        Node jakarta = new Node("Jakarta");
        Node bandung = new Node("Bandung");
        Node surabaya = new Node("Surabaya");
        Node semarang = new Node("Semarang");
        Node yogyakarta = new Node("Yogyakarta");
        Node malang = new Node("Malang");
        Node madiun = new Node("Madiun");
        Node solo = new Node("Solo");
        Node probolinggo = new Node("Probolinggo");
        Node bali = new Node("Bali");
        Node lombok = new Node("Lombok");
        Node medan = new Node("Medan");
        Node pekanbaru = new Node("Pekanbaru");
        Node padang = new Node("Padang");
        Node palembang = new Node("Palembang");
        Node pontianak = new Node("Pontianak");
        Node banjarmasin = new Node("Banjarmasin");
        Node makassar = new Node("Makassar");
        Node manado = new Node("Manado");

        // Inisialisasi node-node dengan biaya yang terkait
        NodeUCS jakartaUCS = new NodeUCS(jakarta, 0);
        NodeUCS bandungUCS = new NodeUCS(bandung, 139);
        NodeUCS surabayaUCS = new NodeUCS(surabaya, 446);
        NodeUCS semarangUCS = new NodeUCS(semarang, 317);
        NodeUCS yogyakartaUCS = new NodeUCS(yogyakarta, 385);
        NodeUCS malangUCS = new NodeUCS(malang, 518);
        NodeUCS madiunUCS = new NodeUCS(madiun, 453);
        NodeUCS soloUCS = new NodeUCS(solo, 490);
        NodeUCS probolinggoUCS = new NodeUCS(probolinggo, 518);
        NodeUCS baliUCS = new NodeUCS(bali, 665);
        NodeUCS lombokUCS = new NodeUCS(lombok, 819);
        NodeUCS medanUCS = new NodeUCS(medan, 1650);
        NodeUCS pekanbaruUCS = new NodeUCS(pekanbaru, 1535);
        NodeUCS padangUCS = new NodeUCS(padang, 1271);
        NodeUCS palembangUCS = new NodeUCS(palembang, 1075);
        NodeUCS pontianakUCS = new NodeUCS(pontianak, 727);
        NodeUCS banjarmasinUCS = new NodeUCS(banjarmasin, 921);
        NodeUCS makassarUCS = new NodeUCS(makassar, 1303);
        NodeUCS manadoUCS = new NodeUCS(manado, 1675);

        // Menambahkan tetangga untuk masing-masing node dengan menggunakan metode addTetangga
        jakartaUCS.addTetangga(bandungUCS, 139);

        bandungUCS.addTetangga(jakartaUCS, 139);
        bandungUCS.addTetangga(semarangUCS, 203);
        bandungUCS.addTetangga(surabayaUCS, 353);

        surabayaUCS.addTetangga(bandungUCS, 353);
        surabayaUCS.addTetangga(malangUCS, 124);

        semarangUCS.addTetangga(bandungUCS, 203);
        semarangUCS.addTetangga(yogyakartaUCS, 129);
        semarangUCS.addTetangga(soloUCS, 72);
        semarangUCS.addTetangga(madiunUCS, 79);

        yogyakartaUCS.addTetangga(semarangUCS, 129);
        yogyakartaUCS.addTetangga(soloUCS, 59);

        malangUCS.addTetangga(surabayaUCS, 124);
        malangUCS.addTetangga(probolinggoUCS, 60);

        madiunUCS.addTetangga(semarangUCS, 79);
        madiunUCS.addTetangga(soloUCS, 36);

        soloUCS.addTetangga(yogyakartaUCS, 59);
        soloUCS.addTetangga(semarangUCS, 72);
        soloUCS.addTetangga(madiunUCS, 36);

        probolinggoUCS.addTetangga(malangUCS, 60);

        // Menampilkan hasil dari algoritma AStarSearch
        System.out.println("A*");
        // Membuat objek AStarSearch
        AStar aStar = new AStar();
        // Memanggil metode search pada objek aStar dengan "Jakarta" sebagai node awal dan "Surabaya" sebagai tujuan
        aStar.search(jakartaUCS, surabayaUCS);
        // Mencetak baris kosong
        System.out.println();
    }
}
