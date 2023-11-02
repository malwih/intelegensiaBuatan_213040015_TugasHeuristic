package TugasAI.greedybfs;

import TugasAI.greedybfs.GreedyBestFirstSearch;
import TugasAI.greedybfs.GreedyBestFirstSearch;

public class MainTest {

    public static void main(String[] args) {
        // Inisialisasi node-node dalam graf
        Node jakarta = new Node("Jakarta");
        Node baliu = new Node("Baliu");
        Node surabaya = new Node("Surabaya");
        Node semarang = new Node("Semarang");
        Node bandung = new Node("Bandung");
        Node yogyakarta = new Node("Yogyakarta");
        Node malang = new Node("Malang");
        Node banyuwangi = new Node("Banyuwangi");
        Node solo = new Node("Solo");
        Node maluku = new Node("Maluku");
        Node papua = new Node("Papua");
        Node kalimantan = new Node("Kalimantan");
        Node sulawesi = new Node("Sulawesi");
        Node sumatra = new Node("Sumatra");
        Node lombok = new Node("Lombok");
        Node timor = new Node("Timor");
        Node ambon = new Node("Ambon");

        // Inisialisasi node-node dengan biaya yang terkait
        NodeUCS jakartaUCS = new NodeUCS(jakarta, 366);
        NodeUCS baliuUCS = new NodeUCS(baliu, 0);
        NodeUCS surabayaUCS = new NodeUCS(surabaya, 160);
        NodeUCS semarangUCS = new NodeUCS(semarang, 242);
        NodeUCS bandungUCS = new NodeUCS(bandung, 161);
        NodeUCS yogyakartaUCS = new NodeUCS(yogyakarta, 176);
        NodeUCS malangUCS = new NodeUCS(malang, 77);
        NodeUCS banyuwangiUCS = new NodeUCS(banyuwangi, 151);
        NodeUCS soloUCS = new NodeUCS(solo, 226);
        NodeUCS malukuUCS = new NodeUCS(maluku, 244);
        NodeUCS papuaUCS = new NodeUCS(papua, 241);
        NodeUCS kalimantanUCS = new NodeUCS(kalimantan, 234);
        NodeUCS sulawesiUCS = new NodeUCS(sulawesi, 380);
        NodeUCS sumatraUCS = new NodeUCS(sumatra, 10);
        NodeUCS lombokUCS = new NodeUCS(lombok, 193);
        NodeUCS timorUCS = new NodeUCS(timor, 253);
        NodeUCS ambonUCS = new NodeUCS(ambon, 329);

        // Menambahkan tetangga untuk masing-masing node dengan menggunakan metode addTetangga
        jakartaUCS.addTetangga(baliuUCS);
        jakartaUCS.addTetangga(surabayaUCS);
        jakartaUCS.addTetangga(semarangUCS);

        baliuUCS.addTetangga(malukuUCS);
        baliuUCS.addTetangga(papuaUCS);
        baliuUCS.addTetangga(kalimantanUCS);
        baliuUCS.addTetangga(sulawesiUCS);

        surabayaUCS.addTetangga(banyuwangiUCS);
        surabayaUCS.addTetangga(malangUCS);
        surabayaUCS.addTetangga(bandungUCS);
        surabayaUCS.addTetangga(yogyakartaUCS);

        semarangUCS.addTetangga(soloUCS);
        semarangUCS.addTetangga(yogyakartaUCS);

        bandungUCS.addTetangga(jakartaUCS);
        bandungUCS.addTetangga(sumatraUCS);

        yogyakartaUCS.addTetangga(soloUCS);
        yogyakartaUCS.addTetangga(jakartaUCS);

        malangUCS.addTetangga(surabayaUCS);
        malangUCS.addTetangga(banyuwangiUCS);

        banyuwangiUCS.addTetangga(surabayaUCS);
        banyuwangiUCS.addTetangga(malangUCS);

        soloUCS.addTetangga(semarangUCS);
        soloUCS.addTetangga(yogyakartaUCS);

        malukuUCS.addTetangga(baliuUCS);
        malukuUCS.addTetangga(papuaUCS);

        papuaUCS.addTetangga(baliuUCS);
        papuaUCS.addTetangga(malukuUCS);

        kalimantanUCS.addTetangga(baliuUCS);
        kalimantanUCS.addTetangga(sulawesiUCS);

        sulawesiUCS.addTetangga(baliuUCS);
        sulawesiUCS.addTetangga(kalimantanUCS);

        sumatraUCS.addTetangga(jakartaUCS);
        sumatraUCS.addTetangga(bandungUCS);

        lombokUCS.addTetangga(baliuUCS);

        timorUCS.addTetangga(kalimantanUCS);

        ambonUCS.addTetangga(malukuUCS);

        // Menampilkan hasil dari algoritma Greedy Best First Search
        System.out.println("Greedy BFS");
        // Membuat objek GreedyBestFirstSearch
        GreedyBestFirstSearch bfs = new GreedyBestFirstSearch();
        // Memanggil metode search pada objek bfs dengan "Jakarta" sebagai node awal dan "Baliu" sebagai tujuan
        bfs.search(jakartaUCS, baliuUCS);
        // Mencetak baris kosong
        System.out.println();
    }
}
