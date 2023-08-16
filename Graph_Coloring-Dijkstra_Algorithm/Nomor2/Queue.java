package com.Modul_5.Nomor2;

//class Queue merupakan class yang ditujukan untuk merepresentasikan Queue dalam program 
//class ini menampung method-method yang dapat diterapkan pada objek Queue
public class Queue {
    //mendeklarasikan Node head dan tail dalam queue
    Node head; //Node head berfungsi menunjuk Node terdepan
    Node tail; //Node tail berfungsi menunjuk Node terbelakang

    //Queue() adalah constructor yang dipanggil ketika membuat suatu objek queue dalam keadaan kosong
    Queue(){
        //memberikan nilai null pada head dan tail dari queue
        head = tail = null;
    }
    //static class Node merupakan class yang merepresentasikan objek Node dalam queue
    static class Node{
        //mendeklarasikan Vertex kota untuk menampung nilai vertex
        Vertex kota;
        //mendeklarasikan integer jarak
        int jarak;
        //mendeklarasikan Node next untuk menunjuk ke Node setelahnya
        Node next;
        //constructor Node merupakan method yang dipanggil dalam pembuatan objek Node
        Node(Vertex kota, int jarak){
            //memberikan nilai kota terhadap variabel kota dari Node
            this.kota = kota;
            //memberikan nilai jarak terhadap variabel jarak dari Node
            this.jarak = jarak;
            //memberikan nilai null terhadap Node next
            next = null;
        }
    }
    //method push adalah method yang digunakan untuk memasukan vertex dalam queue
    //pada posisi terbelakang
    public void push(Vertex kota, int jarak){
        //membuat objek Node dengan identitas newNode
        //pembuatan Node dilakukan dengan memanggil method Node dengan argumen kota dan jarak
        Node newNode = new Node(kota, jarak);
        //mengecek apakah queue tidak dalam keadaan kosong, dengan mengecek nilai dari head
        if(head != null){
            //menunjuk newNode sebagai Node setelah Node tail
            tail.next = newNode;
        }else{
            //jika queue kosong, maka newNode ditunjuk sebagai Node head
            head = newNode;
        }
        //menunjuk newNode sebagai Node tail
        tail = newNode;
    }

    //method pop() merupakan method yang menghapus Node dengan nilai jarak terkecil 
    //serta mengembalikan Vertex dari Node tersebut
    public Vertex pop(){
        Node smallest = head; //menunjuk Node head sebagai Node terkecil
        Node current = head; //menunjuk Node head sebagai Node current
        Node prev = null; //membuat Node prev untuk menyimpan Node sebelumnya
        //melakukan perulangan untuk mencari Node yang lebih kecil dari Node smallest
        while(current != null){
            //mengecek apakah node setelahnya tidak null dan lebih kecil dari Node smallest
            if(current.next != null && current.next.jarak < smallest.jarak){
                //menyimpan Node setelah current sebagai node smallest
                smallest = current.next;
                //menyimpan Node current sebagai Node prev
                prev = current;
            }
            //menunjuk Node setelah current sebagai Node current
            current = current.next;
        }
        //Jika Node smallest bukan merupakan Node terdepan (head)
        if(smallest != head){
            //maka Node setelah Node smallest ditunjuk sebagai Node setelah Node prev
            prev.next = smallest.next;
        }else{
            //jika tidak maka Node setelah Node head merupakan head 
            head = head.next;
        }
        //mengecek apakah Node smallest merupakan Node terakhir (tail)
        if(smallest == tail){
            //jika iya maka Node prev merupakan tail dari Queue
            tail = prev;
        }
        //mengembalikan vertex kota dari Node smallest
        return smallest.kota;
    }
    //method isEmpty() adalah method yang mengecek apakah Queue kosong
    public boolean isEmpty(){
        //jika head bernilai null, maka dikembalikan nilai true
        return head == null;
    }
}
