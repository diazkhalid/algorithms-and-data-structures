package com.Modul_4;

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
         * dengan nama Mataram kepada linkedlist graph-nya
         */
        g.addVertex("Mataram");
        /**
         * objek Graph g memanggil method addVertex untuk menambahkan vertex
         * dengan nama Gerung kepada linkedlist graph-nya
         */
        g.addVertex("Gerung");
        /**
         * objek Graph g memanggil method addVertex untuk menambahkan vertex
         * dengan nama Selong kepada linkedlist graph-nya
         */
        g.addVertex("Selong");
        /**
         * objek Graph g memanggil method addVertex untuk menambahkan vertex
         * dengan nama Praya kepada linkedlist graph-nya
         */
        g.addVertex("Praya");
        /**
         * objek Graph g memanggil method addVertex untuk menambahkan vertex
         * dengan nama Kopang kepada linkedlist graph-nya
         */
        g.addVertex("Kopang");
        /**
         * objek Graph g memanggil method addVertex untuk menambahkan vertex
         * dengan nama Masbagik kepada linkedlist graph-nya
         */
        g.addVertex("Masbagik");
        /**
         * objek Graph g memanggil method addVertex untuk menambahkan vertex
         * dengan nama Sembalun kepada linkedlist graph-nya
         */
        g.addVertex("Sembalun");
        /**
         * system akan menampilkan Adjecency List: pada layar
         */
        System.out.print("Adjecency List: ");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Mataram lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Praya
         */
        g.addEdge("Mataram", "Praya");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Mataram lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Gerung
         */
        g.addEdge("Mataram", "Gerung");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Mataram lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Selong
         */
        g.addEdge("Mataram", "Selong");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Gerung lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Kopang
         */
        g.addEdge("Gerung", "Kopang");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Gerung lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Mataram
         */
        g.addEdge("Gerung", "Mataram");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Selong lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Sembalun
         */
        g.addEdge("Selong", "Sembalun");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Selong lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Masbagik
         */
        g.addEdge("Selong", "Masbagik");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Selong lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Mataram
         */
        g.addEdge("Selong", "Mataram");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Praya lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Kopang
         */
        g.addEdge("Praya", "Kopang");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Praya lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Mataram
         */
        g.addEdge("Praya", "Mataram");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Kopang lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Masbagik
         */
        g.addEdge("Kopang", "Masbagik");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Kopang lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Gerung
         */
        g.addEdge("Kopang", "Praya");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Kopang lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Gerung
         */
        g.addEdge("Kopang", "Gerung");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Masbagik lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Kopang
         */
        g.addEdge("Masbagik", "Kopang");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Masbagik lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Sembalun
         */
        g.addEdge("Masbagik", "Sembalun");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Masbagik lalu nama edge yang akan 
         * di tambahkan ke vertex tersebut yaitu Selong
         */
        g.addEdge("Masbagik", "Selong");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Sembalun lalu nama Masbagik
         */
        g.addEdge("Sembalun", "Masbagik");
        /**
         * objek Graph g memanggil method addEdge untuk menambahkan
         * edge pada setiap vertexnya, parameter yang dibutuhkan yaitu
         * nama vertexnya yaitu Sembalun lalu nama Selong
         */
        g.addEdge("Sembalun", "Selong");
        /**
         * objek Graph g memanggil method print untuk mencetak adjecency list
         * dari graph yang telah di bangun
         */
        g.print();
        /**
         * system akan menampilkan BFS: pada layar
         */
        System.out.println("\n====BFS====");
        /**
         * objek Graph g memanggil method bfs untuk mencetak edge-edge
         * yang di telusuri dengan algoritma BFS kepada vertex Mataram
         */
        
        g.bfs("Mataram");


    }
}
