package com.geeksforgeeks.graphs;

import java.util.LinkedList;

public class Graph {
	
	public int nodes;
	// Array  of lists for Adjacency List Representation 
	public LinkedList<Integer> adjList[] ;
	
	Graph(int noOfNodes){
			nodes = noOfNodes;
			adjList = new LinkedList[noOfNodes];
			for(int i=0;i<noOfNodes;i++) {
				adjList[i] = new LinkedList();
			}
	}

	public void addEdge(int fromNode, int toNode) {
		// TODO Auto-generated method stub
		adjList[fromNode].add(toNode);
		
	}

}
