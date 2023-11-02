package TugasAI.greedybfs;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class GreedyBestFirstSearch {

    public void search(NodeUCS start, NodeUCS goal) {

        // Membuat antrian (queue) yang akan digunakan untuk algoritma pencarian
        Queue<Solusi> queue = new LinkedBlockingQueue<>();

        // Membuat objek Solusi yang merepresentasikan jalur awal
        Solusi solusiStart = new Solusi();

        // Mengatur node awal ke dalam objek Solusi
        solusiStart.setNode(start);

        // Memasukkan jalur awal ke dalam antrian
        queue.add(solusiStart);

        // Menampilkan pesan bahwa pencarian dimulai dari node awal ke node tujuan
        System.out.println("Mencari solusi dari " + start.getNilai() + " ke " + goal.getNilai());

        // Memulai loop pencarian selama antrian tidak kosong
        while (!queue.isEmpty()) {
            // Mengambil dan menghapus elemen pertama dari antrian
            Solusi eval = queue.poll();

            // Menampilkan node yang sedang dievaluasi
            System.out.println("Evaluasi: " + eval.getNode().getNilai());

            // Memeriksa apakah node yang dievaluasi adalah node tujuan
            if (eval.getNode().equals(goal)) {
                // Jika ya, solusi ditemukan
                System.out.println("Solusi ditemukan: ");

                // Menampilkan jalur solusi yang ditemukan
                for (NodeUCS node : eval.getNodes()) {
                    System.out.print(node.getNilai() + " -> ");
                }

                System.out.println(eval.getNode().getNilai());

                // Menghentikan pencarian
                break;
            } else {
                // Jika node yang dievaluasi bukan node tujuan

                // Menampilkan pesan bahwa sedang mengevaluasi suksesor dari node saat ini
                System.out.println("Suksesor " + eval.getNode().getNilai());

                // Membuat objek Solusi untuk suksesor
                Solusi solusiSuksesor = new Solusi();

                // Mendefinisikan variabel best untuk memilih suksesor terbaik
                NodeUCS best = null;

                // Inisialisasi nilai minimum dan kedalaman
                int min = Integer.MAX_VALUE;
                int depth = 0;

                // Iterasi melalui tetangga dari node saat ini
                for (NodeUCS node : eval.getNode().getTetangga()) {
                    // Memeriksa apakah kedalaman kurang dari 5
                    if (depth < 5) {
                        // Menampilkan tetangga beserta biaya mereka
                        System.out.print(node.getNilai() + " (" + node.getCost() + "), ");

                        // Memeriksa apakah biaya suksesor saat ini lebih rendah dari minimum
                        if (min > node.getCost()) {
                            // Jika ya, perbarui nilai minimum dan suksesor terbaik
                            min = node.getCost();
                            best = node;
                        }
                    } else {
                        // Jika kedalaman sudah mencapai 5, hentikan evaluasi lebih lanjut
                        return;
                    }

                    depth++;
                }

                // Memilih suksesor terbaik
                NodeUCS successor = best;

                // Mengatur node terpilih ke dalam objek Solusi
                solusiSuksesor.setNode(successor);

                // Mengatur jalur yang telah dievaluasi ke dalam objek Solusi suksesor
                solusiSuksesor.setNodes(eval.getNodes());

                // Menambahkan node saat ini ke dalam jalur suksesor
                solusiSuksesor.getNodes().add(eval.getNode());

                // Menampilkan informasi node terpilih dan biayanya
                System.out.println();
                System.out.println("Node terpilih: " + best.getNilai() + " (" + min + ")");

                // Menambahkan objek Solusi suksesor ke dalam antrian
                queue.offer(solusiSuksesor);
                System.out.println();
            }
        }
    }
}
