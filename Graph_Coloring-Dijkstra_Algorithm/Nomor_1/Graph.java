package com.Modul_5.Nomor_1;
/**
 * import digunakan untuk memanggil library pada
 * java yaitu Arrays
 */
import java.util.Arrays;
/**
 * Graph merupakan class yang digunakan sebagai blueprint untuk
 * membuat objek graph 
 */
public class Graph {
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
     * indeks merupakan variabel integer untuk menampung elemen idx dari class Vertex
     */
    int indeks = 0;
    /**
     * maxCr merupakan variabel yang digunakan untuk menampung
     * nilai terbesar (maksimal) dari color yang digunakan untuk vertex
     */
    int maxCr;
    /**
     * Graph() merupakan konstruktor dari class Graph yang akan
     * digunakan untuk membuat objek graph baru
     */
    Graph(){
        /**
         * head dan tail yang merupakan variabel untuk menandakan
         * vertex pertama(head) dan terakhir(tail) dari linkedlist vertex
         */
        head = tail = null;
    }
    /**
     *  addVertex merupakan method untuk menambahkan vertex baru pada linkedlist vertex 
     *  pada graph
     */
    void addVertex(String ver){
        /**
         * newVer merupakan objek vertex baru yang dibuat dengan class Vertex  dan konstruktor
         * Vertex(), dimana konstruktor akan mengoper nilai dari parameter method addVertex ke
         * elemen nama pada class Vertex
         */
        Vertex newVer = new Vertex(ver);
        /**
         * if merupakan statement control yang berfungsi 
         * mengontrol alurnya pemrograman. Saat kondisi pada 
         * if terpenuhi yaitu head == null, maka code pada 
         * badan if lah yang akan tereksekusi.
         */
        if(head == null){
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
         * nilai dari variabel indek akan diisi oleh variabel objek
         * newVer.idx pada class Vertex
         */
        newVer.idx = indeks;
        /**
         * variabel indeks di increment nilainya menjadi +=1
         */
        indeks++;
    }
    /**
     * findVertex merupkan method untuk mencari vertex, method ini akan
     * mencari dan mereturn Vertex yang nilainya sama dengan parameter ditemukan, jika tidak
     * ditemukan maka akan mereturn null
     */
    Vertex findVer(String find){
        /**
         * current merupakan variabel untuk membantu menunjuk posisi terkini
         * dari linkedlist, current akan menampung head;
         */
        current = head;
        /*while merupakan statement looping yang berfungsi
        untuk mengulang pengeksekusian code pada
        badan while selama syarat yaitu current!=null terpenuhi.
        */
        while(current != null){
            /**
             * if merupakan statement control yang berfungsi 
             * mengontrol alurnya pemrograman. Saat kondisi pada 
             * if terpenuhi yaitu current.nama == find, maka code pada 
             * badan if lah yang akan tereksekusi.
            */
            if(current.nama == find){
                /**
                 * return untuk mempassing vertex current ke method findVertex
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
    void addEdge(String ver, String ed){
        /**
         * variabel from yang bertipe data vertex memanggil method findVertex untuk mereturn
         * vertex yang memiliki nilai dengan parameter
         */
        Vertex Ver = findVer(ver);
        /**
         * variabel from yang bertipe data vertex memanggil method findVertex untuk mereturn
         * vertex yang memiliki nilai dengan parameter
         */
        Vertex Ed = findVer(ed);
        /**
         * temp merupakan variabel objek class Edge yang menapung edge lain yaitu Ver.edge
         */
        Edge temp = Ver.edge;
        /**
         * newEd merupakan variabel objek class Edge yang akan dibuat menggunakan class Edge
         * dan konstruktor Edge dan akan mempassing nilai to pada variabel vertex pada class Edge
         */
        Edge newEd = new Edge(Ed);
        /**
         * if merupakan statement control yang berfungsi 
         * mengontrol alurnya pemrograman. Saat kondisi pada 
         * if terpenuhi yaitu Ver.edge == null, maka code pada 
         * badan if lah yang akan tereksekusi.
         */
        if (Ver.edge == null){
            /**
             * Ver.edge merupakan variabel objek vertex from yang akan mengakses variabel
             * objek edge dan akan memuat variabel objek class Edge lain yaitu newEd
             */
            Ver.edge = newEd;
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
            while(temp.next != null){
                /**
                 * variabel temp akan menampung variabel temp selanjutnya
                 */
                temp = temp.next;
            }
            /**
             * variabel temp.next akan menampung variabel objek edge newEd
             */
            temp.next = newEd;
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
            System.out.print("\n"+current.nama+" -> ");
            /*while merupakan statement looping yang berfungsi
            untuk mengulang pengeksekusian code pada
            badan while selama syarat yaitu currEdge != null terpenuhi.
            */
            while(currEdge != null){
                /**
                 * system akan menampilkan currEdge.dest.nama+" " ke layar
                 */
                System.out.print(currEdge.dst.nama+" ");
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
        System.out.println("\n");
    }

    /**
     * graphColoring merupakan method yang digunakan untuk melakukan coloring
     * pada vertex graph. Method ini merupakan method void, yaitu method
     * yang tidak akan mengembalikan nilai apapun 
     */
    void graphColoring(){
        /**
         * colors merupakan variabel array dengan tipe data integer, digunakan untuk
         * menyimpan nilai yang akan di jadikan color pada vertex dengan batasan isi array
         * sebanyak 'indeks'
         */
        int colors[] = new int[indeks];
        /**
         * Arrays merupakan library pada java, dan fill merupakan method yang berada
         * pada library Arrays yang berfungsi untuk mengisi semua nilai pada 
         * variabel array colors menjadi -1
         */
        Arrays.fill(colors, -1);
        /**
         * variabel colors akan menapung nilai 0 pada indeks ke head.idx yaitu indeks dari
         * linkedlist vertex pertama
         */
        colors[head.idx] = 0;
        /**
         * available merupakan variabel array objek boolean yang digunakan untuk menandakan
         * vertex yang telah di berikan warna dengan batasan isi array sebanyak 'indeks'
         */
        boolean available[] = new boolean[indeks];
        /**
         * variabel bantu current akan menampung variabel head yaitu vertex pertama
         * pada linkedlist
         */
        current = head;
        /**
         * Arrays merupakan library pada java, dan fill merupakan method yang berada
         * pada library Arrays yang berfungsi untuk mengisi semua nilai pada 
         * variabel array available menjadi true
         */
        Arrays.fill(available, true);
        /*while merupakan statement looping yang berfungsi
        untuk mengulang pengeksekusian code pada
        badan while selama syarat yaitu current != null terpenuhi.
        */
        while(current != null){
            /**
             * variabel currEdge akan menampung nilai dari current.edge yang merupakan
             * edge dari vertex tempat variabel current berada
             */
            currEdge = current.edge;
            /*while merupakan statement looping yang berfungsi
            untuk mengulang pengeksekusian code pada
            badan while selama syarat yaitu current != null terpenuhi.
            */
            while(currEdge != null){
                /**
                 * i merupakan variabel Vertex yang akan menyimpan vertex yang
                 * terhubung dengan vertex current(tetangga current) melalui edge
                 */
                Vertex i = currEdge.dst;
                /**
                 * if merupakan statement control yang berfungsi 
                 * mengontrol alurnya pemrograman. Saat kondisi pada 
                 * if terpenuhi yaitu colors[i.idx] != -1, maka code pada 
                 * badan if lah yang akan tereksekusi.
                 */
                if(colors[i.idx] != -1){
                    /**
                     * variabel available yang merupakan variabel penanda kalau sebuah
                     * vertex telah diwarnai, akan mengisi nilai false pada vertex i
                     * dengan indeks idx jika vertex tersebut sudah mendapatkan warna.
                     */
                    available[colors[i.idx]] = false;
                }
                /**
                 * currEdge akan menampung nilai dari currEdge selanjutnya
                 * maksudnya posisi currEdge berpindah ke currEdge selajutnya
                 */
                currEdge = currEdge.next;
            }
            /**
             * cr merupakan variabel integer untuk menampung nilai sebagai warna
             * yang akan diberikan pada setiap vertex
             */
            int cr;
            /**
             * for merupakan statement loop yang berfungsi untuk melakukan perulangan
             * pengeksekusian code yang berada di dalam badan for. Pada for loop batasan
             * perulangan sudah diketahui yaitu sebanyak 'indeks'
             */
            for(cr = 0; cr<indeks;cr++){
                /**
                 * if merupakan statement control yang berfungsi 
                 * mengontrol alurnya pemrograman. Saat kondisi pada 
                 * if terpenuhi yaitu available[cr], maka code pada 
                 * badan if lah yang akan tereksekusi.
                 */
                if(available[cr])
                /**
                 * break berfungsi untuk memberhentikan pengeksekusian code pada 
                 * badan if dan for loop
                 */
                break;
            }
            /**
             * current yang menempati posisi terkini pada vertex akan mengakses variabel
             * color pada class vertex dan mengisinya dengan nilai pada variabel cr;
             */
            current.color = cr;
            /**
             * if merupakan statement control yang berfungsi 
             * mengontrol alurnya pemrograman. Saat kondisi pada 
             * if terpenuhi yaitu cr>maxCr, maka code pada 
             * badan if lah yang akan tereksekusi.
             */
            if(cr>maxCr){
                /**
                 * variabel maxCr digunakan untuk menampung nilai color terbesar
                 * yang ada pada vertex akan menapung nilai color terbesar itu pada
                 * variabel cr yang telah di cek terlebih dulu pada if apakah
                 * lebih besar atau tidak
                 */
                maxCr = cr;
            }
            /**
             * variabel array color akan menyimpan nilai dari variabel cr
             * pada indeks ke current.idx
             */
            colors[current.idx] = cr;
            /**
             * Arrays merupakan library pada java, dan fill merupakan method yang berada
             * pada library Arrays yang berfungsi untuk mengisi semua nilai pada 
             * variabel array available menjadi true
            */
            Arrays.fill(available, true);
            /*current merupakan sebuah variabel sebagai bantuan
            untuk menampung variabel current.next yaitu dia 
            sendiri sebagai variabel current yang mengakses variabel
            pointer next yaitu penunjuk ke node selanjutnya.
            */
            current = current.next;
        }
        /**
         * sistem akan menampilakan "Hasil Graph Coloring: " ke layar
         */
        System.out.println("Hasil Graph Coloring: ");
        /**
         * current merupakan variabel untuk membantu menunjuk posisi terkini
         * dari linkedlist, current akan menampung head;
         */
        current = head;
        /*while merupakan statement looping yang berfungsi
        untuk mengulang pengeksekusian code pada
        badan while selama syarat yaitu current != null terpenuhi.
        */
        while(current != null){
            /**
             * sistem akan menampilkan current.nama+": "+current.color pada layar
             */
            System.out.println(current.nama+": "+current.color);
            /*current merupakan sebuah variabel sebagai bantuan
            untuk menampung variabel current.next yaitu dia 
            sendiri sebagai variabel current yang mengakses variabel
            pointer next yaitu penunjuk ke node selanjutnya.
            */
            current = current.next;
        }
    }

    /**
     * tangki() merupakan method yang digunakan untuk mencetak vertex
     * yang memiliki warna sama dan pada implemetasiannya vertex 
     * nama-nama ikan yang memiliki warna sama akan diletakkan pada satu tangki
     */
    void tangki(){
        /**
         * for merupakan statement loop yang berfungsi untuk melakukan perulangan
         * pengeksekusian code yang berada di dalam badan for. Pada for loop batasan
         * perulangan sudah diketahui yaitu sebanyak 'maxCr'
         */
        for(int i=0;i<=maxCr;++i){
            //sistem akan menampilkan "\nTangki "+(i+1)+": " ke layar 
            System.out.print("\nTangki "+(i+1)+": ");
            /**
             * current merupakan variabel untuk membantu menunjuk posisi terkini
             * dari linkedlist, current akan menampung head;
             */
            current = head;
            /*while merupakan statement looping yang berfungsi
            untuk mengulang pengeksekusian code pada
            badan while selama syarat yaitu current != null terpenuhi.
            */
            while(current != null){
                /**
                 * if merupakan statement control yang berfungsi 
                 * mengontrol alurnya pemrograman. Saat kondisi pada 
                 * if terpenuhi yaitu i == current.color, maka code pada 
                 * badan if lah yang akan tereksekusi.
                 */
                if(i == current.color){
                    //sistem akan menampilkan current.nama+" " ke layar
                    System.out.print(current.nama+" ");
                }
                /*current merupakan sebuah variabel sebagai bantuan
                untuk menampung variabel current.next yaitu dia 
                sendiri sebagai variabel current yang mengakses variabel
                pointer next yaitu penunjuk ke node selanjutnya.
                */
                current = current.next;
            }
        }
    }
}
