package com.udayan.dsa.graphs;

public class Main {
    public static void main(String[] args) {

        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");
        System.out.println("\nGraph before addEdge():");
        myGraph.printGraph();


        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("B", "D");
        myGraph.addEdge("C", "D");
        System.out.println("\nGraph after addEdge():");
        myGraph.printGraph();
        //myGraph.removeEdge("A", "B");
        myGraph.removeVertex("D");
        myGraph.printGraph();
    }
}
