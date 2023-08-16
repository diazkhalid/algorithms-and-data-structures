package com.Modul_3;

/*Main merupakan sebuah class public yang merupakan class
dimana tempat public static void main berada.
*/
public class Main {
    /*public static void main(String[] args) merupakan tempat entry
    point bagi java virtual machine ke program java untuk mengeksekusi
    byte code java-nya.
    */
    public static void main(String[] args) {
        /*tree merupakan objek baru yang di buat dengan menambahkan nama
        class-nya yaitu Method diikuti nama objek-nya yaitu tree yang
        di dalamnya memuat keyword new yang berfungsi untuk membuat objek atau instance
        pada sebuah class dan terakhir diikuti constructornya yaitu Method();
        */
        Method tree = new Method("Uno");
        /*tree.addChild digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama objek yaitu tree, opretor titik, setelah itu nama
        methodnya yaitu addChild dan isi parameternya sesuai dengan user.
        */
        tree.addChild("Uno", "Alita", "Dewi");
        /*tree.addChild digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama objek yaitu tree, opretor titik, setelah itu nama
        methodnya yaitu addChild dan isi parameternya sesuai dengan user.
        */
        tree.addChild("Alita", "Putri", "Pangeran");
        /*tree.addChild digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama objek yaitu tree, opretor titik, setelah itu nama
        methodnya yaitu addChild dan isi parameternya sesuai dengan user.
        */
        tree.addChild("Dewi", "Kholilul", "Habib");
        /*tree.addChild digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama objek yaitu tree, opretor titik, setelah itu nama
        methodnya yaitu addChild dan isi parameternya sesuai dengan user.
        */
        tree.addChild("Putri", "Rifki", "Alfiana");
        /*tree.addChild digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama objek yaitu tree, opretor titik, setelah itu nama
        methodnya yaitu addChild dan isi parameternya sesuai dengan user.
        */
        tree.addChild("Pangeran", "Rozaki", "Wahyu");
        /*tree.addChild digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama objek yaitu tree, opretor titik, setelah itu nama
        methodnya yaitu addChild dan isi parameternya sesuai dengan user.
        */
        tree.addChild("Kholilul", "Rizki", "Adit");
        /*tree.addChild digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama objek yaitu tree, opretor titik, setelah itu nama
        methodnya yaitu addChild dan isi parameternya sesuai dengan user.
        */
        tree.addChild("Habib", "Yogi", "Nadya");
        /*tree.print digunakan untuk memanggil suatu method, yaitu dengan cara
        menggunakan nama objek-nya yaitu tree, opretor titik, setelah itu nama
        methodnya yaitu print.
        */
        tree.print(System.out);
    }
    
}
