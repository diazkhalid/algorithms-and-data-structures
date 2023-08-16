package com.Modul_4.Respon.GraphColoring;

import java.util.ArrayList;

public class Vertex {
    String matkul;
    ArrayList<Edge> edges;
    Vertex(String matkul){
        this.matkul = matkul;
        edges = new ArrayList<Edge>();
    }
}