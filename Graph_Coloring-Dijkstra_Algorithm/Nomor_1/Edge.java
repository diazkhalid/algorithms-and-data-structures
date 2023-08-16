package com.Modul_5.Nomor_1;

/**
 * public class Edge merupakan class yang 
 * digunakan sebagai blueprint untuk membuat edge baru 
 * yang di dalamnya terdapat constructor, variabel 
 * pointer, dan variabel objek class vertex
 */
public class Edge {
    /**
     * Vertex dst merupakan sebuah variabel 
     * yang berfungsi untuk menyimpan nilai dari vertex lain
     * yang terhubung dengan edge
     */
    Vertex dst;
    /**
     * next merupakan variabel objek dari class edge yang berfungsi
     * menunjuk ke edge selajutnya
     */
    Edge next;
    /**
     * Edge() merupakan sebuah kontruktor dari class Edge
     * melalui konstruktor ini elemen-elemen yang berada pada class Edge
     * akan memperoleh nilai yang akan di tampung.
     */
    public Edge(Vertex dst){
        /*this.dst = this.dst merupakan variabel dst yang merupakan
        variabel global di class Vertex menampung nilai dari variabel dst yang dimasukkan
        melalui constructor.
        */
        this.dst = dst;
    }
}
