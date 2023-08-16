package com.Modul_3.Respon;

public class Node {
    String nama;
    String parent;
    String gender;
    int level;
    Node left, right;

    Node(String nama, String gender){
        this.nama = nama;
        this.gender = gender;
        parent = null;
        level = 0;
        left = right = null;
        
    }
}
