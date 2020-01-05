package com.geeksforgeeks.arrays;

import java.util.Arrays;

public class RainWaterTrapping {
	
public static void main (String[] args) 
{ 
    int [] array = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}; 
    int sizeOfArray=12;
    int num = findWater(array,sizeOfArray); 
    System.out.print(num);
}
//wrong logic , works for few test cases
	private static int amountOfRainWaterTrapped(int[] array, int sizeOfArray) {
		// TODO Auto-generated method stub
		int totalAmountOfRainWater =0;
		int maxElement = array[0];
		for(int i=1;i<array.length;i++) {
			if(maxElement>array[i])
			{
				totalAmountOfRainWater = totalAmountOfRainWater+(maxElement-array[i]);
			}
			else
				maxElement = array[i];
		}
		return totalAmountOfRainWater;
	}

	//Correct DP logic 
	public static int findWater(int[] array,int n) 
	    { 
	        // left[i] contains height of tallest bar to the 
	        // left of i'th bar including itself 
	        int left[] = new int[n]; 
	  
	        // Right [i] contains height of tallest bar to 
	        // the right of ith bar including itself 
	        int right[] = new int[n]; 
	  
	        // Initialize result 
	        int water = 0; 
	  
	        // Fill left array 
	        left[0] = array[0]; 
	        for (int i = 1; i < n; i++) 
	            left[i] = Math.max(left[i - 1], array[i]); 
	        

	        for (int i = 0; i < n; i++) 
	           System.out.print(left[i]); 
	  

	        System.out.print("\n\n"); 
	        // Fill right array 
	        right[n - 1] = array[n - 1]; 
	        for (int i = n - 2; i >= 0; i--) 
	            right[i] = Math.max(right[i + 1], array[i]); 
	        

	        for (int i = 0; i < n; i++) 
	           System.out.print(right[i]); 
	  

	        System.out.print("\n\n"); 
	        // Calculate the accumulated water element by element 
	        // consider the amount of water on i'th bar, the 
	        // amount of water accumulated on this particular 
	        // bar will be equal to min(left[i], right[i]) - arr[i] . 
	        for (int i = 0; i < n; i++) 
	            water += Math.min(left[i], right[i]) - array[i]; 
	  
	        return water; 
	    } 
	 
}
