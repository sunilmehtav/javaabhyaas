package com.udayan.dsa.graphs;

public class GraphAdjacencyMatrix {
	private int[][] adjacencyMatrix;
	private int numberOfVertices;
	
	public GraphAdjacencyMatrix(int numberOfVertices) {
		this.adjacencyMatrix = new int[numberOfVertices][numberOfVertices];
		this.numberOfVertices = numberOfVertices;
	}
	
	public void addEdge(int i, int j) {
		adjacencyMatrix[i][j] = 1;
		adjacencyMatrix[j][i] = 1;
	}
	
	public void removeEdge(int i, int j) {
		adjacencyMatrix[i][j] = 0;
		adjacencyMatrix[j][i] = 0;
	}
	
	public void printGraph() {
		for(int i = 0 ; i < numberOfVertices; i++) {
			for(int j = 0 ; j < numberOfVertices; j++) {
				System.out.print(adjacencyMatrix[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
		public static void main(String[] args) {
		GraphAdjacencyMatrix graph = new GraphAdjacencyMatrix(4);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 2);
		
		graph.printGraph();
		
	}
	
}
