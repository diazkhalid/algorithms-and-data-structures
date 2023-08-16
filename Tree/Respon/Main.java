package com.Modul_3.Respon;

import java.util.Scanner;

public class Main {
    static Tree family = new Tree();
    static void menu(){
        System.out.println("\n===============================\n  Sisilah Keluarga Kelompok 2 \n===============================");
        System.out.println("Pilih:\n1. Print Tree\n2. Daftar Anak \n3. Temukan Relasi \n4. Keluar");
        System.out.print("Pilihan: ");
        Scanner input = new Scanner(System.in);
        int pil = input.nextInt();
        pilihan(pil);
    }

    static void pilihan(int pil){
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        if (pil == 1){
            family.print(System.out);
            menu();
        }
        else if(pil == 2){
            System.out.print("Daftar anak: ");
            family.child(family.getRoot());
            menu();
        }
        else if(pil == 3){
            System.out.print("Temukan Relasi: \nOrang Pertama: ");
            String from = in1.nextLine();
            System.out.print("Orang Kedua: ");
            String to = in2.nextLine();

            family.Relation(from, to);
            menu();

        }else if(pil == 4){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        family.addFamily(new Node("Fahru", "Pria"));
        family.addFamily(new Node("Diaz", "Pria"));
        family.addFamily(new Node("Ifa", "Wanita"));
        family.addFamily(new Node("Gita", "Wanita"));
        family.addFamily(new Node("Moreno", "Pria"));
        family.addFamily(new Node("Joselina", "Wanita"));
        family.addFamily(new Node("Zidan", "Pria"));
        family.addFamily(new Node("Anggun", "Wanita"));
        family.addFamily(new Node("Ibrahim", "Pria"));
        family.addFamily(new Node("Abidin", "Pria"));
        menu();
    }
}
