package com.Modul_4;

/**
 * Queue merupakan class yang berfungsi sebagai blueprint untuk membuat
 * objek Queue
 */
public class Queue{
    /**
     * front merupakan variabel vertex yang berfungsi sebagai
     * penanda vertex terdepan dari queue
     */
    Vertex front; 
    /**
     * back merupakan variabel vertex yang berfungsi sebagai
     * penanda vertex terakhir dari queue
     */
    Vertex back;
  
    /**
     * Queue() merupakan konstruktor untuk membuat objek queue baru
     */
    Queue(){
        /**
         * front dan back yang merupakan variabel penanda awal dan akhir dari
         * queue akan di set nilainya ke null
         */
        front = null;
        back = null;
    }
    /**
     * pushElement merupakan method untuk menambahkan vertex pada queue dengan
     * parameter yang akan di passing sabagai nilai dari vertexnya
     */
    public void pushElement (String element){
        /**
         * NewNode merupakan variabel objek vertex baru yang akan menampung nilai
         * dari parameter method pushElement
         */
        Vertex NewNode = new Vertex(element);
        /**
         * if merupakan statement control yang berfungsi 
         * mengontrol alurnya pemrograman. Saat kondisi pada 
         * if terpenuhi yaitu front == null, maka code pada 
         * badan if lah yang akan tereksekusi.
         */
        if(front == null){
            /**
             * variabel front akan menapung NewNode yang merupakan variabel
             * objek vertex dari class Vertex
             */
            front = NewNode;
        /**
         * else merupakan control statement yang akan mengatur jalannya
         * sebuah program. Code pada badan else akan di eksekusi jifa syarat
         * kondisi dari if dan else if tidak terpenuhi.
         */ 
        }else{
            /**
             * vertex back yang mengakses vertex selanjutnya dan akan diisi oleh
             * variabel objek class Vertex NewNode
             */
            back.next = NewNode;
        }
        /**
         * back vertex akan menyimpan nilai variabel objek class Vertex NewNode
         */
        back = NewNode;
    }
    
    /**
     * method popElement merupakan method untuk mengeluarkan element pertama
     * yang masuk pada queue. element yang di keluarkan akan di return ke method
     * popElement
     */
    public String popElement (){
        /**
         * temp merupakan variabel string yang di set nilainya ke null
         */
        String temp = null;
        /**
         * if merupakan statement control yang berfungsi 
         * mengontrol alurnya pemrograman. Saat kondisi pada 
         * if terpenuhi yaitu front == null, maka code pada 
         * badan if lah yang akan tereksekusi.
         */
        if(front != null){
            /**
             * temp akan menampung element nama dari class Vertex objek from
             */
            temp = front.nama;
            /**
             * objek vertex from akan berpindah ke objek vertex selajutnya
             */
            front = front.next;
        /**
         * else merupakan control statement yang akan mengatur jalannya
         * sebuah program. Code pada badan else akan di eksekusi jifa syarat
         * kondisi dari if dan else if tidak terpenuhi.
         */ 
        }else{
        /**
         * return akan mengebalikan nilai "" (String kosong) ke method popElement
         */
            return "";
        }
        /**
         * return akan mengebalikan nilai temp ke method popElement
         */
        return temp; 
    }

    /*isEmpty merupakan method untuk memeriksa apakah suatu queue kosong
    atau tidak, maka method ini akan me-return boolean dengan nilai true apabila
    front == null (elemen awal dari queue bernilai null).
    */
    public boolean isEmpty(){
        /**
         * if merupakan statement control yang berfungsi 
         * mengontrol alurnya pemrograman. Saat kondisi pada 
         * if terpenuhi yaitu front == null, maka code pada 
         * badan if lah yang akan tereksekusi.
         */
        if(front == null){
        /*return digunakan untuk mengembalikan nilai pada method
        di sini return akan mengembalikan nilai true pada method
        apabila front ==null.
        */
            return true;
        }else{
        /*return digunakan untuk mengembalikan nilai pada method
        di sini return akan mengembalikan nilai true pada method
        apabila front !=null.
        */
            return false;
        }
    }
}
