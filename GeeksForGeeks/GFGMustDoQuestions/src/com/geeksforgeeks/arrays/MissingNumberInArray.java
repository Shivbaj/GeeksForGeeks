package com.geeksforgeeks.arrays;

import java.util.Scanner;

public class MissingNumberInArray {
	public static void main (String[] args) {
		  Scanner sc = new Scanner(System.in);
		    int countOfTesCase = sc.nextInt();
		    for(int p = 0; p < countOfTesCase; p++){
		        int size = sc.nextInt();
		        int array[] = new int[size-1];
		        for(int i=0; i<size-1; i++){
		            array[i] = sc.nextInt();
		            
		        }
		        int val = missingNumber(array,size);
		        System.out.print(val);
		   
		    
		    }
			
		}
		public static int missingNumber(int[] array,int size){
		   int i, total; 
	        total = (size) * (size + 1) / 2; 
	        for (i = 0; i < array.length; i++) 
	            total -= array[i]; 
	        return total; 
		}
    
}
