package com.Modul_1;
/*public class Node merupakan class yang 
digunakan sebagai blueprint untuk membuat node baru 
yang di dalamnya terdapat constructor, variabel 
pointer dan variabel tempat penyimpanan elemen.
*/
public class Node {
    /*variabel element digunakan untuk
    menampung elemen-elemen dari node,
    variabel element ini bertipe data Object 
    agar dapat menampung elemen dengan berbagai 
    macam tipe data, baik itu int, float, String, char, bahkan boolean.
    */
    Object element;
    /*Node next merupakan sebuah variabel 
    pointer yang berfungsi untuk menunjuk 
    arah ke node selanjutnya.
    */
    Node next;
    /*Node prev merupakan sebuah variabel 
    pointer yang berfungsi untuk menunjuk 
    arah ke node sebelumnya.
    */
    Node prev;
    /*Node(Object data) merupakan sebuah 
    constructor yang berfungsi untuk membuat 
    node baru dengan memasukkan data
    dengan tipe data Object sebagai elemennya.
    */
    Node(Object data){
        /*element = data merupakan variabel element yang
        menampung nilai dari variabel data yang dimasukkan
        melalui constructor.
        */
        element = data;
    }
}
