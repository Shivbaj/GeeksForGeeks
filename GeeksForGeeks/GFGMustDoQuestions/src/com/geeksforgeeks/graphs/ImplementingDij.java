package com.geeksforgeeks.graphs;

public class ImplementingDij {
    static int noOfVertex = 3;
	 public static void main(String args[]) 
	    { 
	        int[][] input = new int[][] {{0 ,1, 43 },
	        							 {1, 0, 6},
	        							 {43,6, 0}};
	 
	        int source = 2;
	        dij(input,source,noOfVertex);
	    }

	public static void dij(int[][] input, int source, int noOfVertex) {
		// Create a distance array hold shortest distance from source to i
		int distance[] = new int[noOfVertex];
		Boolean[] visitedAndIncludedvertex = new Boolean[noOfVertex];
		for(int i=0;i<noOfVertex;i++) {
			distance[i] = Integer.MAX_VALUE;
			visitedAndIncludedvertex[i] = false;
		}
		 // Distance of source vertex from itself is always 0 
		distance[source] = 0; 
  
		for(int count=0;count<noOfVertex-1;count++) {
			// Pick the minimum distance vertex from the set of vertices 
            // not yet processed. u is always equal to src in first 
            // iteration. 
            int u = minDistance(distance, visitedAndIncludedvertex); 
            // Mark the picked vertex as processed 
            visitedAndIncludedvertex[u] = true; 
  
            // Update dist value of the adjacent vertices of the 
            // picked vertex. 
            for(int vertex=0;vertex<noOfVertex;vertex++) {
            	 // Update dist[v] only if is not in sptSet, there is an 
                // edge from u to v, and total weight of path from src to 
                // v through u is smaller than current value of dist[v] 
            	if(!visitedAndIncludedvertex[vertex] &&  distance[u]!= Integer.MAX_VALUE && input[u][vertex]!=0 && (distance[u] + input[u][vertex] < distance[vertex])
            			) {
            		 distance[vertex] = distance[u] + input[u][vertex]; 
            	}
            }
            	
		}
		
	}

	 // A utility function to find the vertex with minimum distance value, 
    // from the set of vertices not yet included in shortest path tree 
	public static int minDistance(int[] distance, Boolean[] visitedAndIncludedvertex) {
		int min = Integer.MAX_VALUE, min_index = -1;
		for(int i=0;i<noOfVertex;i++) {
			if(!visitedAndIncludedvertex[i] && distance[i]<= min) {
				 min = distance[i]; 
	              min_index = i; 
			}
		}
		return min;
	}

}
