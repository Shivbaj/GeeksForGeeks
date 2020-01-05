package com.geeksforgeeks.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MergerWithoutExtraSpaces {
	  public static void main (String[] args) {
		  Scanner sc = new Scanner(System.in);
		    int countOfTesCase = sc.nextInt();
		    for(int p = 0; p < countOfTesCase; p++){
		        int sizeOfArray1 = sc.nextInt();
		        int sizeOfArray2 = sc.nextInt();
		        int array1[] = new int[sizeOfArray1];
		        int array2[] = new int[sizeOfArray2];
		        for(int i=0; i<sizeOfArray1; i++){
		        	array1[i] = sc.nextInt();
		            
		        }
		        for(int i=0; i<sizeOfArray2; i++){
		        	array2[i] = sc.nextInt();
		            
		        }
		        int val = mergeArrays(array1,array2,sizeOfArray1,sizeOfArray2);
		        System.out.print(val);
		   
		    
		    }
			
		}

	private static int mergeArrays(int[] array1, int[] array2, int sizeOfArray1, int sizeOfArray2) {
		for(int i=sizeOfArray2;i>0;i--)
		{
			/* Find the smallest element greater than array2[i]. Move all 
            elements one position ahead till the smallest greater 
            element is not found */
			int element = array2[i];
			for(int j=sizeOfArray2;j>0;j--)
			{
				if(array1[j]>element)
				{
					array2[i] = array1[j];
					array1[j] = element;
				}
			}
		}
        
		return 0;
	}
}
