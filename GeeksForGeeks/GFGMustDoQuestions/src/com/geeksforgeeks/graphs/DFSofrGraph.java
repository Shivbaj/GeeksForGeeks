package com.geeksforgeeks.graphs;

import java.util.Iterator;

public class DFSofrGraph {

	static int numberOfVertices = 4;
    static Graph g = new Graph(numberOfVertices); 
	public static void main(String args[]) 
    { 
  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        System.out.println("Following is Depth First Traversal "+ 
                           "(starting from vertex 2)"); 
        int startVertex = 2;
        DFS(startVertex,numberOfVertices); 
    }

	// The function to do DFS traversal. It uses recursive DFSUtil() 
	public static void DFS(int startVertex,int numberOfVertices) {
		// Mark all the vertices as not visited(set as 
        // false by default in java) 
        boolean visited[] = new boolean[numberOfVertices]; 
        findDfs(startVertex,visited);
		
	}

	public static void findDfs(int startVertex, boolean[] visited) {
		// TODO Auto-generated method stub
		visited[startVertex] = true;
		 System.out.print(startVertex+" "); 
		 //Check all the vertices adjacent to this source 
		 // Recur for all the vertices adjacent to this vertex 
		 	Iterator<Integer> iterator = g.adjList[startVertex].listIterator();
	        while (iterator.hasNext()) 
	        { 
	            int nextNode = iterator.next(); 
	            if (!visited[nextNode]) 
	            	findDfs(nextNode, visited); 
	        } 
	} 
}
