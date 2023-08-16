package com.Modul_5.Nomor_1;

/*Main merupakan sebuah class public yang merupakan class
dimana tempat public static void main berada.
*/
public class Main {
    /*public static void main(String[] args) merupakan tempat entry
    point bagi java virtual machine ke program java untuk mengeksekusi
    byte code java-nya.
    */
    public static void main(String[] args) {
        /**
         * code di bawah merupakan code untuk membuat sebuah objek
         * hal yang diperlukan yaitu class, nama objeknya, keyword new dan 
         * konstruktornya. classnya yaitu Graph, nama objeknnya yaitu g dan 
         * new berfungsi untuk membuat intance/objek baru dari class Graph, 
         * dan terdapat konstruktor Graph();
         */
        Graph g = new Graph();
        /**
         * objek Graph g memanggil method addVertex untuk menambahkan vertex
         * dengan nama Alphas kepada linkedlist graph-nya
         */
        g.addVertex("Alphas");
        /**
         * objek Graph g memanggil method addVertex untuk menambahkan vertex
         * dengan nama Betas kepada linkedlist graph-nya
         */
        g.addVertex("Betas");
        /**
         * objek Graph g memanggil method addVertex untuk menambahkan vertex
         * dengan nama Certas kepada linkedlist graph-nya
         */
        g.addVertex("Certas");
        /**
         * objek Graph g memanggil method addVertex untuk menambahkan vertex
         * dengan nama Deltas kepada linkedlist graph-nya
         */
        g.addVertex("Deltas");
        /**
         * objek Graph g memanggil method addVertex untuk menambahkan vertex
         * dengan nama Epsas kepada linkedlist graph-nya
         */
        g.addVertex("Epsas");
        /**
         * objek Graph g memanggil method addVertex untuk menambahkan vertex
         * dengan nama Fetas kepada linkedlist graph-nya
         */
        g.addVertex("Fetas");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Alphas lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Betas
         */
        g.addEdge("Alphas", "Betas");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Alphas lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Certas
         */
        g.addEdge("Alphas", "Certas");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Betas lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Alphas
         */
        g.addEdge("Betas", "Alphas");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Betas lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Certas
         */
        g.addEdge("Betas", "Certas");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Betas lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Epsas
         */
        g.addEdge("Betas", "Epsas");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Certas lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Alphas
         */
        g.addEdge("Certas", "Alphas");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Certas lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Betas
         */
        g.addEdge("Certas", "Betas");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Certas lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Deltas
         */
        g.addEdge("Certas", "Deltas");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Certas lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Epsas
         */
        g.addEdge("Certas", "Epsas");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Deltas lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Certas
         */
        g.addEdge("Deltas", "Certas");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Deltas lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Fetas
         */
        g.addEdge("Deltas", "Fetas");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Epsas lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Betas
         */
        g.addEdge("Epsas", "Betas");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Epsas lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Certas
         */
        g.addEdge("Epsas", "Certas");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Epsas lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Fetas
         */
        g.addEdge("Epsas", "Fetas");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Fetas lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Deltas
         */
        g.addEdge("Fetas", "Deltas");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Fetas lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Epsas
         */
        g.addEdge("Fetas", "Epsas");
        /**
         * objek Graph g memanggil method print untuk mencetak adjecency list
         * dari graph yang telah di bangun
         */
        g.print();
        /**
         * objek Graph g memanggil method graphColoring untuk memberikan warna
         * pada setiap vertex pada graph dan mencetaknya
         */
        g.graphColoring();
        /**
         * objek Graph g memanggil method tangki untuk mencetak vertex mana saja 
         * yang memiliki warna sama dan akan di cetak berdasarkan tangki yang sama
         */
        g.tangki();
    }
}
