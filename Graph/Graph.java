package com.Modul_4;

/**
 * Graph merupakan class yang digunakan sebagai blueprint untuk
 * membuat objek graph 
 */
public class Graph{
    /**
     * haed dan tail merupakan variabel yang menandakan vertex terdepan dan terbelakang
     * dari linkedlist vertex
     */
    Vertex head, tail;
    /**
     * current merupakan variabel dengan tipe data class Vertex karena merupakan
     * objek dari vartex tersebut, berfungsi untuk menampung posisi terkini dari
     * linkedlist vertex
     */
    Vertex current;
    /**
     * currEdge merupakan variabel objek dari edge, berfungsi untuk memnunjuk posisi
     * terkini dari edge
     */
    Edge currEdge;
    /**
     * post merupakan variabel integer untuk menampung elemen pos dari class Vertex
     */
    int post = 0;
    /**
     *  addVertex merupakan method untuk menambahkan vertex baru untuk linkedlist vertex 
     *  pada graph
     */
    void addVertex(String data){
        /**
         * newVer merupakan objek vertex baru yang dibuat dengan class Vertex  dan konstruktor
         * Vertex(), dimana konstruktor akan mengoper nilai dari parameter method addVertex ke
         * elemen nama pada class Vertex
         */
        Vertex newVer = new Vertex(data);
        /**
         * if merupakan statement control yang berfungsi 
         * mengontrol alurnya pemrograman. Saat kondisi pada 
         * if terpenuhi yaitu head == null, maka code pada 
         * badan if lah yang akan tereksekusi.
         */
        if(head==null){
            /**
             * variabel vertex head dan tail akan mengisi variabel objek vertex newVer yang baru
             * saja dibuat 
             */
            head = tail = newVer;
        /**
         * else merupakan control statement yang akan mengatur jalannya
         * sebuah program. Code pada badan else akan di eksekusi jifa syarat
         * kondisi dari if dan else if tidak terpenuhi.
         */ 
        }else{
            /**
             * variabel tail.next akan menampung variabel objek vertex newVer
             */
            tail.next = newVer;
            /**
             * tail di pindah pada newVer, dimana sekarang newVer akan menjadi tail dari 
             * linkedlist
             */
            tail = newVer;
        }
        /**
         * variabel post yang berada akan diisi oleh variabel objek
         * newVer.pos pada class Vertex
         */
        newVer.pos = post;
        /**
         * variabel post di increment nilainya menjadi +=1
         */
        post++;
    }
    /**
     * findVertex merupkan method untuk mencari vertex, method ini akan
     * mereturn nilai Vertex
     * 
     */
    Vertex findVertex(String lab){
        /**
         * current merupakan variabel untuk membantu menunjuk posisi terkini
         * dari linkedlist, current akan menampung head;
         */
        current = head;
        /*while merupakan statement looping yang berfungsi
        untuk mengulang pengeksekusian code pada
        badan while selama syarat yaitu current!=null terpenuhi.
        */
        while (current != null){
        /**
         * if merupakan statement control yang berfungsi 
         * mengontrol alurnya pemrograman. Saat kondisi pada 
         * if terpenuhi yaitu lab == current.nama, maka code pada 
         * badan if lah yang akan tereksekusi.
         */
            if(lab == current.nama){
                /**
                 * return untuk mempassing current ke method findVertex
                 */
                return current;   
            }
            /*current merupakan sebuah variabel sebagai bantuan
            untuk menampung variabel current.next yaitu dia 
            sendiri sebagai variabel current yang mengakses variabel
            pointer next yaitu penunjuk ke node selanjutnya.
            */
            current = current.next;
        }
        /**
         * return akan mengebalikan nilai null ke method findVertex
         */
        return null;
    }

