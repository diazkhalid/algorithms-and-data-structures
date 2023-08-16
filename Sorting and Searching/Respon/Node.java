package com.Modul_2.Respon;

class mahasiswa{
    String nama;
    String nim;

    mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }
}
public class Node {
    mahasiswa mhs;
    Node next;

    Node(String nama, String nim){
        mhs = new mahasiswa(nama, nim);
        next = null;
    }
}
