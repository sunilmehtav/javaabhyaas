package com.udayan.dsa.graphs;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjacencyList {
    private List<Integer>[] adjacencyList;
    private int numberOfVertices;

    public GraphAdjacencyList(int numberOfVertices) {
        this.adjacencyList = new ArrayList[numberOfVertices];
        this.numberOfVertices = numberOfVertices;
        for (int i = 0; i < this.numberOfVertices; i++) {
            this.adjacencyList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int i, int j) {
        adjacencyList[i].add(j);
        adjacencyList[j].add(i);
    }

    public void printGraph() {
        for (int i = 0; i < numberOfVertices; i++) {
            System.out.print(adjacencyList[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphAdjacencyList graph = new GraphAdjacencyList(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);

        graph.printGraph();

    }
}
