package com.Modul_5.Nomor2;

//mengimpor utilitas java yakni ArrayList ke dalam class Vertex
//ArrayList menyediakan fungsi untuk membuat suatu object array list
import java.util.ArrayList;

/*class Vertex merupakan kelas yang ditujukan untuk 
merepresentasikan vertex-vertex yang terdapat dalam suatu graph*/
public class Vertex {
    //mendeklarasikan String dengan identitas kota
    //variabel kota ini akan digunakan untuk menyimpan nama-nama kota dari tiap vertex
    String kota;

    //mendeklarasikan ArrayList bertipe data Edge dengan identitas edges
    //list edges ini akan digunakan untuk menyimpan kumpulan edge yang terhubung dengan vertex
    ArrayList<Edge> edges;

    //constructor Vertex adalah method yang dipanggil ketika membuat suatu Vertex
    //method ini akan akan mengambil sebuah String dan menyimpannya sebagai kota dari vertex
    Vertex(String kota){
        //menyimpan nilai String kota kedalam kota milik vertex
        this.kota = kota;
        
        //memanggil constructor ArrayList untuk membuat ArrayList pada list edge
        edges = new ArrayList<Edge>();
    }
}
