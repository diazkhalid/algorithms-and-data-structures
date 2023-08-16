package com.Modul_5.Nomor2;

/*class Edge merupakan kelas yang ditujukan untuk 
merepresentasikan edge-edge yang terdapat dalam suatu graph*/
public class Edge {
    //mendeklarasikan object vertex dengan identitas destination (tujuan)
    //variabel ini akan digunakan untuk menyimpan vertex tujuan dari suatu edge
    Vertex destination;

    //mendeklarasikan integer jarak untuk menyimpan jarak vertex menuju destination
    int jarak;

    //mendeklarasikan boolean tersedia untuk menyimpan apakah jalan ditutup atau tidak
    boolean tersedia;

    //constructor Edge adalah method yang dipanggil ketika membuat suatu edge
    //method ini akan akan mengambil sebuah Vertex dan integer dan menyimpannya sebagai tujuan dan jarak dari edge 
    Edge(Vertex destination, int jarak){
        //menunjuk vertex sebagai destination (tujuan) dari edge
        this.destination = destination;

        //memberikan nilai jarak pada variabel jarak milik Edge
        this.jarak = jarak;

        //menyatakan bahwa Edge ini tersedia dengan memberikan nilai true
        tersedia = true;
    }
}
