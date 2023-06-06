package com.udayan.dsa.graphs;

import java.util.ArrayList;
import java.util.List;

public class GraphBFS {
	private List<String> adjacentList[];
	private int numberOfVertices;
	
	public GraphBFS(int numberOfVertices) {
		this.adjacentList = new ArrayList[numberOfVertices];
		this.numberOfVertices = numberOfVertices;
		for(int i = 0; i < numberOfVertices; i++) {
			this.adjacentList[i]= new ArrayList();
		}
	}
	
	public void addEdge(String from, String to) {
		
	}
	

}
