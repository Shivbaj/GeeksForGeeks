package com.geeksforgeeks.arrays;

import java.util.Arrays;

public class InversionOfArray {
	public static int counter=0;
	public static void main (String[] args) 
	{ 
		int [] array = {468,335,1,170,225,479,359,463,465,206,146,282,328,462,492,496,443,328,437,392,105,403,154,293,383,422,217,219,396,448,227,272,39,370,413,168,300,36,395,204,312,323}; 
		inversionOfArray(array);
  
	}

	private static void inversionOfArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if( array[i]>array[j])
				{
					//swap elementToStart with a[j]
					
					counter++;
				}
			}
		}
		System.out.print(counter);
	} 
}
