package com.Modul_4;

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
     * int pos merupakan variabel pos dengan tipe data integer
     * yang memuat angka yang akan menjadi indeks dari vertex
     */
    int pos;
    /**
     * edge merupakan variabel dengan tipe data class Edge karena merupakan
     * variabel objek dari class edge
     */
    Edge edge; 
    /**
     * Vertex next merupakan sebuah variabel 
     * pointer yang berfungsi untuk menunjuk 
     * arah ke vertex selanjutnya.
     */
    Vertex next; 
    /**
     * Vertex() merupakan sebuah kontruktor dari class Vertex
     * melalui konstruktor ini elemen-elemen yang berada pada class Vertex
     * akan memperoleh nilai yang akan di tampung.
     */
    public Vertex(String nama, int pos){
        /*this.nama = nama merupakan variabel this.nama yang merupakan
        variabel global di class Vertex menampung nilai dari variabel nama yang dimasukkan
        melalui constructor.
        */
        this.nama = nama;
        /*this.pos = pos merupakan variabel this.pos yang merupakan
        variabel global di class Vertex menampung nilai dari variabel pos 
        yang dimasukkan melalui constructor.
        */
        this.pos = pos;
    }
    /**
     * Vertex() merupakan sebuah kontruktor kedua dari class Vertex
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
