package com.Modul_2;

/*class DLL2 merupakan class yang digunakan sebagai blueprint untuk 
membuat doublelinkedlist dimana didalamnya terdapat konstruktor, inisialisasi node dan
method-method yang di perlukan untuk menambah element, 
menghapus element dan mencetak elemen. 
*/
public class DLL2 {
    /*Node head merupakan sebuah variabel sebagai penanda 
    elemen terdepan dari sebuah linkedlist,digunakan 
    class Node sebagai tipe data karena head merupakan 
    representasi dari node.
    */
    Node head; 
    /*Node tail merupakan sebuah variabel sebagai penanda 
    elemen terlast dari sebuah linkedlist,digunakan 
    class Node sebagai tipe data karena tail merupakan 
    representasi dari node.
    */
    Node tail;
    /*Node current merupakan sebuah variabel sebagai bantuan
    untuk menampung variabel dengan tipe data Node sehingga mempermudah 
    penunjuk posisi dari node.
    */
    Node current;
    
    /**
     * first, last dan mid merupakan variabel dengan tipe data int. digunakan 
     * sebagai penanda first, lastan dan nilai tengah dari elemen linkedlist
     */
    int first, last, mid; 
    /**
     * ada merupakan variabel boolean yang digunakan untuk memberikan nilai true dan
     * false
     */
    boolean ada = false;
    /**
     * swapped merupakan variabel boolean yang digunakan untuk memberikan nilai true dan
     * false
     */
    boolean swapped = true;
    /**
     * int size merupakan variabel size dan memuat nilai 0. Variabel ini
     * akan digunakan untuk mencatat berapa objek yang telah dibuat. Setiap
     * objek yang dibuat akan men-increment-kan nilai dari size ini
     */
    int size = 0;
    /*DLL2() merupakan sebuah constructor 
    untuk membuat LinkedList baru,constructor 
    ini merupakan constructor tanpa nilai first 
    dimana head dan tail di set ke null.
    */
    DLL2(){
        head = null;
        tail = null;
    }
    /**
     * inset merupakan method untuk memasukkan nilai pada DoubleLinkedList
     * pada method ini terdapat parameter String judul. Method ini merupakan method void berarti tidak akan mengembalikan
     * nilai
     */
    void insert(String judul){
        /*newNode merupkan node baru yang dibentuk dengan class Node
        sebagai tipe datanya dan memuat keyword new yang berfungsi 
        untuk membuat objek atau instance dari sebuah class dan diikuti
        oleh constructornya yaitu Node().
        */
        Node newNode = new Node(judul);
        /**
         * if merupakan statement control untuk mengatur alur dari pemrograman
         * code yang berada pada badan if akan dieksekusi jika kondisi pada if
         * terpenuhi.
         */
        if (head == null){
            /**
             * head = tail = null berfungsi untuk meng-set nilai dari
             * head dan tail sebagai null.
             */
            head = tail = newNode;
            /**
             * head.prev merupakan node head, yaitu node pertama
             * dari linkedlist yang menunjuk ke node sebelumnnya
             * menggunakan variabel pointer prev.
             */
            head.prev = null;
            /**
             * tail.next merupakan node tail, yaitu node terlast dari
             * linkedlist yang menunjuk ke node selanjutnnya
             * menggunakan variabel pointer next.
             */
            tail.next  = null;
        /**
         * else merupakan control statement yang akan mengatur jalannya
         * sebuah program. Code pada badan else akan di eksekusi jifa syarat
         * kondisi dari if dan else if tidak terpenuhi.
         */
        }else{
            /**
             * tail.next merupakan node tail, yaitu node terlast dari
             * linkedlist yang menunjuk ke node selanjutnnya
             * menggunakan variabel pointer next. Nilai dari varibel pointer
             * tersebut akan di set ke newNode.
             */
            tail.next = newNode;
            /**
             * newNode.prev merupakan objek node yang menunjuk ke node sebelummnya menggunakan
             * variabel pointer prev, nilainya akan di-set ke tail
             */
            newNode.prev = tail;
            /**
             * tail merupakan node tail, yaitu node terlast dari
             * linkedlist dan nilainya akan menapung node newNode
             */
            tail = newNode;
            /**
             * tail.next merupakan node tail, yaitu node terlast dari
             * linkedlist yang menunjuk ke node selanjutnnya
             * menggunakan variabel pointer next.
             */
            tail.next = null;
        }size++;
        
    }
    /*printList() merupakan sebuah method void, yang artinya
    method ini tidak akan mengembalikan nilai. Method ini
    digunakan untuk mencetak/menampilkan elemen pada sebuah linkedlist. 
    */
    void printList(){
        /*current merupakan sebuah variabel sebagai bantuan
        untuk menampung variabel Head agar mempermudah
        penunjuk posisi dari node.
        */
        current = head;
        /*while merupakan statement looping yang berfungsi
        untuk mengulang pengeksekusian code pada
        badan while selama syarat yaitu current!=null terpenuhi.
        */
        while(current != null){
            /*System.out.println(current.element) 
            berfungsi untuk menampilkan output kelayar. Disini output yang
            akan ditampilkan adalah current.newVar2.judul
            */
            System.out.println(current.newVar2.judul);
            /*current merupakan sebuah variabel sebagai bantuan
            untuk menampung variabel current.next yaitu dia 
            sendiri sebagai variabel current yang mengakses variabel
            pointer next yaitu penunjuk ke node selanjutnya.
            */
            current = current.next;
        }
    }

