package TugasAI.astar;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class AStar {

    public void search(NodeUCS start, NodeUCS goal) {
        // Mencari solusi dari simpul awal (start) ke simpul tujuan (goal) menggunakan algoritma A*

        Queue<Solusi> queue = new LinkedBlockingQueue<>(); // Antrian untuk menyimpan solusi yang akan dievaluasi

        Solusi solusiStart = new Solusi(); // Membuat objek Solusi untuk simpul awal
        solusiStart.setNode(start); // Mengatur simpul awal sebagai simpul tujuan pada objek Solusi

        queue.add(solusiStart); // Memasukkan objek Solusi awal ke dalam antrian

        int costAll = 0; // Biaya total dari awal ke simpul saat ini

        System.out.println("Mencari solusi dari " + start.getNilai() + " ke " + goal.getNilai());

        while (!queue.isEmpty()) {
            Solusi eval = queue.poll(); // Mengambil solusi dari depan antrian untuk dievaluasi

            System.out.println("Evaluasi: " + eval.getNode().getNilai());

            if (eval.getNode().equals(goal)) {
                // Jika simpul yang dievaluasi adalah simpul tujuan, maka solusi ditemukan

                System.out.println("Solusi ditemukan: ");

                for (NodeUCS node : eval.getNodes()) {
                    System.out.print(node.getNilai() + " -> "); // Menampilkan jalur solusi
                }

                System.out.print(eval.getNode().getNilai());
                break; // Keluar dari perulangan karena solusi telah ditemukan
            } else {
                System.out.println("Suksesor " + eval.getNode().getNilai() + ": ");

                Solusi solusiSuksesor = new Solusi(); // Membuat objek Solusi untuk suksesor simpul saat ini
                eval.getNode().isVisited = true; // Menandai simpul saat ini sebagai telah dikunjungi

                NodeUCS best = null; // Simpul terbaik untuk digunakan selanjutnya
                int min = Integer.MAX_VALUE; // Biaya minimum untuk suksesor terbaik
                int cost = 0; // Indeks biaya suksesor dalam daftar biaya
                int i = 0;

                for (NodeUCS node : eval.getNode().getTetangga()) {
                    int costTetangga = eval.getNode().getTetanggaCost().get(i);

                    if (eval.getNode().getTetanggaCost().size() > i) {
                        int apakahMin = node.getCost() + costTetangga + costAll;

                        System.out.print(node.getNilai() + " (" + node.getCost() + " + " +
                                costTetangga + " + " + costAll + "), = " + apakahMin + "\n");

                        if (node.isVisited == true) {
                            System.out.println(node.getNilai() + " sudah dikunjungi.\n");
                        }

                        if (min > apakahMin && node.isVisited == false) {
                            min = apakahMin;
                            best = node;
                            cost = i;
                            node.isVisited = true;
                        }
                    } else {
                        return;
                    }
                    i++;
                }

                NodeUCS successor = best; // Simpul terbaik dijadikan suksesor
                solusiSuksesor.setNode(successor); // Mengatur simpul terbaik sebagai simpul tujuan pada objek Solusi
                solusiSuksesor.setNodes(eval.getNodes()); // Menyalin daftar simpul dari objek Solusi evaluasi
                solusiSuksesor.getNodes().add(eval.getNode()); // Menambahkan simpul saat ini ke daftar simpul

                System.out.println();
                System.out.println("Node terpilih: " + best.getNilai() + " (" + min + ")");

                costAll += eval.getNode().getTetanggaCost().get(cost); // Menambahkan biaya suksesor ke biaya total

                queue.offer(solusiSuksesor); // Memasukkan solusi suksesor ke dalam antrian
                System.out.println();
            }
        }
    }
}
