package com.Modul_4.Respon.GraphColoring;

public class Main {
    public static void main(String[] args) {

      Graph graph = new Graph();

      
        graph.addEdge("Algodat", "Alpro"); 
        graph.addEdge("Algodat", "Sisdig"); 
        graph.addEdge("Alpro", "Sisdig");
        graph.addEdge("Alpro", "Jarkom"); 
        graph.addEdge("Sisdig", "SBD"); 
        graph.addEdge("Sisdig", "Jarkom"); 
        graph.addEdge("SBD", "Metnum"); 
        graph.addEdge("Jarkom", "Metnum"); 

        graph.printAdjacency(); 
        graph.greedyColoring();
        graph.jadwal();
    }
}