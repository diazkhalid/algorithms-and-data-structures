package com.Modul_3;

/**
 * import java.io.PrintStream untuk mengambil method-method yang ada pada library PrintStream
 * pada java
 */
import java.io.PrintStream;

/**
 * class Method merupakan class yang didalamnya aka berisikan beberapa method-method yang diperlukan
 * dalam pembuatan program
 */
class Method {
    /**
     * Node root merupakan variabel root yang bertipe data Node, variabel ini
     * akan digunakan sebagai node akar dari tree
     */
    Node root;
    
    /**
     * Method() merupakan konstruktor dari class method, nilai dari varibel yang berada pada class method akan 
     * inputkan melalui konstruktor ini
     */
    Method(String data){
        /**
         * root merupakan variabel node sebagai akar dari tree dan dijadikan sebagai objek dari class Node.
         * Nilainya di masukkan melalui konstruktor Node
         */
        root = new Node(data);
    }

    /**
     * method search digunakan untuk mencari parent dari node child
     */
    Node search(String name, Node node){
        /**
         * if merupakan statement control yang berfungsi 
        mengontrol alurnya pemrograman. Saat kondisi pada 
        if terpenuhi yaitu node != null, maka code pada 
        badan if lah yang akan tereksekusi.
         */
        if (node != null){
            /**
                if merupakan statement control yang berfungsi 
                mengontrol alurnya pemrograman. Saat kondisi pada 
                if terpenuhi yaitu node.nama == name, maka code pada 
                badan if lah yang akan tereksekusi.
            */
            if (node.nama == name){
                /**
                 * return berfungsi untuk mengembalikan nilai dari program menjadi nilai method
                 * ketika di panggil
                 */
                return node;
                 /**
                   * else merupakan control statement yang akan mengatur jalannya
                   * sebuah program. Code pada badan else akan di eksekusi jifa syarat
                   * kondisi dari if dan else if tidak terpenuhi.
                   */ 
            }else{
                /**
                 * variabel foundNode bertipe data Node didalamnya menyimpan nilai rekursif dari fungsi search
                 */
                Node foundNode = search (name, node.leftChild);
                /**
                if merupakan statement control yang berfungsi 
                mengontrol alurnya pemrograman. Saat kondisi pada 
                if terpenuhi yaitu foundNode == name, maka code pada 
                badan if lah yang akan tereksekusi.
                */
                if (foundNode == null){
                    /**
                     * variabel foundNode bertipe data Node didalamnya menyimpan nilai rekursif dari fungsi search
                     */
                    foundNode = search(name, node.rightChild);
                }
                /**
                 * return berfungsi untuk mengembalikan nilai dari program menjadi nilai method
                 * ketika di panggil
                 */
                return foundNode;
            }
            /**
            * else merupakan control statement yang akan mengatur jalannya
            * sebuah program. Code pada badan else akan di eksekusi jifa syarat
            * kondisi dari if dan else if tidak terpenuhi.
           */ 
        }else{
            /**
             * return berfungsi untuk mengembalikan nilai dari program menjadi nilai method
             * ketika di panggil
             */
            return null;
        }
    }
    /**
     * addChild merupakan method untuk menambahkan daun dari tree dengan 3 variabel
     * sebagai paramaternya. method ini bertipe void jadi tidak akan mengembalikan nilai
     * 
     */
    void addChild(String parent, String child1, String child2){
        /**
         * root1 merupakan variabel dengan tipe data Node yang di dalamnya menyimpan fungsi rekursif
         * dari search
         */
        Node root1 = search(parent, root);
        /**
         * variabel root1 akan mengakses Node leftChild di class Node dan menyimpan nilai dari konstruktor
         * yang memasukkan nilai ke dalam node leftChilde tersebut
         */
        root1.leftChild = new Node(child1);
        /**
         * variabel root1 akan mengakses Node rightChild di class Node dan menyimpan nilai dari konstruktor
         * yang memasukkan nilai ke dalam node rightChilde tersebut
         */
        root1.rightChild = new Node(child2);

        
    }
    /**
     * method traversePreOrder memiliki beberapa variabel sebagai parameternya, method ini untuk 
     * mengubah tree menjadi traverse Pre order
     */
    public void traversePreOrder(StringBuilder sb, String padding, String pointer, Node node) {
        /**
        if merupakan statement control yang berfungsi 
        mengontrol alurnya pemrograman. Saat kondisi pada 
        if terpenuhi yaitu node != null, maka code pada 
        badan if lah yang akan tereksekusi.
        */
        if (node != null) {
            /**
             * apppend merupakan method yang berada pada class StringBuilder
             * append digunakan untuk menambah nilai baru pada objek
             */
            sb.append(padding);
            sb.append(pointer);
            sb.append(node.nama);
            sb.append("\n");
            
            /**
             * StringBuilder merupakan sebuah class yang berada pada java, berfungsi mengelolah data dan nilai
             * karakter. class ini berada pada package lang
             * disini sebuah variabel paddingBuilder dijadikan sebagai objek dari class StringBuilder
             */
            StringBuilder paddingBuilder = new StringBuilder(padding);
            /**
             * variabel paddingBuilder objek dari class StringBuilder tadi memanggil method append untuk menambahkan nilai
             */
            paddingBuilder.append("│  ");
            /**
             * variabel paddingForBoth denagan tipe data String memuat nilai dari variabel objek class
             * StringBuilder yang memanggil method toString()
             */
            String paddingForBoth = paddingBuilder.toString();
            /**
             * variabel paddingForRight dengan tipe data String memuat nilai └──
             */
            String pointerForRight = "└──";
            String pointerForLeft = (node.rightChild != null) ? "├──" : "└──";
            /**
             * fungsi traversePreOreder di panggil lagi di dalam fungsi itu sendiri
             * ini merupkan fungsi rekursif dimana parameternya akan diubah dan terdapat
             * kondisi yang akan menghentikan rekursif ini
             */
            traversePreOrder(sb, paddingForBoth, pointerForLeft, node.leftChild);
            traversePreOrder(sb, paddingForBoth, pointerForRight, node.rightChild);
        }
    }
    /**
     * method print befungsi untuk menampilkan data dari tree
     * terdapat parameter os dari class PrintStream yang merupakan libary dari java
     */
    public void print(PrintStream os) {
        /**
         * variabel sb merupakan objek dari class StringBuilder, 
         * objek sb dibuat dengan konstruktor dari StringBuilder yaitu StringBuilder()
         */
        StringBuilder sb = new StringBuilder();
        /**
         * pemanggilan method traversePreOrder dengan parameter sb, "", "", dan this.root 
         */
        traversePreOrder(sb, "", "", this.root);
        /**
         * variabel os memainggil fungsi print itu
         * dan akan menampilkan variabel sb yang memanggil method toString
         */
        os.print(sb.toString());
    }
    
    
    
    
}
