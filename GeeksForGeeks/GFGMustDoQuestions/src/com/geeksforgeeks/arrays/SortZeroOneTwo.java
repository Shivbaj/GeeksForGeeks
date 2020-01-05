package com.geeksforgeeks.arrays;

import java.util.Arrays;

public class SortZeroOneTwo {

	
	public static void main (String[] args) 
{ 
    int [] array = {0,2, 1, 2, 0}; 
    sortZeroOnetwo(array); 
   
}

	private static void sortZeroOnetwo(int[] array) {
		// TODO Auto-generated method stub
		Arrays.sort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
	}
}
