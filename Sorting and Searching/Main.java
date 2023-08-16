package com.Modul_2;

/*Main merupakan sebuah class public yang merupakan class
dimana tempat public static void main berada.
*/
public class Main {
    /*public static void main(String[] args) merupakan tempat entry
    point bagi java virtual machine ke program java untuk mengeksekusi
    byte code java-nya.
    */
    public static void main(String[] args) {
        /*timA merupakan linkedlist baru yang di buat dengan menambahkan nama
        class-nya yaitu DoubleLinkedList diikuti nama linkedlist-nya yaitu timA yang
        di dalamnya memuat keyword new yang berfungsi untuk membuat objek atau instance
        pada sebuah class dan terakhir diikuti constructornya yaitu DoubleLinkedList();
        */
        DoubleLinkedList timA = new DoubleLinkedList();
        /*timA.insertElement digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu timA, opretor titik, setelah itu nama
        methodnya yaitu insertElement dan isi parameternya sesuai dengan user.
        */
        timA.insertElement("Mukhlis", 180, 50);
        /*timA.insertElement digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu timA, opretor titik, setelah itu nama
        methodnya yaitu insertElement dan isi parameternya sesuai dengan user.
        */
        timA.insertElement("Anto", 176, 40);
        /*timA.insertElement digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu timA, opretor titik, setelah itu nama
        methodnya yaitu insertElement dan isi parameternya sesuai dengan user.
        */
        timA.insertElement("Kaka", 155, 33);
        /*timA.insertElement digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu timA, opretor titik, setelah itu nama
        methodnya yaitu insertElement dan isi parameternya sesuai dengan user.
        */
        timA.insertElement("Joko", 162, 39);
        /*timA.insertElement digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu timA, opretor titik, setelah itu nama
        methodnya yaitu insertElement dan isi parameternya sesuai dengan user.
        */
        timA.insertElement("Faris", 167, 41);
        /*timA.insertElement digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu timA, opretor titik, setelah itu nama
        methodnya yaitu insertElement dan isi parameternya sesuai dengan user.
        */
        timA.insertElement("Kiki", 158, 35);
        /*timA.insertElement digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu timA, opretor titik, setelah itu nama
        methodnya yaitu insertElement dan isi parameternya sesuai dengan user.
        */
        timA.insertElement("Dika", 179, 45);
        /*timA.insertElement digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu timA, opretor titik, setelah itu nama
        methodnya yaitu insertElement dan isi parameternya sesuai dengan user.
        */
        timA.insertElement("Brian", 185, 20);
        /*System.out.println("Pemain Tim A") 
        berfungsi untuk menampilkan "Pemain Tim A"
        ke layar.
        */
        System.out.println("Pemain Tim A");
        /*timA.printList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu timA, opretor titik, setelah itu nama
        methodnya yaitu printList.
        */
        timA.printList();
        /*System.out.println("========") 
        berfungsi untuk menampilkan "========"
        ke layar.
        */
        System.out.println("========");
        /*System.out.println("Round 1\n--------") 
        berfungsi untuk menampilkan "Round 1\n--------"
        ke layar.
        */
        System.out.println("Round 1\n--------");
        /*timA.bubbleSort digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu timA, opretor titik, setelah itu nama
        methodnya yaitu bubbleSort. Saat method ini dipanggil maka linkedlist akan
        diurutkan dengan algoritma bubble Sort
        */
        timA.bubbleSort();
        /*timA.printList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu timA, opretor titik, setelah itu nama
        methodnya yaitu printList.
        */
        timA.printList();
        /*System.out.println("========") 
        berfungsi untuk menampilkan "========"
        ke layar.
        */
        System.out.println("========");
        /*System.out.println("Round 2\n--------") 
        berfungsi untuk menampilkan "Round 2\n--------"
        ke layar.
        */
        System.out.println("Round 2\n--------");
        /*timA.selectionSort digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu timA, opretor titik, setelah itu nama
        methodnya yaitu selectionSort. Saat method ini dipanggil maka linkedlist akan
        diurutkan dengan algoritma selection Sort
        */
        timA.selectionSort();
        /*timA.printList digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama likedlistnya yaitu timA, opretor titik, setelah itu nama
        methodnya yaitu printList.
        */
        
        timA.printList();
        System.out.println("Round 3\n--------");
        timA.InsertionSort();
        timA.printList();
    }
    
}
