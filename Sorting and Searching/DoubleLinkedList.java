package com.Modul_2;

/*class DoubleLinkedList merupakan class yang digunakan sebagai blueprint untuk 
membuat doublelinkedlist dimana didalamnya terdapat konstruktor, inisialisasi node dan
method-method yang di perlukan untuk menambah element, 
menghapus element dan mencetak elemen. 
*/
public class DoubleLinkedList {
    /*Node head merupakan sebuah variabel sebagai penanda 
    elemen terdepan dari sebuah linkedlist,digunakan 
    class Node sebagai tipe data karena head merupakan 
    representasi dari node.
    */
    Node head;
    /*Node tail merupakan sebuah variabel sebagai penanda 
    elemen terakhir dari sebuah linkedlist,digunakan 
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
     * int size merupakan variabel size dan memuat nilai 0. Variabel ini
     * akan digunakan untuk mencatat berapa objek yang telah dibuat. Setiap
     * objek yang dibuat akan men-increment-kan nilai dari size ini
     */
    int size = 0;
    /*DoubleLinkedList() merupakan sebuah constructor 
    untuk membuat LinkedList baru,constructor 
    ini merupakan constructor tanpa nilai awal 
    dimana head dan tail di set ke null.
    */
    DoubleLinkedList(){
        /*Node head merupakan sebuah variabel sebagai penanda 
        elemen terdepan dari sebuah linkedlist,digunakan 
        class Node sebagai tipe data karena head merupakan 
        representasi dari node.
        */
        head = null;
        /*Node tail merupakan sebuah variabel sebagai penanda 
        elemen terakhir dari sebuah linkedlist,digunakan 
        class Node sebagai tipe data karena tail merupakan 
        representasi dari node.
        */
        tail = null;
    }
    /*isEmpty merupakan method untuk memeriksa apakah suatu linkedlist kosong
    atau tidak, maka method ini akan me-return boolean dengan nilai true apabila
    head == null.
    */
    boolean isEmpty(){
        return head == null;
    }
    /**
     * insetElement merupakan method untuk memasukkan nilai pada DoubleLinkedList
     * pada method ini terdapat beberapa parameter yaitu String nama, int tinggi,
     * int power. Method ini merupakan method void berarti tidak akan mengembalikan
     * nilai
     */
    void insertElement(String nama, int tinggi, int power){
        /*newNode merupkan node baru yang dibentuk dengan class Node
        sebagai tipe datanya dan memuat keyword new yang berfungsi 
        untuk membuat objek atau instance dari sebuah class dan diikuti
        oleh constructornya yaitu Node().
        */
        Node newNode = new Node(nama, tinggi, power);
        /**
         * if merupakan statement control untuk mengatur alur dari pemrograman
         * code yang berada pada badan if akan dieksekusi jika kondisi pada if
         * terpenuhi.
         */
        if (isEmpty()){
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
             * tail.next merupakan node tail, yaitu node terakhir dari
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
             * tail.next merupakan node tail, yaitu node terakhir dari
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
             * tail merupakan node tail, yaitu node terakhir dari
             * linkedlist dan nilainya akan menapung node newNode
             */
            tail = newNode;
            /**
             * tail.next merupakan node tail, yaitu node terakhir dari
             * linkedlist yang menunjuk ke node selanjutnnya
             * menggunakan variabel pointer next.
             */
            tail.next = null;
        }
        
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
            akan ditampilkan adalah current.newVar.nama+" ("+current.newVar.tinggi+"cm, "+current.newVar.power+"p)"
            */
            System.out.print(current.newVar.nama+" ("+current.newVar.tinggi+"cm, "+current.newVar.power+"p)");
        /*if merupakan statement control yang berfungsi 
        mengontrol alurnya pemrograman. Saat kondisi pada 
        if terpenuhi yaitu current.next == null, maka code pada 
        badan if lah yang akan tereksekusi.
        */
            if (current.next == null){
                /*System.out.println(current.element) 
                berfungsi untuk menampilkan output kelayar. Disini output yang akan
                ditampilkan adalah \n atau end line sehingga akan membuat baris baru
                pada output program
                */
                System.out.println("\n");
                /*return digunakan untuk mengembalikan 
                pengeksekuian sehingga eksekusi berhenti
                pada badan if dan code di bawahnya tidak akan di eksekusi. 
                */
                return;
            /**
         * else merupakan control statement yang akan mengatur jalannya
         * sebuah program. Code pada badan else akan di eksekusi jifa syarat
         * kondisi dari if dan else if tidak terpenuhi.
         */
            }else{
                /*System.out.println(current.element) 
                berfungsi untuk menampilkan output kelayar. Disini output yang akan
                ditampilkan adalah <-
                */
                System.out.print(" <- ");
            }
            /*current merupakan sebuah variabel sebagai bantuan
            untuk menampung variabel current.next yaitu dia 
            sendiri sebagai variabel current yang mengakses variabel
            pointer next yaitu penunjuk ke node selanjutnya.
            */
            current = current.next;
        }
    }
    /**
     * bubbleSort merupakan method yang digunakan untuk mengurutkan objek-objek
     * dengan algoritma bubble sort. Method ini merupakan method void yang mana
     * tidak aka mengembalikan nilai akhir apapun.
     */
    void bubbleSort(){
        /*current1 merupakan sebuah variabel sebagai bantuan
        untuk menampung variabel Head agar mempermudah
        penunjuk posisi dari node.
        */
        Node current1 = head;
        /*while merupakan statement looping yang berfungsi
        untuk mengulang pengeksekusian code pada
        badan while selama syarat yaitu current!=null terpenuhi.
        */
        while(current1 != null){
            /*current merupakan sebuah variabel sebagai bantuan
            untuk menampung variabel Head agar mempermudah
            penunjuk posisi dari node.
            */
            current = head;
            /*while merupakan statement looping yang berfungsi
            untuk mengulang pengeksekusian code pada
            badan while selama syarat yaitu current.next != null terpenuhi.
            */
            while (current.next != null){
                /*if merupakan statement control yang berfungsi 
                mengontrol alurnya pemrograman. Saat kondisi pada 
                if terpenuhi yaitu current.newVar.nama.charAt(0)>current.next.newVar.nama.charAt(0)(variabel nama yang bertipe data string akan di cek
                kerakter utamanya menggunakkan method charAt()), 
                maka code pada badan if lah yang akan tereksekusi.
                */
                if (current.newVar.nama.charAt(0)>current.next.newVar.nama.charAt(0)){
                    /**
                     * temp merupakan variabel dengan tipe data Var digunakan
                     * untuk menyimpan nilai dari current.newVar yang merupakan
                     * variabel pada class Node yang bertipe data class Var.
                     */
                    Var temp = current.newVar;
                    /**
                     * current.newVar merupakan variabel current yang mengakses variabel
                     * newVar yang berada pada class node dan akan menapung current.next.newVar
                     */
                    current.newVar = current.next.newVar;
                    /**
                     * current.next.newVar merupakan variabel node current yang menunjuk ke
                     * node setelahnya dan mengkases newVar pada class Node akan memuat temp
                     */
                    current.next.newVar = temp;
                }
                /*current merupakan sebuah variabel sebagai bantuan
                untuk menampung variabel current.next yaitu dia 
                sendiri sebagai variabel current yang mengakses variabel
                pointer next yaitu penunjuk ke node selanjutnya.
                */
                current = current.next;
            }
            /*current1 merupakan sebuah variabel sebagai bantuan
            untuk menampung variabel curren1t.next yaitu dia 
            sendiri sebagai variabel current1 yang mengakses variabel
            pointer next yaitu penunjuk ke node selanjutnya.
            */
            current1 = current1.next;
        }
        
    }
