package com.Modul_3;

/**
 * public class Node merupakan class yang 
 * digunakan sebagai blueprint untuk membuat node baru 
 * yang di dalamnya terdapat constructor, variabel 
 * pointer dan variabel tempat penyimpanan elemen.
 */
public class Node {
    /**
     * String nama merupakan variabel untuk menyimpan nama dari objek
     * yang akan dibuat dengan class Node dan nama di inputkan
     * melalu konstruktor Node. Nama yang disimpan bertipe data String
     */
    String nama;
    /**
     * Node leftChild merupakan variabel dengan tipe data Node karena merupakan
     * variabel yang akan mempresentasikan class Node
     */
    Node leftChild;
    /**
     * Node rightChild merupakan variabel dengan tipe data Node karena merupakan
     * variabel yang akan mempresentasikan class Node
     */
    Node rightChild;
    /**
     * Node() merupakan sebuah kontruktor dari class Node
     * melalui konstruktor ini elemen-elemen yang berada pada class Node
     * akan memperoleh nilai yang akan di tampung.
     */
    Node(String nama){
        /**
         * rhis.nama = nama merupakan variabel nama yang merupakan elemen dari class
         * Node akan menampung nama.
         * Nilai dari nama nantinya akan dimasukkan melaui konstruktor dan 
         * nilainya di tampung oleh variabel nama di class Node
         */
        this.nama = nama;
        /**
         * leftChild merupakan variabel Node dari class Node dan nilainya di-set ke null
         */
        leftChild = null;
        /**
         * rightChilde merupakan variabel Node dari class Node dan nilainya di-set ke null
         */
        rightChild = null;
    }

    
    
}
