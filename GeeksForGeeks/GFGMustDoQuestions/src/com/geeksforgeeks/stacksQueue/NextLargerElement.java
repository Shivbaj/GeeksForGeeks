package com.geeksforgeeks.stacksQueue;

public class NextLargerElement {
	
	public static void main(String[] args) {
		int array[] = {1, 3, 2, 4};
		printArrayWithNextGreater(array);
	}

	private static void printArrayWithNextGreater(int[] array) {
		// TODO Auto-generated method stub
		 int next;
		for(int i=0;i<array.length;i++) {
			 next = -1; 
			int elementToCheck = array[i];
			for(int j =i+1; j<array.length;j++) {
				if(elementToCheck<array[j]) {
					next = array[j];
					break;
				}
			}
			System.out.println(array[i]+" -- "+next); 
		}
	}

}