    /**
     * addEdge merupakan method untuk menambahkan edge baru
     * baru setiap vertex yang di masukkan sebagai parameter
     * pertama dari method, dan parameter kedua akan menjadi edgenya
     */
    void addEdge(String kota, String tujuan){
        /**
         * variabel from yang bertipe data vertex memanggil method findVertex untuk mereturn
         * vertex yang memiliki nilai dengan parameter
         */
        Vertex from = findVertex(kota);
        /**
         * variabel from yang bertipe data vertex memanggil method findVertex untuk mereturn
         * vertex yang memiliki nilai dengan parameter
         */
        Vertex to = findVertex(tujuan);
        /**
         * tempEdge merupakan variabel objek class Edge yang menapung edge lain yaitu from.edge
         */
        Edge tempEdge = from.edge;
        /**
         * newTo merupakan variabel objek class Edge yang akan dibuat menggunakan class Edge
         * dan konstruktor Edge dan akan mempassing nilai to pada variabel vertex pada class Edge
         */
        Edge newTo = new Edge(to);
        /**
         * if merupakan statement control yang berfungsi 
         * mengontrol alurnya pemrograman. Saat kondisi pada 
         * if terpenuhi yaitu from.edge == null, maka code pada 
         * badan if lah yang akan tereksekusi.
         */
        if(from.edge == null){
            /**
             * from.edge merupakan variabel objek vertex from yang akan mengakses variabel
             * objek edge dan akan memuat variabel objek class Edge lain yaitu newTo
             */
            from.edge = newTo;
        /**
         * else merupakan control statement yang akan mengatur jalannya
         * sebuah program. Code pada badan else akan di eksekusi jifa syarat
         * kondisi dari if dan else if tidak terpenuhi.
         */ 
        }else{
            /*while merupakan statement looping yang berfungsi
            untuk mengulang pengeksekusian code pada
            badan while selama syarat yaitu tempEdge.next != null terpenuhi.
            */
            while(tempEdge.next != null){
                /**
                 * variabel tempEdge akan menampung variabel tempEdge selanjutnya
                 */
                tempEdge = tempEdge.next;
            }
            /**
             * variabel tempEdge.next akan menampung variabel objek edge newTo
             */
            tempEdge.next = newTo;
        }
    }
    /*print() merupakan sebuah method void, yang artinya
    method ini tidak akan mengembalikan nilai. Method ini
    digunakan untuk mencetak/menampilkan elemen pada linkedlist vertex maupun edge. 
    */
    void print(){
        /**
         * current merupakan variabel untuk membantu menunjuk posisi terkini
         * dari linkedlist, current akan menampung head;
         */
        current = head;
        /**
         * variabel currEdge akan menampung variabel head yang mengakses variabel objek
         * edge pada class Vertex
         */
        currEdge = head.edge;
        /*while merupakan statement looping yang berfungsi
        untuk mengulang pengeksekusian code pada
        badan while selama syarat yaitu current != null terpenuhi.
        */
        while(current != null){
            /**
             * system akan menampilkan "\nVertex: "+current.nama+" --> " ke layar
             */
            System.out.print("\nVertex: "+current.nama+" --> ");
        /*while merupakan statement looping yang berfungsi
        untuk mengulang pengeksekusian code pada
        badan while selama syarat yaitu currEdge != null terpenuhi.
        */
            while(currEdge != null){
            /**
             * system akan menampilkan currEdge.dest.nama+" " ke layar
             */
                System.out.print(currEdge.dest.nama+" ");
        /**
         * variabel currEdge akan menampung nilai dari variabel curreEdge selanjutnya,
         * dalam arti lain currEdge pindah ke edge selanjutnya
         */
                currEdge = currEdge.next;
            }
            /*current merupakan sebuah variabel sebagai bantuan
            untuk menampung variabel current.next yaitu dia 
            sendiri sebagai variabel current yang mengakses variabel
            pointer next yaitu penunjuk ke node selanjutnya.
            */
            current = current.next;
        /**
         * if merupakan statement control yang berfungsi 
         * mengontrol alurnya pemrograman. Saat kondisi pada 
         * if terpenuhi yaitu from.edge == null, maka code pada 
         * badan if lah yang akan tereksekusi.
         */
            if (current != null){
        /**
         * variabel currEdge akan menampung nilai dari variabel current.edge pada
         * class Vertex
         */
                currEdge = current.edge;
            }
        }
    }
    
    /**
     * bfs merupakan method dari Breadth First Search, yang merupakan
     * algoritma untuk mengunjungi edge dari vertex-vertex pada graph
     */
    void bfs(String kota){
        /**
         * q merupakan objek Queue yang dibuat dengan class Queue dan konstruktor
         * Queue(). Terdapat keyword new yang berfungsi membuat intance/objek baru
         * dari sebuah class, classnya yaitu Queue
         */
        Queue q = new Queue();
        /**
         * variabel fromVertex yang bertipe data vertex memanggil method findVertex untuk mereturn
         * vertex yang memiliki nilai dengan parameter
         */
        Vertex fromVertex = findVertex(kota); 
        /**
         * visited merupakan objek boolean yang berfungsi untuk menandai
         * vertex yang telah dikunjungi
         */
        boolean visited[] = new boolean[post];
        /**
         * variabel visited akan menampung indeks dari vertex dan
         * ditandi sebagai true, maksudnya bahwa vertex tersebut sudah di kunjungi
         */
        visited[fromVertex.pos] = true;
        /**
         * objek Queue q memangggil method pushElement dan parameternya
         * nilai dari variabel nama pada objek class vertex yaitu fromVertex
         */
        q.pushElement(fromVertex.nama);
        /*while merupakan statement looping yang berfungsi
        untuk mengulang pengeksekusian code pada
        badan while selama syarat yaitu q.isEmpty() == false terpenuhi.
        */
        while(q.isEmpty() == false){
            /**
             * temp merupakan variabel bantu untuk menyimpan element
             * yang dikeluarkan dari Queue q saat pemanggilan method popElement
             * yang mereturn elemen yang dikeluarkan itu
             */
            String temp = q.popElement();
            /**
             * system akan menampilkan temp + " " ke layar
             */
            System.out.print(temp + " ");
            /**
             * variabel fromVertex yang bertipe data vertex memanggil method findVertex untuk mereturn
             * vertex yang memiliki nilai dengan parameter
             */
            fromVertex = findVertex(temp);
        /*while merupakan statement looping yang berfungsi
        untuk mengulang pengeksekusian code pada
        badan while selama syarat yaitu q.isEmpty() == false terpenuhi.
        */
            while(fromVertex.edge != null){
                /**
                 * if merupakan statement control yang berfungsi 
                 * mengontrol alurnya pemrograman. Saat kondisi pada 
                 * if terpenuhi yaitu !visited[fromVertex.edge.dest.pos], maka code pada 
                 * badan if lah yang akan tereksekusi.
                 */
                if(!visited[fromVertex.edge.dest.pos]){
                    /**
                     * objek Queue q memanggil method pushElement yang berfungsi
                     * untuk memasukkan elemen pada queue, element yang dimasukkan
                     * yaitu fromVertex.edge.dest.nama
                     */
                    q.pushElement(fromVertex.edge.dest.nama);
                    /**
                     * variabel visited akan menampung indeks dari vertex dan
                     * ditandi sebagai true, maksudnya bahwa vertex tersebut sudah di kunjungi
                     */
                    visited[fromVertex.edge.dest.pos] = true;
                }
                /**
                 * variabel fromVertex.edge akan menampung variabel fromVertex.edge selanjutnya,
                 * jadi posis fromVertex.edge sudah bergeser ke sebelahnya
                 */
                fromVertex.edge = fromVertex.edge.next;
            }
        }
    }
}

