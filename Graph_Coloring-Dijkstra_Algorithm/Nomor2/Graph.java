package com.Modul_5.Nomor2;

//mengimpor utilitas java yakni ArrayList dan Arrays ke dalam class Graph
//ArrayList menyediakan fungsi untuk membuat suatu object array list
//Arrays menyediakan fungsi untuk diterapkan pada suatu object berupa array
import java.util.ArrayList;
import java.util.Arrays;

//class Graph merupakan class yang merepresentasikan object graph dalam program
//class ini berisi method-method yang dapat diterapkan pada graph
public class Graph {
    //mendeklarasikan object ArrayList dengan tipe data Vertex dan identitas vertices
    //list ini akan digunakan untuk menyimpan vertex-vertex yang terdapat pada graph
    ArrayList<Vertex> vertices;

    //Graph() merupakan sebuah constructor yang digunakan untuk membuat obeject graph dalam keadaan kosong
    Graph(){
        //memanggil constructor ArrayList untuk membuat objek array list pada variabel vertices
        vertices = new ArrayList<Vertex>();
    }

    //method getVertex adalah method yang mencari suatu vertex berdasarkan suatu string
    //method ini akan mengembalikan sebuah vertex ketika dipanggil
    public Vertex getVertex(String kota){
        //melakukan perulangan untuk mencari vertex dalam list vertices
        for (int i = 0; i < vertices.size(); i++) {
            //menngecek ikan dari vertex pada indeks ke i, apakah sama dengan kota
            if(vertices.get(i).kota.equals(kota)){
                //mengembalikan nila vertex pada indeks i tersebut jika sama
                return vertices.get(i);
            }
        }
        //jika tidak ditemukan vertex dalam list vertices, maka dibuat vertex baru
        //mendeklarasikan object Vertex dengan identitas newVertex
        //variabel ini akan digunakan untuk menyimpan vertex baru yang akan dibuat
        //mamanggil constructor vertex dengan parameter kota sebagai nilai newVertex
        Vertex newVertex = new Vertex(kota);
        //menambahkan newVertex kedalam list vertices
        vertices.add(newVertex);
        //mengembalikan nilai vertex yang baru dibuat
        return newVertex;
    }

    //method addEdge adalah method yang digunakan untuk memasukan data edge ke dalam vertex
    //pemanggilan method ini akan membutuhkan dua parameter berupa String dan satu integer
    public void addEdge(String kotax, String kotay, int jarak){
        //mendeklarasikan Vertex kota1 dan kota2 untuk menyimpan vertex dari string kota x dan kota y
        Vertex kota1 = getVertex(kotax); //memanggil method getVertex berdasarkan string kota x sebagai nilai kota1
        Vertex kota2 = getVertex(kotay); //memanggil method getVertex berdasarkan string kota y sebagai nilai kota2

        //menambahkan edges pada vertex kota1 dan kota2
        //penambahan dilakukan dengan memanggil edges dari tiap vertex
        kota1.edges.add(new Edge(kota2, jarak)); //menambahkan kota2 sebagai Edge baru pada kota1
        kota2.edges.add(new Edge(kota1, jarak)); //menambahkan kota1 sebagai Edge baru pada kota2
    }
    //method getIndex digunakan untuk memperoleh indeks suatu vertex dalam list vertices
    public int getIndex(Vertex kota){
        //melakukan perulangan untuk mencari vertex dalam list vertices
        for (int i = 0; i < vertices.size(); i++) {
            //membandingkan nilai vertex pada indeks ke i dengan vertex kota
            if(vertices.get(i) == kota){
                //mengembalikan indeks dari vertex jika sama
                return i;
            }
        }
        //jika vertex tidak ditemukan maka dikembalikan nilai -1
        return -1;
    }

