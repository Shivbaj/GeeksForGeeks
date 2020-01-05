package com.geeksforgeeks.graphs;

public class ShortesSourceToDestinationpath {
	static int numberOfVertices = 4;
    static Graph g = new Graph(numberOfVertices); 
	public static void main(String args[]) 
    { 
  
       int[][] inputMatrix = new int[][] {{1, 0, 0,0},
    	   								{1, 1, 0, 1},
    	   								{0, 1, 1, 1}};
        int rows = 3;
        int columns= 4 ;
        int detination_value = inputMatrix[2][3];
        int maxSteps = findMaxSepsToDestination(inputMatrix,rows,columns,detination_value);
        System.out.print(maxSteps);
    }
	public static int findMaxSepsToDestination(int[][] inputMatrix, int rows, int columns, int detination_value) {
		boolean visitedNodes[][] = new boolean[rows][columns];
		int maxSteps=0;
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)
				 if (inputMatrix[i][j] == 1 && !visitedNodes[i][j]) 
                 { 
					 maxSteps = steptoDestination(inputMatrix,i,j,detination_value,maxSteps,visitedNodes); 
                    // ++maxSteps; 
                 } 
				
		return maxSteps;
	}
	private static int  steptoDestination(int[][] inputMatrix, int i, int j, int detination_value, int maxSteps,boolean visitedNodes[][] ) {
		
		 // These arrays are used to get row and column numbers 
        // of 8 neighbors of a given cell 
        int rowNbr[] = new int[] {  -1, 0, 0,  1 }; 
        int colNbr[] = new int[] {   0, -1, 1, 0 }; 
        if(inputMatrix[i][j]==detination_value)
        	return maxSteps;
        
        // Mark this cell as visited 
        visitedNodes[i][j] = true; 
        maxSteps++;
        //Recur for all connected neighbours
        for (int k = 0; k < 4; ++k) {
        if((i >= 0) && (i <  inputMatrix[0].length) && (j >= 0) && (j < inputMatrix.length) && (inputMatrix[i][j] == 1 && !visitedNodes[i][j]))
        	steptoDestination(inputMatrix, i + rowNbr[k], j + colNbr[k], detination_value,maxSteps,visitedNodes);
        }
        return maxSteps;
	}

}
