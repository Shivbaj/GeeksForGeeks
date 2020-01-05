package com.geeksforgeeks.graphs;

import java.util.Iterator;
//Complete this pending problem
public class DetectCycle {
	
	static int numberOfVertices = 3;
    static Graph g = new Graph(numberOfVertices); 
	 public static void main(String args[]) 
	    { 
	  
	        g.addEdge(0, 1); 
	        g.addEdge(1, 2); 
	        g.addEdge(2, 3);
	        System.out.println("Following is Breadth First Traversal "+ 
	                           "(starting from vertex 2)"); 
	        int startVertex = 0;
	        DFS(startVertex); 
	    }
	public static void DFS(int startVertex) {
		boolean visited[] = new boolean[numberOfVertices];
		boolean rsult = dfsSearch(startVertex,visited,-1);
		System.out.print(rsult);	
		
	}
	public static boolean dfsSearch(int startVertex, boolean[] visited,int parent) {
		
		visited[startVertex] = true;
		Iterator<Integer> iterator = g.adjList[startVertex].listIterator();
		while(iterator.hasNext()) {
			int next = iterator.next();
		
			if(!visited[next])
				dfsSearch(next,visited,parent);
			else if(next!=parent)
				return true;
		}
		return false;
	}
}
