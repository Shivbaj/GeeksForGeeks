package com.geeksforgeeks.graphs;

public class NoOfIsland {

	 public static void main(String args[]) 
	    { 
	  
	        int[][] input = new int[][] {{1,1,0},
	        							 {0,0,1},
	        							 {1,0,1}};
	        int sizeOfMatrix = 3;
	        int noOfIslandPresent = findIslands(input,sizeOfMatrix);
	    }

	public static int findIslands(int[][] input, int sizeOfMatrix) {
		// Make a bool array to mark visited cells. 
        // Initially all cells are unvisited 
        boolean visited[][] = new boolean[sizeOfMatrix][sizeOfMatrix]; 
        // Initialize count as 0 and travese through the all cells 
        // of given matrix 
        int count = 0; 
        for (int i = 0; i < sizeOfMatrix; ++i) {
            for (int j = 0; j < sizeOfMatrix; ++j) {
            	  if (input[i][j] == 1 && !visited[i][j]) 
                  { 
                      DFS(input, i, j, visited); 
                      ++count; 
                  } 
            }
        }
		
		return count;
	}

	public static void DFS(int[][] input, int row, int col, boolean[][] visited) {
		

        // These arrays are used to get row and column numbers 
        // of 8 neighbors of a given cell 
        int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 }; 
        int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 }; 
  
        // Mark this cell as visited 
        visited[row][col] = true; 
        //Recur for all connected neighbours
        for (int k = 0; k < 8; ++k) {
        if((row >= 0) && (row < input.length) && (col >= 0) && (col < input.length) && (input[row][col] == 1 && !visited[row][col]))
        	DFS(input, row + rowNbr[k], col + colNbr[k], visited);
        }
	}

	
}
