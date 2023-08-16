package com.Modul_1;
/*class LinkedList merupakan class yang digunakan sebagai blueprint untuk 
membuat linkedlist dimana didalamnya terdapat konstruktor, inisialisasi node dan
method-method yang di perlukan untuk menambah element, 
menghapus element dan mencetak elemen. 
*/
class LinkedList{
    /*Node head merupakan sebuah variabel sebagai penanda 
    elemen terdepan dari sebuah linkedlist,digunakan 
    class Node sebagai tipe data karena head merupakan 
    representasi dari node.
    */
    Node head;
    /*Node current merupakan sebuah variabel sebagai bantuan
    untuk menampung variabel dengan tipe data Node sehingga mempermudah 
    penunjuk posisi dari node.
    */
    Node current;
    /*LinkedList() merupakan sebuah constructor 
    untuk membuat LinkedList baru,constructor 
    ini merupakan constructor tanpa nilai awal 
    dimana head-nya di set ke null.
    */
    LinkedList(){
        /*variabel head yang merupakan sebuah 
        varibel penanda elemen terdepan dari sebuah linkedlist,
        disini nilai-nya di-set ke null karena contructor ingin agar
        linkedlist yang dibuat belum memiliki elemen awal.
        */
        head = null;
    }
    /*LinkedList(Object data) merupakan sebuah constructor 
    untuk membuat LinkedList baru,constructor 
    ini merupakan constructor dengan nilai awal 
    dimana variabel head akan memuat sebuah node baru yang
    elemennya yaitu data dengan tipe data Object di masukkan 
    melalui constructor Node.
    */
    LinkedList(Object data){
        /*variabel head yang merupakan sebuah 
        varibel penanda elemen terdepan dari sebuah linkedlist,
        disini digunakan untuk menampung node baru beserta elemennya 
        yang dibuat menggunakan constructor Node.
        
        */
        head = new Node(data);
    }
    /*insertList merupakan sebuah method void, yang artinya
    method ini tidak akan mengembalikan nilai. Method ini
    digunakan untuk menambahkan elemen dari linkedlist
    dengan mengisi parameternya yaitu data dengan tipe data Object.
    */
    void insertList(Object data){
        /*newNode merupkan node baru yang dibentuk dengan class Node
        sebagai tipe datanya dan memuat keyword new yang berfungsi 
        untuk membuat objek atau instance dari sebuah class dan diikuti
        oleh constructornya yaitu Node(data).
        */
        Node newNode = new Node(data);
        /*if merupakan statement control yang berfungsi 
        mengontrol alurnya pemrograman. Saat kondisi pada 
        if terpenuhi yaitu head == null, maka code pada 
        badan if lah yang akan tereksekusi.
        */
        if (head == null){
        /*variabel head yang merupakan penanda elemen awal dari
        linkedlist akan memuat elemen dari newNode yang merupakan 
        node baru yang dibuat dengan constructor Node.
        */
            head = newNode;
            /*return digunakan untuk mengembalikan 
            pengeksekuian sehingga eksekusi berhenti
            pada badan if dan code di bawahnya tidak akan di eksekusi. 
            */
            return;
        }
        /*current merupakan sebuah variabel sebagai bantuan
        untuk menampung variabel Head agar mempermudah
        penunjuk posisi dari node.
        */
        current = head;
        /*while merupakan statement looping yang berfungsi
        untuk mengulang pengeksekusian code pada badan while selama syarat
        yaitu current.next!=null terpenuhi.
        */
        while(current.next!=null){
            /*current merupakan sebuah variabel sebagai bantuan
            untuk menampung variabel current.next yaitu dia 
            sendiri sebagai variabel current yang mengakses variabel
            pointer next yaitu penunjuk ke node selanjutnya.
            */
            current = current.next;
        }
        /*current.next merupakan sebuah variabel current yang
        mengakses variabel pointer yaitu next yang digunakan sebagai
        penunjuk node selanjutnya setelah current akan ditambahkan 
        newNode sebagai node selanjutnya dari current.
        */
        current.next = newNode;
    }
    /*insertNextTo merupakan sebuah method void, yang artinya
    method ini tidak akan mengembalikan nilai. Method ini
    digunakan untuk menambahkan elemen setelah elemen tertentu 
    dari linkedlist, dimana parameter yaitu Object element sebagai
    elemen tertentu yang akan di tambahkan Object data pada setelahnnya. 
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
        untuk mengulang pengeksekusian code pada
        badan while selama syarat yaitu current.element!=element terpenuhi.
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
                /*System.out.println("Insert fails, name not found") 
                berfungsi untuk menampilkan "Insert fails, name not found"
                ke layar.
                */
                System.out.println("Insert fails, name not found");
            }
        }
        /*if merupakan statement control yang berfungsi 
        mengontrol alurnya pemrograman. Saat kondisi pada 
        if terpenuhi yaitu urrent.next == null, maka code pada 
        badan if lah yang akan tereksekusi.
        */
        if (current.next == null){
            /*current.next merupakan sebuah variabel current yang
            mengakses variabel pointer yaitu next yang digunakan sebagai
            penunjuk node selanjutnya setelah current akan ditambahkan 
            newNode sebagai node selanjutnya dari current.
            */
            current.next = newNode;
            /*newNode.next merupakan sebuah node yaitu newNode yang mengakses variabel
            pointer next untuk menunjuk ke node selajutnya dari newNode itu dan nilainya
            akan di-set ke null.
            */
            newNode.next = null;
            /*return digunakan untuk mengembalikan 
            pengeksekuian sehingga eksekusi berhenti
            pada badan if dan code di bawahnya tidak akan di eksekusi. 
            */
            return;
        }
        /*newNode.next merupakan sebuah node yaitu newNode yang mengakses variabel
        pointer next untuk menunjuk ke node selajutnya dari newNode itu dan 
        akan memuat node current.next yaitu node selanjutnya setelah current.
        */
        newNode.next = current.next;
        /*current.next merupakan sebuah variabel current yang
        mengakses variabel pointer yaitu next yang digunakan sebagai
        penunjuk node selanjutnya setelah current akan ditambahkan 
        newNode sebagai node selanjutnya dari current.
        */
        current.next = newNode;
    }
    /*deleteElement merupakan sebuah method void, yang artinya
    method ini tidak akan mengembalikan nilai. Method ini
    digunakan untuk menghapus elemen yang dimasukkan kedalam parameter. 
    */
    void deleteElement(Object element){
        /*current merupakan sebuah variabel sebagai bantuan
        untuk menampung variabel Head agar mempermudah
        penunjuk posisi dari node.
        */
        current = head;
        /*if merupakan statement control yang berfungsi 
        mengontrol alurnya pemrograman. Saat kondisi pada 
        if terpenuhi yaitu current.element == element, maka code pada 
        badan if lah yang akan tereksekusi.
        */
        if (current.element == element){
            /*head merupakan sebuah variabel sebagai penanda elemen pertama dari
            sebuah linked list dan di dalamnya memuat head.next yaitu dia 
            sendiri sebagai variabel current yang mengakses variabel
            pointer next yaitu penunjuk ke node selanjutnya.
            */
            head = head.next;
            /*return digunakan untuk mengembalikan 
            pengeksekuian sehingga eksekusi berhenti
            pada badan if dan code di bawahnya tidak akan di eksekusi. 
            */
            return;
        }
        /*while merupakan statement looping yang berfungsi
        untuk mengulang pengeksekusian code pada
        badan while selama syarat yaitu current.element!=element terpenuhi.
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
                /*System.out.println("Delete fails, name not found") 
                berfungsi untuk menampilkan "Delete fails, name not found"
                ke layar.
                */
                System.out.println("Delete fails, name not found");
                /*return digunakan untuk mengembalikan 
                pengeksekuian sehingga eksekusi berhenti
                pada badan if dan code di bawahnya tidak akan di eksekusi. 
                */
                return;
            }
        }
        /*Node temp merupakan sebuah variabel bantuan untuk 
        menyimpan node current.
        */
        Node temp = current;
        /*current merupakan sebuah variabel sebagai bantuan
        untuk menampung variabel Head agar mempermudah
        penunjuk posisi dari node.
        */
        current = head;
        /*while merupakan statement looping yang berfungsi
        untuk mengulang pengeksekusian code pada
        badan while selama syarat yaitu current.next!=temp terpenuhi.
        */
        while (current.next!=temp){
            /*current merupakan sebuah variabel sebagai bantuan
            untuk menampung variabel current.next yaitu dia 
            sendiri sebagai variabel current yang mengakses variabel
            pointer next yaitu penunjuk ke node selanjutnya.
            */
            current = current.next;
        }
        /*if merupakan statement control yang berfungsi 
        mengontrol alurnya pemrograman. Saat kondisi pada 
        if terpenuhi yaitu temp.next == null, maka code pada 
        badan if lah yang akan tereksekusi.
        */
        if (temp.next == null){
            /*current.next merupakan sebuah variabel current yang
            mengakses variabel pointer yaitu next yang digunakan sebagai
            penunjuk node selanjutnya setelah current akan di-set
            ke null.
            */
            current.next = null;
        /*else merupakan statment control yang berfungsi 
        mengontrol alurnya pemrograman. Saat kondisi pada if tidak
        terpenuhi maka code yang berada pada badan else inilah
        yang akan dieksekusi.
        */
        }else{
            /*current.next merupakan sebuah variabel current yang
            mengakses variabel pointer yaitu next yang digunakan sebagai
            penunjuk node selanjutnya setelah current akan memuat nilai dari
            current.next.next yaitu node current yang akan mengakses 
            variabel pointer next dua kali, sehingga yang dimaksud node kedua
            setelah current.
            */
            current.next = current.next.next;
            /*temp.next merupakan variabel bantuan yang memuat nilai tertentu
            dan mengakses variabel pointer next yang akan di-set ke nilai null. 
            */
            temp.next = null;
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
public class Main {
    /*public static void main(String[] args) merupakan tempat entry
    point bagi java virtual machine ke program java untuk mengeksekusi
    byte code java-nya.
    */
    public static void main(String[] args) {
        /*listThomas merupakan linkedlist baru yang di buat dengan menambahkan nama
        class-nya yaitu LinkedList diikuti nama linkedlist-nya yaitu listThomas yang
        di dalamnya memuat keyword new yang berfungsi untuk membuat objek atau instance
        pada sebuah class dan terakhir diikuti constructornya yaitu LinkedList();
        */
        LinkedList listThomas = new LinkedList();
        /*listUber merupakan linkedlist baru yang di buat dengan menambahkan nama
        class-nya yaitu LinkedList diikuti nama linkedlist-nya yaitu listUber yang
        di dalamnya memuat keyword new yang berfungsi untuk membuat objek atau instance
        pada sebuah class dan terakhir diikuti constructornya yaitu LinkedList();
        */
        LinkedList listUber = new LinkedList();
        /*listSemi merupakan linkedlist baru yang di buat dengan menambahkan nama
        class-nya yaitu LinkedList diikuti nama linkedlist-nya yaitu listSemi yang
        di dalamnya memuat keyword new yang berfungsi untuk membuat objek atau instance
        pada sebuah class dan terakhir diikuti constructornya yaitu LinkedList();
        */
        LinkedList listSemi = new LinkedList();
        /*System.out.println("List Wakil Indonesia Di Piala Thomas: ") 
        berfungsi untuk menampilkan ""List Wakil Indonesia Di Piala Thomas: "
        ke layar.
        */
        System.out.println("List Wakil Indonesia Di Piala Thomas: ");
        /*listThomas.insertList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listThomas, opretor titik, setelah itu nama
        methodnya yaitu insertList dan ini parameternya sesuai dengan user.
        */
        listThomas.insertList("Jojo");
        /*listThomas.insertList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listThomas, opretor titik, setelah itu nama
        methodnya yaitu insertList dan ini parameternya sesuai dengan user.
        */
        listThomas.insertList("Ginting");
        /*listThomas.insertList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listThomas, opretor titik, setelah itu nama
        methodnya yaitu insertList dan ini parameternya sesuai dengan user.
        */
        listThomas.insertList("Cesar");
        /*listThomas.insertList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listThomas, opretor titik, setelah itu nama
        methodnya yaitu insertList dan ini parameternya sesuai dengan user.
        */
        listThomas.insertList("Markus & Kevin");
        /*listThomas.insertList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listThomas, opretor titik, setelah itu nama
        methodnya yaitu insertList dan ini parameternya sesuai dengan user.
        */
        listThomas.insertList("Fajar & Rian");
        /*listThomas.printList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listThomas, opretor titik, setelah itu nama
        methodnya yaitu printList dan elemen-elemen dari linkedlist akan tercetak ke layar.
        */
        listThomas.printList();
        /*System.out.println("List Wakil Indonesia Di Piala Uber: ") 
        berfungsi untuk menampilkan ""List Wakil Indonesia Di Piala Uber: "
        ke layar.
        */
        System.out.println("List Wakil Indonesia Di Piala Uber: ");
        /*listUber.insertList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listUber, opretor titik, setelah itu nama
        methodnya yaitu insertList dan ini parameternya sesuai dengan user.
        */
        listUber.insertList("Putri");
        /*listUber.insertList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listUber, opretor titik, setelah itu nama
        methodnya yaitu insertList dan ini parameternya sesuai dengan user.
        */
        listUber.insertList("Gregoria");
        /*listUber.insertList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listUber, opretor titik, setelah itu nama
        methodnya yaitu insertList dan ini parameternya sesuai dengan user.
        */
        listUber.insertList("Melati");
        /*listUber.insertList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listUber, opretor titik, setelah itu nama
        methodnya yaitu insertList dan ini parameternya sesuai dengan user.
        */
        listUber.insertList("Poli & Apriyani");
        /*listUber.insertList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listUber, opretor titik, setelah itu nama
        methodnya yaitu insertList dan ini parameternya sesuai dengan user.
        */
        listUber.insertList("Utami & Aprilia");
        /*listUber.printList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listUber, opretor titik, setelah itu nama
        methodnya yaitu printList dan elemen-elemen dari linkedlist akan tercetak ke layar.
        */
        listUber.printList();
        /*System.out.println("List Wakil Indonesia Pada Babak Semi Final: ") 
        berfungsi untuk menampilkan "List Wakil Indonesia Pada Babak Semi Final: " 
        ke layar.
        */
        System.out.println("List Wakil Indonesia Pada Babak Semi Final: ");
        /*listSemi.insertList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listSemi, opretor titik, setelah itu nama
        methodnya yaitu insertList dan ini parameternya sesuai dengan user.
        */
        listSemi.insertList("Ginting");
        /*listSemi.insertList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listSemi, opretor titik, setelah itu nama
        methodnya yaitu insertList dan ini parameternya sesuai dengan user.
        */
        listSemi.insertList("Markus & Kevin");
        /*listSemi.insertList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listSemi, opretor titik, setelah itu nama
        methodnya yaitu insertList dan ini parameternya sesuai dengan user.
        */
        listSemi.insertList("Cesar");
        /*listSemi.insertList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listSemi, opretor titik, setelah itu nama
        methodnya yaitu insertList dan ini parameternya sesuai dengan user.
        */
        listSemi.insertList("Fajar & Rian");
        /*listSemi.insertList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listSemi, opretor titik, setelah itu nama
        methodnya yaitu insertList dan ini parameternya sesuai dengan user.
        */
        listSemi.insertList("Jojo");
        /*listSemi.printList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listSemi, opretor titik, setelah itu nama
        methodnya yaitu printList dan elemen-elemen dari linkedlist akan tercetak ke layar.
        */
        listSemi.printList();
        /*listSemi.deleteElement digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listSemi, opretor titik, setelah itu nama
        methodnya yaitu deleteElement dan elemen yang dimasukkan ke parameter akan di hapus
        dari linked list.
        */
        listSemi.deleteElement("Cesar");
        /*listSemi.deleteElement digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listSemi, opretor titik, setelah itu nama
        methodnya yaitu deleteElement dan elemen yang dimasukkan ke parameter akan di hapus
        dari linked list.
        */
        listSemi.deleteElement("Jojo");
        /*listSemi.insertNextTo digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listSemi, opretor titik, setelah itu nama
        methodnya yaitu insertNextTo dan elemen akan ditambahkan setelah elemen tertentu yang
        dimasukkan ke dalam parameter.
        */
        listSemi.insertNextTo("Markus & Kevin", "Jojo");
        /*listSemi.insertNextTo digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listSemi, opretor titik, setelah itu nama
        methodnya yaitu insertNextTo dan elemen akan ditambahkan setelah elemen tertentu yang
        dimasukkan ke dalam parameter.
        */
        listSemi.insertNextTo("Fajar & Rian", "Cesar");
        /*System.out.println("List Wakil Indonesia Pada Babak Semi Final (Updated): ") 
        berfungsi untuk menampilkan "List Wakil Indonesia Pada Babak Semi Final (Updated): " 
        ke layar.
        */
        System.out.println("List Wakil Indonesia Pada Babak Semi Final (Updated): ");
        /*listSemi.printList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu listSemi, opretor titik, setelah itu nama
        methodnya yaitu printList dan elemen-elemen dari linkedlist akan tercetak ke layar.
        */
        listSemi.printList();
        
    }
    
}
