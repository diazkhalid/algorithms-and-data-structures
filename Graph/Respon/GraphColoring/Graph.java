package com.Modul_4.Respon.GraphColoring;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
    ArrayList<Vertex> vertices;
    int warna[];
    int ChromaticNo = -1;
    Graph(){
        vertices = new ArrayList<Vertex>();
    }
    public Vertex getVertex(String matkul){
        for (int i = 0; i < vertices.size(); i++) {
            if(vertices.get(i).matkul.equals(matkul)){
                return vertices.get(i);
            }
        }
        Vertex newVertex = new Vertex(matkul);
        vertices.add(newVertex);
        return newVertex;
    }
    public void addEdge(String matkulx, String matkuly){
        Vertex matkul1 = getVertex(matkulx); 
        Vertex matkul2 = getVertex(matkuly); 
        matkul1.edges.add(new Edge(matkul2)); 
        matkul2.edges.add(new Edge(matkul1)); 
    }
    public int getIndex(Vertex matkul){
        for (int i = 0; i < vertices.size(); i++) {
            if(vertices.get(i) == matkul){
                return i;
            }
        }
        return -1;
    }
    public void printAdjacency(){
        for (int i = 0; i < vertices.size(); i++) {
            Vertex current = vertices.get(i); 
            System.out.print(current.matkul + " --> "); 
            for (int j = 0; j < current.edges.size(); j++) {
                System.out.print(current.edges.get(j).destination.matkul + " ");
            }
            System.out.println();
        }
    }
    

    public void greedyColoring(){
        warna = new int[vertices.size()];
        Arrays.fill(warna, -1);
        warna[0] = 0;
        boolean tersedia[] = new boolean[vertices.size()];
        Arrays.fill(tersedia, true);

        for(int i = 1; i < vertices.size(); i++){
            Vertex current = vertices.get(i);

            for (int j = 0; j < current.edges.size(); j++) {
                Vertex edge = current.edges.get(j).destination; 

                int indeks = getIndex(edge); 
                if(warna[indeks] != -1){
                    tersedia[warna[indeks]] = false;
                }
            }
            int cr;
            for(cr = 0; cr < vertices.size(); cr++){
                if(tersedia[cr]){
                    break;
                }
            }
            if(cr > ChromaticNo){
                ChromaticNo = cr;
            }
            warna[i] = cr;
            Arrays.fill(tersedia, true);
        }
        System.out.println("\nHasil Graph Coloring: ");
        for (int i = 0; i < vertices.size(); i++) {
            System.out.println(vertices.get(i).matkul + ": " + warna[i]);
        }
    }
    public void jadwal(){
        for (int i = 0; i <= ChromaticNo; i++) {
          System.out.print("\nSesi "+(i+1)+": ");
            for (int j = 0; j < vertices.size(); j++) {
                if(i == warna[j]){
                    System.out.print(vertices.get(j).matkul + " ");
                }
            }
        }
        System.out.print("\n");
    }
}