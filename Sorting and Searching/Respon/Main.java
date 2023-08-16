package com.Modul_2.Respon;

import java.util.Scanner;
public class Main {
    static LinkedList list = new LinkedList();
    static void menu(){
        System.out.println("Pilih:\n1. Input\n2. Tampilkan Urutan Nama\n3. Tampilkan Urutan NIM ");
        System.out.print("Pilihan: ");
        Scanner input = new Scanner(System.in);
        int pil = input.nextInt();
        pilihan(pil);
    }

    static void pilihan(int pil){
        Scanner in = new Scanner(System.in);
        if (pil == 1){
            System.out.print("Nama: ");
            String nama = in.nextLine();
            System.out.print("NIM: ");
            String nim = in.nextLine();
            list.insertElement(nama, nim);
            System.out.println("Urutan Awal");
            list.printList();
            menu();
        }
        else if (pil == 2){
            System.out.println("Urutan berdasarkan nama");
            list.bubbleSortNama();
            list.printList();
            menu();
        }
        else if(pil == 3){
            System.out.println("Urutan berdasarkan NIM");
            list.bubbleSortNim();
            list.printList();
            menu();
        }
        else{
            System.out.println("Pilihan salah");
            menu();
        }
    }
    public static void main(String[] args) {
        menu();
    }
}