    //method printAdjecency adalah method yang digunakan untuk menampilkan adjecency dari tiap vertex dalam graph
    public void printAdjacency(){
        //melakukan perulangan untuk mendaftar vertex-vertex dalam list vertices
        for (int i = 0; i < vertices.size(); i++) {
            //mendeklarasikan vertex current untuk menyimpan vertex pada indeks ke i
            Vertex current = vertices.get(i); 

            System.out.print("Vertex : "); //statement ini akan menampilkan "Vertex : "
            System.out.print(current.kota + " --> \n"); //statement ini akan menampilkan nilai kota pada vertex current dan " --> "

            //melakukan perulangan untuk mendaftar vertex-vertex yang terhubung dengan vertex current
            for (int j = 0; j < current.edges.size(); j++) {
                //mendeklarasikan object Edge dengan identitas edge untuk menyimpan edge pada indeks ke j
                Edge edge = current.edges.get(j);

                //menampilkan vertex kota destination milik variabel edge
                System.out.print("\t" + edge.destination.kota);

                //menampilkan nilai variabel jarak dari edge
                System.out.println(" jarak: " + edge.jarak + "Km");
            }
            System.out.println(); //statement ini akan menampilkan baris baru
        }
    }

    //setJalan() merupakan method yang digunakan untuk mengatur nilai tersedia
    //pada setiap vertex dalam graph menjadi true
    public void setJalan(){
        //melakukan perulangan untuk mengakses semua vertex dalam graph
        for (int i = 0; i < vertices.size(); i++) {
            //menyimpan vertex ke i dalam variabel vertex temp
            Vertex temp = vertices.get(i);
            //melakukan perulangan untuk mengakses semua edge dari vertex temp
            for (int j = 0; j < temp.edges.size(); j++) {
                //memberikan nilai true pada variabel tersedia milik  edge ke j
                temp.edges.get(j).tersedia = true;
            }
        }
    }

