package com.geeksforgeeks.arrays;

import java.util.Arrays;

public class RearrangeArrayAlternately {
	
	public static void main (String[] args) 
	{ 
		int [] array = {1,2,3,4,5,6}; 
		rearrangeArray(array);
  
	}

	private static void rearrangeArray(int[] array) {
		Arrays.sort(array);
		int i=0;
	    int leftpointer = 0;
	    int rightpointer = array.length-1;
	    int[] newArray = new int[array.length];
	    while(rightpointer>leftpointer)
	    {
	    	newArray[i++] = array[rightpointer];
	    	rightpointer--;
	    	newArray[i++] = array[leftpointer];
	    	leftpointer++;
	    }
	    for(int j=0;j<newArray.length;j++)
	    {
	    	System.out.print(newArray[j]);
	    }
		
	} 

}
