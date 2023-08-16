package com.Modul_1;

/*class DoubleLinkedList merupakan class yang digunakan sebagai blueprint untuk 
membuat doublelinkedlist dimana didalamnya terdapat konstruktor, inisialisasi node dan
method-method yang di perlukan untuk menambah element, 
menghapus element dan mencetak elemen. 
*/
class DoubleLinkedList{
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
        /*return digunakan untuk mengembalikan nilai pada method
        di sini return akan mengembalikan nilai true pada method
        apabila head ==null.
        */
        return head==null;
    }
    /*insertHead merupakan sebuah method void, yang artinya
    method ini tidak akan mengembalikan nilai. Method ini
    digunakan untuk menambahkan elemen terdepan dari linkedlist
    dengan mengisi parameternya yaitu data dengan tipe data Object.
    */
    void insertHead(Object data){
        /*newNode merupkan node baru yang dibentuk dengan class Node
        sebagai tipe datanya dan memuat keyword new yang berfungsi 
        untuk membuat objek atau instance dari sebuah class dan diikuti
        oleh constructornya yaitu Node(data).
        */
        Node newNode = new Node(data);
        /*if merupakan statement control yang berfungsi 
        mengontrol alurnya pemrograman. Saat kondisi pada 
        if terpenuhi yaitu method isEmpty() yang mengebalikan
        nilai true apabila head==null, maka code pada 
        badan if lah yang akan tereksekusi.
        */
        if (isEmpty()){
            /*tail merupakan variabel sebagai penanda elemen terakhir
            dari node akan menampung newNode.
            */
            tail = newNode;
        /*else merupakan statment control yang berfungsi 
        mengontrol alurnya pemrograman. Saat kondisi pada if tidak
        terpenuhi maka code yang berada pada badan else inilah
        yang akan dieksekusi.
        */
        }else{
            /*variabel head sebagai penanda node terdepan dari linkedlist
            disini mengakses variabel pointer prev yang menunjuk ke node
            sebelum dari head dan akan diisi dengan newNode.
            */
            head.prev = newNode;
        }
        /*newNode.next merupakan sebuah node yaitu newNode yang mengakses variabel
        pointer next untuk menunjuk ke node selajutnya dari newNode itu dan 
        akan memuat head yaitu node terdepan dari linkedlist..
        */
        newNode.next = head;
        /*variabel head yang merupakan penanda elemen awal dari
        linkedlist akan memuat elemen dari newNode yang merupakan 
        node baru yang dibuat dengan constructor Node.
        */
        head = newNode;
    }
    /*insertTail merupakan sebuah method void, yang artinya
    method ini tidak akan mengembalikan nilai. Method ini
    digunakan untuk menambahkan elemen terakhir dari linkedlist
    dengan mengisi parameternya yaitu data dengan tipe data Object.
    */
    void insertTail(Object data){
        /*newNode merupkan node baru yang dibentuk dengan class Node
        sebagai tipe datanya dan memuat keyword new yang berfungsi 
        untuk membuat objek atau instance dari sebuah class dan diikuti
        oleh constructornya yaitu Node(data).
        */
        Node newNode = new Node(data);
        /*if merupakan statement control yang berfungsi 
        mengontrol alurnya pemrograman. Saat kondisi pada 
        if terpenuhi yaitu method isEmpty() yang mengebalikan
        nilai true apabila head==null, maka code pada 
        badan if lah yang akan tereksekusi.
        */
        if (isEmpty()){
            /*variabel head yang merupakan penanda elemen awal dari
        linkedlist akan memuat elemen dari newNode yang merupakan 
        node baru yang dibuat dengan constructor Node.
        */
            head = newNode;
        /*variabel head sebagai penanda node terdepan dari linkedlist
        disini mengakses variabel pointer prev yang menunjuk ke node
        sebelum dari head dan akan diisi dengan newNode.
        */
        }else{
            /*tail merupakan variabel sebagai penanda elemen terakhir disini akan
            mengakses variabel pointer next untuk menunjuk ke node setelahnya tail
            dan akan di set sebagai newNode.
            */
            tail.next = newNode;
            /*newNode.prev merupakan sebuah node yaitu newNode yang mengakses variabel
            pointer prev untuk menunjuk ke node sebelumnya dari newNode itu dan 
            akan memuat tail yaitu node terakhir dari linkedlist.
            */
            newNode.prev = tail;
        }
        /*tail merupakan variabel sebagai penanda elemen terakhir
        dari node akan menampung newNode.
        */
        tail = newNode;
    }
    /*insertNextTo merupakan sebuah method void, yang artinya
    method ini tidak akan mengembalikan nilai. Method ini
    digunakan untuk menambahkan elemen pada elemen tertentu dari linkedlist
    dengan mengisi parameternya awal yaitu Object element sebagai elemen tertentu
    yang akan di tembahkan elemen yaitu data dengan tipe data Object setelahnya.
    */
    void insertNextTo(Object element, Object data){
        /*current merupakan sebuah variabel sebagai bantuan
        untuk menampung variabel Head agar mempermudah
        penunjuk posisi dari node.
        */
        current = head;
        /*newNode merupkan node baru yang dibentuk dengan class Node
        sebagai tipe datanya dan memuat keyword new yang berfungsi 
        untuk membuat objek atau instance dari sebuah class dan diikuti
        oleh constructornya yaitu Node(data).
        */
        Node newNode = new Node(data);
        /*while merupakan statement looping yang berfungsi
        untuk mengulang pengeksekusian code pada badan while selama syarat
        yaitu current.element!=element terpenuhi.
        */
        while (current.element!=element){
            /*current merupakan sebuah variabel sebagai bantuan
            untuk menampung variabel current.next yaitu dia 
            sendiri sebagai variabel current yang mengakses variabel
            pointer next yaitu penunjuk ke node selanjutnya.
            */
            current = current.next;
        }
        /*if merupakan statement control yang berfungsi 
        mengontrol alurnya pemrograman. Saat kondisi pada 
        if terpenuhi yaitu current==tail, maka code pada 
        badan if lah yang akan tereksekusi.
        */
        if (current==tail){
            /*newNode.next merupakan sebuah node yaitu newNode yang mengakses variabel
            pointer next untuk menunjuk ke node selajutnya dari newNode itu dan 
            akan di-set ke nilai null.
            */
            newNode.next = null;
            /*tail merupakan variabel sebagai penanda elemen terakhir
            dari node akan menampung newNode.
            */
            tail = newNode;
        /*variabel head sebagai penanda node terdepan dari linkedlist
        disini mengakses variabel pointer prev yang menunjuk ke node
        sebelum dari head dan akan diisi dengan newNode.
        */
        }else{
            /*newNode.next merupakan sebuah node yaitu newNode yang mengakses variabel
            pointer next untuk menunjuk ke node selajutnya dari newNode itu dan 
            akan memuat node current.next yaitu node selanjutnya setelah current.
            */
            newNode.next = current.next;
            /*current.next merupakan sebuah variabel current yang
            mengakses variabel pointer yaitu next yang digunakan sebagai
            penunjuk node selanjutnya dan mengakses pointer prev yang 
            akan menunjuk node sebelum dari node setelah yang di tunjuk dan akan ditambahkan 
            newNode pada node tersebut.
            */
            current.next.prev = newNode;
        }
        /*newNode.prev merupakan sebuah node yaitu newNode yang mengakses variabel
        pointer prev untuk menunjuk ke node sebelumnya dari newNode itu dan 
        akan memuat node current.
        */
        newNode.prev = current;
        /*current.next merupakan sebuah variabel current yang
        mengakses variabel pointer yaitu next yang digunakan sebagai
        penunjuk node selanjutnya setelah current akan ditambahkan 
        newNode sebagai node selanjutnya dari current.
        */
        current.next = newNode;
    }
    /*deleteElement merupakan sebuah method void, yang artinya
    method ini tidak akan mengembalikan nilai. Method ini
    digunakan untuk menghapus elemen pada elemen dari linkedlist
    dengan mengisi parameternya awal yaitu Object element.
    */
    void deleteElement(Object element){
        /*current merupakan sebuah variabel sebagai bantuan
        untuk menampung variabel Head agar mempermudah
        penunjuk posisi dari node.
        */
        current = head;
        /*while merupakan statement looping yang berfungsi
        untuk mengulang pengeksekusian code pada badan while selama syarat
        yaitu current.element!=element terpenuhi.
        */
        while(current.element!=element){
            /*current merupakan sebuah variabel sebagai bantuan
            untuk menampung variabel current.next yaitu dia 
            sendiri sebagai variabel current yang mengakses variabel
            pointer next yaitu penunjuk ke node selanjutnya.
            */
            current = current.next;
            /*if merupakan statement control yang berfungsi 
            mengontrol alurnya pemrograman. Saat kondisi pada 
            if terpenuhi yaitu current == null, maka code pada 
            badan if lah yang akan tereksekusi.
            */
            if (current == null){
                /*System.out.println("Delete Fails, name not found.") 
                berfungsi untuk menampilkan "Delete Fails, name not found."
                ke layar.
                */
                System.out.println("Delete Fails, name not found.");
                /*return digunakan untuk mengembalikan 
                pengeksekuian sehingga eksekusi berhenti
                pada badan if dan code di bawahnya tidak akan di eksekusi. 
                */
                return;
            }
        }
        /*if merupakan statement control yang berfungsi 
        mengontrol alurnya pemrograman. Saat kondisi pada 
        if terpenuhi yaitu current == null, maka code pada 
        badan if lah yang akan tereksekusi.
        */
        if (current==head){
            /*variabel head yang merupakan penanda elemen awal dari
            linkedlist akan menampung variabel current.next yaitu
            variabel current yang mengakses variabel
            pointer next yaitu penunjuk ke node selanjutnya.
            */
            head = current.next;
        /*variabel head sebagai penanda node terdepan dari linkedlist
        disini mengakses variabel pointer prev yang menunjuk ke node
        sebelum dari head dan akan diisi dengan newNode.
        */
        }else{
            /*current.prev merupakan sebuah variabel current yang
            mengakses variabel pointer yaitu prev yang digunakan sebagai
            penunjuk node sebelumnya dan mengakses pointer next yang 
            akan menunjuk node selanjutnya dari node sebelmu yang di tunjuk dan akan 
            menampung variabel current.next yaitu
            variabel current yang mengakses variabel
            pointer next yaitu penunjuk ke node selanjutnya.
            */
            current.prev.next = current.next;
        }
        /*if merupakan statement control yang berfungsi 
        mengontrol alurnya pemrograman. Saat kondisi pada 
        if terpenuhi yaitu current == tail, maka code pada 
        badan if lah yang akan tereksekusi.
        */
        if (current==tail){
            /*tail merupakan variabel sebagai penanda elemen terakhir
            dari node akan variabel current yang mengakses pointer prev yang menunjuk ke node sebelum
            dari current.
            */
            tail = current.prev;
        /*variabel head sebagai penanda node terdepan dari linkedlist
        disini mengakses variabel pointer prev yang menunjuk ke node
        sebelum dari head dan akan diisi dengan newNode.
        */
        }else{
            /*current.next merupakan sebuah variabel current yang
            mengakses variabel pointer yaitu next yang digunakan sebagai
            penunjuk node selanjutnya dan mengakses pointer prev yang 
            akan menunjuk node sebelum dari node setelah yang di tunjuk dan akan 
            menampung variabel current.prev yaitu
            variabel current yang mengakses variabel
            pointer prev yaitu penunjuk ke node sebelumnya.
            */
            current.next.prev = current.prev;
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
        while(current!=null){
            /*System.out.println(current.element) 
            berfungsi untuk menampilkan current.elemen yaitu elemen
            yang berada pada node current ke layar.
            */
            System.out.println(current.element);
            /*current merupakan sebuah variabel sebagai bantuan
            untuk menampung variabel current.next yaitu dia 
            sendiri sebagai variabel current yang mengakses variabel
            pointer next yaitu penunjuk ke node selanjutnya.
            */
            current = current.next;
        }
    }

}
/*Main merupakan sebuah class public yang merupakan class
dimana tempat public static void main berada.
*/
public class Main2 {
    /*public static void main(String[] args) merupakan tempat entry
    point bagi java virtual machine ke program java untuk mengeksekusi
    byte code java-nya.
    */
    public static void main(String[] args) {
        /*listUber merupakan linkedlist baru yang di buat dengan menambahkan nama
        class-nya yaitu DoubleLinkedList diikuti nama linkedlist-nya yaitu listUber yang
        di dalamnya memuat keyword new yang berfungsi untuk membuat objek atau instance
        pada sebuah class dan terakhir diikuti constructornya yaitu DoubleLinkedList();
        */
        DoubleLinkedList listUber = new DoubleLinkedList();
        /*listUber.insertHead digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listUber, opretor titik, setelah itu nama
        methodnya yaitu insertHead dan ini parameternya sesuai dengan user.
        */
        listUber.insertHead("Poli & Apriyani");
        /*listUber.insertHead digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listUber, opretor titik, setelah itu nama
        methodnya yaitu insertHead dan ini parameternya sesuai dengan user.
        */
        listUber.insertHead("Putri");
        /*listUber.insertTail digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listUber, opretor titik, setelah itu nama
        methodnya yaitu insertTail  dan ini parameternya sesuai dengan user.
        */
        listUber.insertTail("Gregoria");
        /*listUber.insertTail digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listUber, opretor titik, setelah itu nama
        methodnya yaitu insertTail  dan ini parameternya sesuai dengan user.
        */
        listUber.insertTail("Utami & Aprilia");
        /*listUber.insertTail digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listUber, opretor titik, setelah itu nama
        methodnya yaitu insertTail dan ini parameternya sesuai dengan user.
        */
        listUber.insertTail("Melati");
        /*System.out.println("List Wakil Indonesia Di Piala Uber: ") 
        berfungsi untuk menampilkan ""List Wakil Indonesia Di Piala Uber: "
        ke layar.
        */
        System.out.println("List Wakil Indonesia di Piala Uber:");
        /*listUber.printList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listUber, opretor titik, setelah itu nama
        methodnya yaitu printList dan elemen-elemen dari linkedlist akan tercetak ke layar.
        */
        listUber.printList();
        /*listUber.deleteElement digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listUber, opretor titik, setelah itu nama
        methodnya yaitu deleteElement dan elemen yang dimasukkan ke parameter akan di hapus
        dari linked list.
        */
        listUber.deleteElement("Utami & Aprilia");
        /*listUber.insertNextTo digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listUber, opretor titik, setelah itu nama
        methodnya yaitu insertNextTo dan elemen akan ditambahkan setelah elemen tertentu yang
        dimasukkan ke dalam parameter.
        */
        listUber.insertNextTo("Gregoria", "Putri & Aprilia");
        /*System.out.println("List Wakil Indonesia Di Piala Uber (Updated): ") 
        berfungsi untuk menampilkan ""List Wakil Indonesia Di Piala Uber (Updated): "
        ke layar.
        */
        System.out.println("List Wakil Indonesia di Piala Uber (Updated):");
        /*listUber.printList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listUber, opretor titik, setelah itu nama
        methodnya yaitu printList dan elemen-elemen dari linkedlist akan tercetak ke layar.
        */
        listUber.printList();


    }
    
}
