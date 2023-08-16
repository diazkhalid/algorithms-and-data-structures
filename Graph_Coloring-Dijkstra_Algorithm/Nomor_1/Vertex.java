package com.Modul_5.Nomor_1;

/**
 * public class Vertex merupakan class yang 
 * digunakan sebagai blueprint untuk membuat vertex baru 
 * yang di dalamnya terdapat constructor, variabel 
 * pointer, variabel tempat edge dan variabel tempat penyimpanan elemen.
 */
public class Vertex {
    /**
     * String nama merupakan variabel untuk menyimpan nama dari objek
     * yang akan dibuat dengan class Vertex dan nama di inputkan
     * melalu konstruktor Vertex. Nama yang disimpan bertipe data String
     */
    String nama;
    /**
     * Vertex next merupakan sebuah variabel 
     * pointer yang berfungsi untuk menunjuk 
     * arah ke vertex selanjutnya.
     */
    Vertex next;
    /**
     * edge merupakan variabel dengan tipe data class Edge karena merupakan
     * variabel objek dari class edge
     */
    Edge edge;
    /**
     * int idx merupakan variabel idx dengan tipe data integer
     * yang memuat angka yang akan menjadi indeks dari vertex
     */
    int idx;
    /**
     * color merupakan variabel integer yang berfungsi untuk
     * menyimpan color dari setiap vertex
     */
    int color;
    /**
     * Vertex() merupakan sebuah kontruktor dari class Vertex
     * melalui konstruktor ini elemen-elemen yang berada pada class Vertex
     * akan memperoleh nilai yang akan di tampung.
     */
    public Vertex(String nama){
        /*this.nama = nama merupakan variabel this.nama yang merupakan
        variabel global di class Vertex menampung nilai dari variabel nama yang dimasukkan
        melalui constructor.
        */
        this.nama = nama;
    }
}