/**
 * selectionSort merupakan method untuk melakukan pengurutan terhadap
 * objek dengan menggunakan algoritma selection sort
 */
    void selectionSort(){
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
            /**
             * min merupakan variabel node yang menyimpan nilai current yang telah
             * menyimpan nilai head di awal
             */
            Node min = current;
            /**
             * ref merupakan variabel node yang menyimpan nilai current.next yang 
             * menunjuk ke node setelah dari node current yang memuat nilai head
             */
            Node ref = current.next;
            /*while merupakan statement looping yang berfungsi
            untuk mengulang pengeksekusian code pada
            badan while selama syarat yaitu ref != null terpenuhi.
            */
            while(ref != null){
                /*if merupakan statement control yang berfungsi 
                mengontrol alurnya pemrograman. Saat kondisi pada 
                if terpenuhi yaitu min.newVar.tinggi>ref.newVar.tinggi 
                (variabel min yang memuat nilai current akan mengkases nilai dari
                variabel tinggi di dalam objek dari Var yang bernama newVar di class
                node), maka code pada badan if lah yang akan tereksekusi.
                */
                if (min.newVar.tinggi>ref.newVar.tinggi){
                    /**
                     * min merupakan variabel node yang isinya akan memuat
                     * nilai dari node ref
                     */
                    min = ref;
                }
                /*ref merupakan sebuah variabel sebagai bantuan
                untuk menampung variabel ref.next yaitu dia 
                sendiri sebagai variabel ref yang mengakses variabel
                pointer next yaitu penunjuk ke node selanjutnya.
                */
                ref = ref.next;
            }
            /**
             * simp merupakan variabel bantu dengan tipe data class Var karena 
             * digunakan untuk menampung objek dari class Var yaitu newVar yang di
             * akses oleh node min
             */
            Var simp = min.newVar;
            /**
             * min.newVar merupakan variabel node min yang mengakses newVar yang 
             * merupakan objek dari class var dan akan memuat current.newVar
             */
            min.newVar = current.newVar;
            /**
             * current.newVar merupakan variabel node current yang mengakses objek 
             * dari class Var yaitu newVar dan akan menyimpan nilai dari objek Var simp
             */
            current.newVar = simp;
            /*current merupakan sebuah variabel sebagai bantuan
                untuk menampung variabel current.next yaitu dia 
                sendiri sebagai variabel current yang mengakses variabel
                pointer next yaitu penunjuk ke node selanjutnya.
                */
            current = current.next;
            
        }

    }

    /*method InsertionSort adalah method yang berfungsi untuk mengurutkan node-node
    yang terdapat dalam list dengan metode Insertion Sort*/
    public void InsertionSort(){
        //membuat node sorted untuk menyimpan node terdepan dari list yang sudah terurut
        Node sorted = null; //karena belum ada yang diurutkan maka node sorted diberi nilai null
        current = head; //mengawali sorting dari node terdepan dengan menunjuk head sebagai node current
        //melakukan perulangan untuk mengurutkan list selama nilai current tidak sama dengan null
        while(current != null){
            //menyimpan node setelah current dalam variabel next dengan tipe data node
            Node next = current.next;
            //karena node dimasukan sebagai node baru maka link antar node current perlu dihapus 
            //dengan cara memberikan nilai null pada prev dan next dari node current 
            current.prev = current.next = null;
            /*memasukan node current ke dalam list yang sudah terurut
            dengan cara memanggil method sortedInsert*/
            /*pemanggilan method sortedInsert akan mengembalikan sebuah nilai 
            yakni node terdepan dari list yang sudah terurut*/
            sorted = sortedInsert(sorted, current); //menyimpan nilai yang dikembalikan mehtod sorted insert pada node sorted
            current = next; //mengganti nilai node current dengan nilai node next
        }
        //jika list telah terurut, maka node terdepan dari list perlu diganti dengan node terdepan list yang terurut
        //dengan cara menyimpan nilai node sorted pada node head
        head = sorted; 
    }

    
    /*method SortedInsert adalah method yang berfungsi untuk memasukan sebuah node 
   ke dalam list secara berurutan berdasarkan kekutan para pemain*/
    public Node sortedInsert(Node head_ref, Node newNode){

        //mengecek apakah list kosong atau tidak dengan mengecek nilai dari head_ref
        if(head_ref == null){
            //jika kosong maka newNode merupakan node terdepan dari list
            head_ref = newNode;
        }

        /*jika list tidak kosong, maka cek apakah 
        power dari newVar milik head_ref */
        else if(head_ref.newVar.power >= newNode.newVar.power){
            newNode.next = head_ref; //menunjuk head_ref sebagai node setelah node newNode
            newNode.next.prev = newNode; //menunjuk newNode sebagai sebelumnya node setelah node newNode
            head_ref = newNode; //menunjuk newNode sebagai head_ref
        }
        
        //jika kondisi diatas tidak ada yang terpenuhi maka
        else{
            //menunjuk head_ref sebagai  node current
            current = head_ref;

            //melakukan perulangan untuk menempatkan current sebelum node yang akan di insert
            /*perulangan dilakukan selama nilai node setelah current tidak sama dengan null
            dan power dari newVar milik node setelah current tidak lebih besar dari power dari newVar milik node newNode*/
            while(current.next != null &&
                current.next.newVar.power < newNode.newVar.power)
            {
                current = current.next; //menunjuk node selanjutnya sebagai node current
            }
            //mengganti nilai setelah newNode dengan nilai node setelah node current
            newNode.next = current.next;
            //memeriksa apakah node setelah current tidak sama dengan null
            if(current.next != null){
                //jika tidak null, maka node sebelum node setelah newNode adalah newNode
                newNode.next.prev = newNode;
            }else{
                //jika null maka newNode adalah node terbelakang dari list
                tail = newNode;
            }
            //menunjuk newNode sebagai node setelah current
            current.next = newNode;
            //menunjuk current sebagai node sebelum current
            newNode.prev = current;
        }
        //mengembalikan nilai node terdepan dari list
        return head_ref;
    }


}
