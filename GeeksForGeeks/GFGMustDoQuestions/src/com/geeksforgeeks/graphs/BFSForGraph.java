package com.geeksforgeeks.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFSForGraph {

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
	  
	        System.out.println("Following is Breadth First Traversal "+ 
	                           "(starting from vertex 2)"); 
	        int startVertex = 2;
	        BFS(startVertex); 
	    }
	private static void BFS(int startVertex) {
		boolean visited[] = new boolean[numberOfVertices];
		
		//Create q queue for BFS
		Queue<Integer> queue = new LinkedList<Integer>();
		 // Mark the current node as visited and enqueue it 
        visited[startVertex]=true; 
        queue.add(startVertex); 
        while(queue.size() != 0) {
        	// Dequeue a vertex from queue and print it 
        	startVertex   = queue.poll(); 
            System.out.print(startVertex+" "); 
            Iterator<Integer>  iterator = g.adjList[startVertex].listIterator();
            while(iterator.hasNext()) {
            	int nextNode = iterator.next();
            	if (!visited[nextNode]) 
                { 
                    visited[nextNode] = true; 
                    queue.add(nextNode); 
                } 
            }
        }
        
		
	} 
}
