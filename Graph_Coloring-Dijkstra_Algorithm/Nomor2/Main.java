package com.Modul_5.Nomor2;

public class Main {
    public static void main(String[] args) {
        //mendeklarasikan objek Graph dengan identitas graph
        //memanggil constructor Graph() untuk membuat objek Graph tersebut dalam keadaan kosong
        Graph graph = new Graph();

        //mengisi graph dengan memanggi method addEdge milik objek Graph
        //method ini akan mengambil dua string dan satu integer
        //kedua string digunakan sebagai identitas untuk memperoleh dua vertex untuk dihubungkan 
        //sedangkan integer tersebut digunakan sebagai bobot antara kedua vertex tersebut
        graph.addEdge("Fukuoka", "Osaka", 10);
        graph.addEdge("Fukuoka", "Nigata", 8);
        graph.addEdge("Osaka", "Nagano", 12);
        graph.addEdge("Osaka", "Saitama", 10);
        graph.addEdge("Osaka", "Shiga", 5);
        graph.addEdge("Osaka", "Hyogo", 6);
        graph.addEdge("Nigata", "Shiga", 20);
        graph.addEdge("Nigata", "Miyagi", 15);
        graph.addEdge("Nagano", "Gunma", 8);
        graph.addEdge("Nagano", "Saitama", 6);
        graph.addEdge("Saitama", "Miyagawa", 9);
        graph.addEdge("Saitama", "Fukushima", 12);
        graph.addEdge("Shiga", "Chiba", 15);
        graph.addEdge("Shiga", "Kyoto", 7);
        graph.addEdge("Hyogo", "Kyoto", 5);
        graph.addEdge("Gunma", "Miyagawa", 10);
        graph.addEdge("Miyagawa", "Fukushima", 3);
        graph.addEdge("Chiba", "Miyagi", 4);
        graph.addEdge("Fukushima", "Miyagi", 25);

        //memanggil method printAdjacency() untuk menampilkan setiap vertex dalam graph
        //beserta tetangga-tetangga yang dimilik vertex tersebut
        graph.printAdjacency();

        //memanggil method dijkstra pada graph untuk mengecek jalur terpendek antar dua buah vertex pada hari tertentu
        //pemanggilan method ini akan membutuhkan 3 buah string
        //dimana string pertama sebagai identitas vertex asal, dan string kedua sebagai identitas vertex tujuan
        //sedangkan vertex ketiga sebagai indikasi hari pengecekan jalur terpendek
        graph.dijkstra("Osaka", "Saitama", "minggu");
        graph.dijkstra("Saitama", "Osaka", "sabtu");
        graph.dijkstra("Saitama", "Osaka", "senin");
        graph.dijkstra("Saitama", "Osaka", "sabtu");
        graph.dijkstra("Fukuoka", "Nigata", "sabtu");
        graph.dijkstra("Shiga", "Nigata", "senin");
        graph.dijkstra("Shiga", "Nigata", "selasa");
        graph.dijkstra("Chiba", "Miyagi", "selasa");
        graph.dijkstra("Chiba", "Miyagi", "rabu");
        graph.dijkstra("Nagano", "Gunma", "rabu");
        graph.dijkstra("Gunma", "Nagano", "rabu");
        graph.dijkstra("Nagano", "Gunma", "kamis");
        graph.dijkstra("Fukushima", "Miyagi", "kamis");
        graph.dijkstra("Fukushima", "Miyagi", "jumat");
        graph.dijkstra("Fukushima", "Miyagawa", "jumat");
        graph.dijkstra("Fukushima", "Miyagawa", "sabtu");
    }
}
