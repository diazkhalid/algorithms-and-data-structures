package com.Modul_2;

/**
 * class Var merupakan class yang digunakan sebagai blueprint 
 * dari objek pemain, dimana didalamnya terdapat nama, tinggi dan power dari
 * pemain. Selain itu juga terdapat konstruktor di dalamnya.
 */
class Var{
    /**
     * String nama merupakan variabel untuk menyimpan nama dari objek
     * pemain yang akan dibuat dengan class Var dan nama di inputkan
     * melalu konstruktor Var. Nama yang disimpan bertipe data String
     */
    String nama;
    /**
     * int tinggi merupakan variabel untuk menyimpan tinggi dari objek pemain
     * yang akan dibuat dengan class Var dan tinggi diinputkan melalui konstruktor Var.
     * tinggi yang akan disimpan bertipe data integer 
     */
    int tinggi;
    /**
     * int power merupakan variabel untuk menyimpan power dari objek pemain
     * yang akan dibuat dengan class Var dan power akan diinputkan melalui 
     * konstruktor Var. Tinggi yang akan disimpan bertipe data integer
     */
    int power;
    /**
     * Var() merupakan konstruktor dari class Var, melalui konstruktor
     * ini elemen-elemen seperti nama, tinggi dan power dari objek
     * akan di masukkan ke dalam class
     */
    Var(String data1, int data2, int data3){
        /**
         * nama = data1 merupakan variabel nama yang merupakan elemen dari class
         * Var akan menampung data1.
         * Nilai dari data1 nantinya akan dimasukkan melaui konstruktor dan 
         * nilainya di tampung oleh variabel nama
         */
        nama = data1;
        /**
         * tinggi = data2 merupakan variabel tinggi yang merupakan elemen dari class
         * Var akan menampung data2. Nilai dari data2 nantinya akan dimasukkan melaui
         * konstruktor dan nilainya di tampung oleh variabel tinggi
         */
        tinggi = data2;
        /**
         * power = data3 merupakan variabel power yang merupakan elemen dari class
         * Var akan menampung data3. Nilai dari data3 nantinya akan dimasukkan melaui
         * konstruktor dan nilainya di tampung oleh variabel power
         */
        power = data3;
    }
}

/**
 * class Var2 merupakan class yang digunakan sebagai blueprint 
 * dari objek novel, dimana didalamnya terdapat judul dari
 * novel. Selain itu juga terdapat konstruktor di dalamnya.
 */
class Var2{
    /**
     * String judul merupakan variabel untuk menyimpan judul dari objek
     * novel yang akan dibuat dengan class Var dan judul di inputkan
     * melalu konstruktor Var. Judul yang disimpan bertipe data String
     */
    String judul;
    /**
     * Var2() merupakan konstruktor dari class Var2, melalui konstruktor
     * ini elemen judul dari objek akan di masukkan ke dalam class
     */
    Var2(String judul){
        /**
         * this.judul merupakan variabel judul yang berada pada class dan akan
         * menampung nilai dari variabel judul yang sebagai parameter dari konstruktor.
         * this. untuk menandakan bahwa variabel itu merupakan milik dari class
         */
        this.judul = judul;
    }
}

/**
 * public class Node merupakan class yang 
 * digunakan sebagai blueprint untuk membuat node baru 
 * yang di dalamnya terdapat constructor, variabel 
 * pointer dan variabel tempat penyimpanan elemen.
 */
public class Node {
    /**
     * newVar merupakan variabel dengan tipe data class Var. Jadi newVar
     * merupakan sebuah objek dari class Var.
     */
    Var newVar;
    /**
     * newVar2 merupakan variabel dengan tipe data class Var2. Jadi newVar
     * merupakan sebuah objek dari class Var2.
     */
    Var2 newVar2;
    /**
     * Node next merupakan sebuah variabel 
     * pointer yang berfungsi untuk menunjuk 
     * arah ke node selanjutnya.
     */
    Node next;
    /**
     * Node prev merupakan sebuah variabel 
     * pointer yang berfungsi untuk menunjuk 
     * arah ke node sebelumnya.
    */
    Node prev;
    
    /**
     * Node() merupakan sebuah kontruktor dari class Node
     * melalui konstruktor ini elemen-elemen yang berada pada class Node
     * akan memperoleh nilai yang akan di tampung.
     */
    Node(String name, int data1, int data2){
        /**
         * newVar merupakan variabel yang telah insialisasi sebagai objek
         * dari class Var. Objek newVar ini akan menampung nilai dari
         * konstruktor Var serta parameternya. Terdapat keyword new yang
         * merupakan keyword untuk membuat intance/objek dari sebuah class
         */
        newVar = new Var(name, data1, data2);
       
    }
    /**
     * Node() merupakan sebuah kontruktor dari class Node
     * melalui konstruktor ini elemen-elemen yang berada pada class Node
     * akan memperoleh nilai yang akan di tampung.
     */
    Node(String judul){
        /**
         * newVar2 merupakan variabel yang telah insialisasi sebagai objek
         * dari class Var2. Objek newVar2 ini akan menampung nilai dari
         * konstruktor Var2 serta parameternya. Terdapat keyword new yang
         * merupakan keyword untuk membuat intance/objek dari sebuah class
         */
        newVar2 = new Var2(judul);

    }
    
}