    //method getEdge adalah method yang digunakan untuk memperoleh edge berdasarkan asal dan tujuannya
    public Edge getEdge(String asal, String tujuan){
        //mendeklarasikan Object edge dengan nilai null
        Edge edge = null;
        //melakukan perulangan untuk mengakses semua vertex dalam graph
        for (int i = 0; i < vertices.size(); i++) {
            //menyimpan vertex ke i dalam variabel vertex temp
            Vertex temp = vertices.get(i);
            //mengecek apakah temp merupakan vertex asal
            if(temp == getVertex(asal)){
                //jika iya maka lakukan perulangan untuk memperoleh edge-edge dari temp
                for (int j = 0; j < temp.edges.size(); j++) {
                    //menyimpan edge ke j dalam variabel edge
                    edge = temp.edges.get(j);
                    if(edge.destination == getVertex(tujuan)){
                        //jika destination dari edge merupakan vertex tujuan maka hentikan perulangan
                        break;
                    }
                }
            }
        }
        //mengembalikan nilai edge yang diperoleh
        return edge;      
    }
    //method setHari adalah method yang digunakan untuk mengatur jalan atau edge
    //yang tersedia berdasarkan hari yang diperoleh
    public void setHari(String hari){
        //memanggil method setJalan untuk mereset keadaan tersedia dari setiap edge
        setJalan();
        //menggunakan switch untuk mengecek nilai dari hari
        switch(hari){
            case "senin":
                //jika hari senin, maka edge dari Nigata ke Shiga atau sebaliknya tidak tersedia
                getEdge("Nigata", "Shiga").tersedia = false;
                getEdge("Shiga", "Nigata").tersedia = false;
                break;
            case "selasa":
                //jika hari selasa, maka edge dari Miyagi ke Chiba atau sebaliknya tidak tersedia
                getEdge("Miyagi", "Chiba").tersedia = false;
                getEdge("Chiba", "Miyagi").tersedia = false;
                break;
            case "rabu":
                //jika hari rabu, maka edge dari Nagano ke Gunma atau sebaliknya tidak tersedia
                getEdge("Nagano", "Gunma").tersedia = false;
                getEdge("Gunma", "Nagano").tersedia = false;
                break;
            case "kamis":
                //jika hari kamis, maka edge dari Miyagi ke Fukushima atau sebaliknya tidak tersedia
                getEdge("Miyagi", "Fukushima").tersedia = false;
                getEdge("Fukushima", "Miyagi").tersedia = false;
                break;
            case "jumat":
                //jika hari jumat, maka edge dari Miyagawa ke Fukushima atau sebaliknya tidak tersedia
                getEdge("Miyagawa", "Fukushima").tersedia = false;
                getEdge("Fukushima", "Miyagawa").tersedia = false;
                break;
            case "sabtu":
            case "minggu":
                //jika hari sabtu atau minggu, maka edge dari Fukuoka ke Nigata atau sebaliknya tidak tersedia
                //serta edge dari Osaka dan Saitama atau sebaliknya juga tidak tersedia
                getEdge("Fukuoka", "Nigata").tersedia = false;
                getEdge("Nigata", "Fukuoka").tersedia = false;
                getEdge("Osaka", "Saitama").tersedia = false;
                getEdge("Saitama", "Osaka").tersedia = false;
                break;
        }
    }
    //method dijkstra adalah method yang digunakan untuk memperoleh jarak terdekat dari
    //suatu vertex ke seluruh vertex lain dalam graph
    public void dijkstra(String kota, String tujuan, String hari){
        //memanggil method setHari untuk mengatur jalan yang tersedia pada hari tersebut
        setHari(hari);

        //membuat priority queue untuk menyimpan vertex yang akan diproses
        Queue pq = new Queue();

        //membuat array dist untuk menyimpan jarak suatu vertex dari vertex asal
        int dist[] = new int[vertices.size()];

        //menginisialisai seluruh jarak sebagai nilai maksimal dari integer
        Arrays.fill(dist, Integer.MAX_VALUE);

        //memperoleh vertex src (source) atau asal berdasarkan string kota
        Vertex src = getVertex(kota);

        //menyimpan vertex awal dalam priority queue 
        pq.push(src, 0);

        //memberikan nilai 0 sebagai jarak dari vertex awal ke vertex itu sendiri
        dist[getIndex(src)] = 0;

        //melakukan perulangan selama priority queue tersebut tidak kosong
        while(!pq.isEmpty()){
            //mengeluarkan vertex yang memiliki jarak terdekat dari vertex awal
            Vertex u = pq.pop();
            //melakukan perulangan untuk memperoleh edge-edge dari vertex yang sedang diproses
            for (int i = 0; i < u.edges.size(); i++) {
                //mengecek apakah edge ke i tersedia atau tidak
                if(u.edges.get(i).tersedia){
                    //membuat vertex edge untuk menyimpan vertex pada edge ke i
                    Vertex edge = u.edges.get(i).destination;
                    //membuat integer jarak untuk menyimpan jarak dari vertex u ke vertex edge
                    int jarak = u.edges.get(i).jarak;
                    //mengecek apakah ada jarak yang lebih pendek menuju edge melalui vertex u
                    if(dist[getIndex(edge)] > (dist[getIndex(u)] + jarak)){
                        //jika ada maka jarak vertex edge di update dengan jarak melalui vertex u
                        dist[getIndex(edge)] = dist[getIndex(u)] + jarak;
                        //menyimpan vertex edge dalam priority queue
                        pq.push(edge, dist[getIndex(edge)]);
                    }
                }
            }
        }
        System.out.println("Asal : " + kota); //statement ini menampilkan "Asal : " dan nilai dari string kota 
        System.out.println("Tujuan : " + tujuan); //statement ini menampilkan "Tujuan : " dan nilai dari string tujuan 
        System.out.println("Hari : " + hari); //statement ini menampilkan "Hari : " dan nilai dari string hari 
        //menampilkan nilai dari variabel dist pada indeks ke (indeks dari vertex tujuan)
        System.out.print(dist[getIndex(getVertex(tujuan))]); 
        System.out.println(" jam perjalanan\n"); //statement ini menampilkan " jam perjalanan"
    }
}