    /**
     * seqSearch merupakan method untuk mencari data pada linkedlist 
     * dengan memasukkan parameter sebagai data yang ingin
     * dicari dengan tipe data String
     */
    void seqSearch(String data){
        /*current merupakan sebuah variabel sebagai bantuan
        untuk menampung variabel Head agar mempermudah
        penunjuk posisi dari node.
        */
        current = head;
        /*while merupakan statement looping yang berfungsi
        untuk mengulang pengeksekusian code pada
        badan while selama syarat yaitu current!=null terpenuhi.
        */
        while(current != null){
            /*if merupakan statement control yang berfungsi 
            mengontrol alurnya pemrograman. Saat kondisi pada 
            if terpenuhi yaitu current.newVar2.judul == data (variabel node current
            yang mengakses judul dari objek newVar2 yang merupakan objek dari class Var2), 
            maka code pada badan if lah yang akan tereksekusi.
            */
            if(current.newVar2.judul == data){
            /*System.out.println(current.element) 
            berfungsi untuk menampilkan output kelayar. Disini output yang
            akan ditampilkan adalah "Novel Berjudul "+current.newVar2.judul+" ada."
            */
                System.out.println("Novel Berjudul "+current.newVar2.judul+" ada.");
                /**
                 * ada merupakan variabel boolean yang hanya dapat
                 * menampung nilai true dan falsa. Disini nilainya di-set ke true
                 * karena pencarian terhadap novel berhasil ditemukan
                 */
                ada = true;
        
            }
            /*current merupakan sebuah variabel sebagai bantuan
            untuk menampung variabel current.next yaitu dia 
            sendiri sebagai variabel current yang mengakses variabel
            pointer next yaitu penunjuk ke node selanjutnya.
            */
            current = current.next;
        /*if merupakan statement control yang berfungsi 
            mengontrol alurnya pemrograman. Saat kondisi pada 
            if terpenuhi yaitu !ada(variabel ada bernilai false,
            maksudnya perncarian terhadap novel tidak ditemukan), 
            maka code pada badan if lah yang akan tereksekusi.
            */
        }if(!ada){
            /*System.out.println(current.element) 
            berfungsi untuk menampilkan output kelayar. Disini output yang
            akan ditampilkan adalah "Novel yang dicari tidak ada."
            */
            System.out.println("Novel yang dicari tidak ada.");
        
        }
    }
    
    void binarySearch (String data){
        String temp1, temp2;
        current = head;
        while (swapped){
            current = head;
            swapped = false;
            while (current != tail){
                temp1 = current.newVar2.judul;
                temp2 = current.next.newVar2.judul;
                if (temp1.compareTo(temp2) > 0){
                    Var2 simp = current.newVar2;
                    current.newVar2 = current.next.newVar2;
                    current.next.newVar2 = simp;
                    swapped = true;
                }
                current = current.next;
            }
        }
        first = 0;
        last = size-1;
        mid = (last/2);
        posisi(mid, data);
    }

    void posisi (int index, String data){
        current = head;

        for (int a = 0; a < index-1; ++a){
            current = current.next;
        }

        if  (data.compareTo(current.newVar2.judul) > 0){
            first = mid+1;
            mid = (first + last) / 2;
            posisi(mid, data);
        }else if  (data.compareTo(current.newVar2.judul) < 0){
            last = mid-1;
            mid = (first + last) / 2;
            posisi(mid, data);
        }else if  (data.compareTo(current.newVar2.judul) == 0){
            System.out.println("Novel berjudul "+data+" ada.");
            return;
        }else{
            System.out.println("Novel berjudul "+data+" tidak ada.");
        }
    }
     

    
}
