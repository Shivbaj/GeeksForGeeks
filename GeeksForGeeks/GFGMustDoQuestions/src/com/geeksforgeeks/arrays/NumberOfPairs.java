package com.geeksforgeeks.arrays;


//The pairs which follow x^y > y^x are as such


public class NumberOfPairs {

	public static void main (String[] args) 
	{ 
		int [] array1 = {2,1,6}; 
		int [] array2 = {1,5}; 
		numberOfPairs(array1,array2);
  
	}

	private static void numberOfPairs(int[] array1, int[] array2) {
		// TODO Auto-generated method stub
		int counter=0;
		for(int i=0;i<array1.length;i++) {
			int x= array1[i];
			for(int j=0;j<array2.length;j++)
			{
			    if(Math.pow(x, array2[j]) > Math.pow(array2[j],x))
			    	counter++;
			}
		}
		System.out.print(counter);
	}
}
